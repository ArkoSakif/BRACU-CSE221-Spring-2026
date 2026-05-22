import java.io.*;
import java.util.*;
public class TaskC {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        long a=Long.parseLong(sc1.nextToken());
        long b=Long.parseLong(sc1.nextToken());
        long result=1;
        while(b>0){
            if((b&1)==1){
            result=(result*a)%107;
            b--;
            }
            else{
                a=(a*a)%107;
                b>>=1;
            }
        }
        pw.print(result);
        pw.flush();
        pw.close();
    }
}
