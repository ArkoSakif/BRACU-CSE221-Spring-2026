import java.io.*;
import java.util.*;
public class TaskA {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw =new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(sc1.nextToken());
        int target=Integer.parseInt(sc1.nextToken());
        int arr1[]=new int[n];
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i]=Integer.parseInt(sc2.nextToken());
        }
        int left=0;
        int right=n-1;
        while(left<right){
        int sum=arr1[left]+arr1[right];
        //if value found
        if(sum==target){
        pw.print((left+1)+" "+(right+1));
        pw.flush();
        pw.close();
        return;
        }
        else if(sum>target)
            right--;
        else
            left++;
        }
    pw.println(-1);//prints -1 if no value is found
    pw.flush();
    pw.close();
    }
}
