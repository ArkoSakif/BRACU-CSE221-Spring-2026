import java.io.*;
import java.util.*;
public class TaskD {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n1=Integer.parseInt(br.readLine());
        StringTokenizer in1=new StringTokenizer(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        StringTokenizer in2=new StringTokenizer(br.readLine());
        int alice[]=new int[n1];
        int bob[]=new int[n2];
        for (int i = 0; i < n1; i++) {
        alice[i]=Integer.parseInt(in1.nextToken());
        }
        for (int i = 0; i < n2; i++) {
        bob[i]=Integer.parseInt(in2.nextToken());
        }
        int l1=0;
        int l2=0;
        int finalArr[]=new int[n1+n2];
        int index=0;
        while(l1<n1&&l2<n2){
        if(alice[l1]>bob[l2])
            finalArr[index++]=bob[l2++];

        else
            finalArr[index++]=alice[l1++];
        }
        while(l1<n1) {
            finalArr[index++] = alice[l1++];
        }
        while(l2<n2){
            finalArr[index++]=bob[l2++];
        }
        for (int i = 0; i < finalArr.length; i++) {
            pw.print(finalArr[i]+" ");
        }
        pw.flush();
        pw.close();
    }

}
