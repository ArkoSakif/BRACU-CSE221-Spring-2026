import java.util.*;
import java.io.*;
public class TaskE {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc=new StringTokenizer(br.readLine());
        int vertices=Integer.parseInt(sc.nextToken());
        int edges=Integer.parseInt(sc.nextToken());
        int inDegree[]=new int[vertices+1];
        int outDegree[]=new int[vertices+1];
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        for (int i = 0; i < edges; i++) {
            int a=Integer.parseInt(sc1.nextToken());
            int b=Integer.parseInt(sc2.nextToken());
            outDegree[a]++;
            inDegree[b]++;
        }
        for (int i = 1; i < inDegree.length; i++) {
            pw.print((inDegree[i]-outDegree[i])+" ");
        }
        pw.flush();
        pw.close();
    }
}
