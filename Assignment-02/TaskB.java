import java.io.*;
import java.util.*;
public class TaskB {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int n1=Integer.parseInt(sc1.nextToken());
        int n2=Integer.parseInt(sc1.nextToken());
        int target=Integer.parseInt(sc1.nextToken());
        StringTokenizer firstArr=new StringTokenizer(br.readLine());
        StringTokenizer secArr=new StringTokenizer(br.readLine());
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for (int i = 0; i < n1; i++) {
            arr1[i]=Integer.parseInt(firstArr.nextToken());
        }
        for (int i = 0; i < n2; i++) {
            arr2[i]=Integer.parseInt(secArr.nextToken());
        }
        int l1=0;
        int l2=n2-1;
        int minIdx1=l1+1;
        int minIdx2=l2+1;
        int closest=Math.abs((arr1[l1]+arr2[l2])-target);
        while(l1<n1&&l2>=0){
            if(arr1[l1]+arr2[l2]==target){
                pw.print((l1+1)+" "+(l2+1));
                pw.flush();
                pw.close();
                return;
            }
            int sum=arr1[l1]+arr2[l2];
            int diff=Math.abs(sum-target);
            if(diff<closest){
                minIdx1=l1+1;
                minIdx2=l2+1;
                closest=diff;
            }
            if(sum>target)
                l2--;
            else
                l1++;
        }
        pw.println(minIdx1+" "+minIdx2);
        pw.flush();
        pw.close();
    }
}
