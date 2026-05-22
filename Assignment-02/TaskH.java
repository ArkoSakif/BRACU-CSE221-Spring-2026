import java.util.*;
import java.io.*;
public class TaskH {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer sc1=new StringTokenizer(br.readLine());
            int k=Integer.parseInt(sc1.nextToken());
            int x=Integer.parseInt(sc1.nextToken());
            int val=k+Math.floorDiv((k-1),(x-1));
            pw.println(val);
        }
        pw.flush();
        pw.close();

    }
}
