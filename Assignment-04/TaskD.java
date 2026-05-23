import java.util.*;
import java.io.*;
public class TaskD {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc=new StringTokenizer(br.readLine());
        int vertices=Integer.parseInt(sc.nextToken());
        int edges=Integer.parseInt(sc.nextToken());
        int countArr[]=new int[vertices+1];
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        for (int i = 0; i < edges; i++) {
            int a=Integer.parseInt(sc1.nextToken());
            int b=Integer.parseInt(sc2.nextToken());
            countArr[a]++;
            countArr[b]++;
        }
        int oddCounter=0;
        for (int i = 1; i < countArr.length; i++) {
            if(countArr[i]%2==1)
                oddCounter++;
        }
        if(oddCounter==0 || oddCounter==2)
            pw.print("YES");
        else
            pw.print("NO");
        pw.flush();
        pw.close();
    }
}
