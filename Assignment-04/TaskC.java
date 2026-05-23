import java.util.*;
import java.io.*;
public class TaskC {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int vertices=Integer.parseInt(br.readLine());
        int [][] adjMat=new int[vertices][vertices];
        for(int i=0;i<vertices;i++){
            StringTokenizer sc=new StringTokenizer(br.readLine());
            int nodes=Integer.parseInt(sc.nextToken());
            for(int j=0;j<nodes;j++){
                int connect=Integer.parseInt(sc.nextToken());
                adjMat[i][connect]=1;
            }
        }
        for (int i = 0; i < adjMat.length; i++) {
          for (int j = 0; j < adjMat.length; j++) {
            pw.print(adjMat[i][j]+" ");
          }
         pw.println();
        }
        pw.flush();
        pw.close();
    }
}
