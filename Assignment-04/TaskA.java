import java.util.*;
import java.io.*;
public class TaskA{
  public static void main(String [] args) throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    StringTokenizer sc1=new StringTokenizer(br.readLine());
    int vertices=Integer.parseInt(sc1.nextToken());
    int edges=Integer.parseInt(sc1.nextToken());
    int adjMat[][]=new int[vertices][vertices];
    for (int i = 0; i < edges; i++) {
      StringTokenizer connect=new StringTokenizer(br.readLine());
      int a=Integer.parseInt(connect.nextToken())-1;
      int b=Integer.parseInt(connect.nextToken())-1;
      int w=Integer.parseInt(connect.nextToken());
      adjMat[a][b]=w;   
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
