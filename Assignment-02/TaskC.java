import java.io.*;
import java.util.*;
public class TaskC {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(sc1.nextToken());
        int target=Integer.parseInt(sc1.nextToken());
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        int arr1[][]=new int[n][2];
        for (int i = 0; i < n; i++) {
            arr1[i][0]=Integer.parseInt(sc2.nextToken());
            arr1[i][1]=i+1;
        }
        Arrays.sort(arr1,(a,b)->Integer.compare(a[0],b[0]));
        for (int i = 0; i < n-2; i++) {
            int left=i+1; int right=n-1;
            while(left<right){
                long sum=(long)(arr1[i][0]+arr1[left][0]+arr1[right][0]);
                if(sum==(long)target){
                    pw.println(arr1[i][1]+ " " + arr1[left][1] + " " + arr1[right][1]);
                    pw.flush();
                    pw.close();
                    return;
                }
                if(sum>(long)target)
                    right--;
                else
                    left++;
            }
        }
        System.out.println(-1);
        pw.flush();
        pw.close();
    }
}
