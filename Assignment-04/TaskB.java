import java.util.*;
import java.io.*;
public class TaskB {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc=new StringTokenizer(br.readLine());
        int vertices=Integer.parseInt(sc.nextToken());
        int edges=Integer.parseInt(sc.nextToken());
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        StringTokenizer sc3=new StringTokenizer(br.readLine());
        ArrayList<int []> []adj=new ArrayList[vertices+1];
        for (int i = 0; i < adj.length; i++) {
            adj[i]=new ArrayList<>();
        }
        for (int i = 0; i < edges; i++) {
            int a=Integer.parseInt(sc1.nextToken());
            int b=Integer.parseInt(sc2.nextToken());
            int w=Integer.parseInt(sc3.nextToken());
            int []arr={b,w};
            adj[a].add(arr);
        }
        for (int i = 1; i < adj.length; i++) {
            pw.print(i+": ");
            for (int j = 0; j < adj[i].size(); j++) {
                int[] arr1=adj[i].get(j);
                pw.print("("+arr1[0]+","+arr1[1]+") ");
            }
            pw.println();
        }
        pw.flush();
        pw.close();
    }
}
