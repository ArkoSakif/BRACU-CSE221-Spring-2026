import java.util.*;
import java.io.*;
public class TaskH {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc=new StringTokenizer(br.readLine());
        int vertices=Integer.parseInt(sc.nextToken());
        int queries=Integer.parseInt(sc.nextToken());
        ArrayList<Integer> []adjList=new ArrayList[vertices+1];
        for (int i = 1; i <=vertices ; i++) {
            adjList[i]=new ArrayList<>();
            for (int j = 1; j <=vertices ; j++) {
                if(i!=j && gcd(i,j)==1){
                   adjList[i].add(j);
                }
            }
        }
        for (int i = 1; i <=queries; i++) {
            StringTokenizer sc1=new StringTokenizer(br.readLine());
            int node=Integer.parseInt(sc1.nextToken());
            int k=Integer.parseInt(sc1.nextToken());
            if(adjList[node].size()>=k && k>0)
              pw.println(adjList[node].get(k-1));
            else
                pw.println(-1);
        }
        pw.flush();
        pw.close();
    }
    private static int gcd(int a,int b){
        while(b != 0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
