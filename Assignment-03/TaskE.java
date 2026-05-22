import java.util.*;
import java.io.*;
public class TaskE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer sc1 = new StringTokenizer(br.readLine());
            long a = Long.parseLong(sc1.nextToken());
            long n = Long.parseLong(sc1.nextToken());
            long m = Long.parseLong(sc1.nextToken());
            long res=sumOfPowers(a,n,m);
            pw.println(res);
        }
        pw.flush();
        pw.close();
    }
    public static long sumOfPowers(long a,long n,long m){
        if(n==0) return 0;
        if(n==1) return a%m;
        if(n%2==0){
            long halfSum=sumOfPowers(a, n/2, m);
            long powerHalf=pow(a,n/2,m);
            return (halfSum*(1+powerHalf))%m;
        }
        else{
            long res=(sumOfPowers(a,n-1,m)+pow(a,n,m))%m;
            return res;

        }

    }
    public static long pow(long a,long b,long m){
        long result=1;
        while(b>0){
            if((b&1)==1){
                result=(result*a)%m;
                b--;
            }
            else{
                a=(a*a)%m;
                b>>=1;
            }
        }
        return result;
    }
}
