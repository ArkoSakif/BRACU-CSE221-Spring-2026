import java.util.*;
import java.io.*;
public class TaskG {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int len=Integer.parseInt(sc1.nextToken());
        int t=Integer.parseInt(sc1.nextToken());
        StringTokenizer userIn=new StringTokenizer(br.readLine());
        int arr1[]=new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i]=Integer.parseInt(userIn.nextToken());
        }
        for (int i = 0; i < t; i++) {
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        int l=Integer.parseInt(sc2.nextToken()); int r=Integer.parseInt(sc2.nextToken());
        int count=0;
        int left=findLeftIndx(arr1,l);int right=findRightIndex(arr1,r);
        pw.println(right-left);
        }
        pw.flush();
        pw.close();
    }
    public static int findLeftIndx(int [] arr, int leftMarker){
        int left=0;int right=arr.length;
        while(left<right){
            int mid=(left+right)/2;
            if(leftMarker>arr[mid])
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
    public static int findRightIndex(int [] arr, int rightMarker){
        int left=0;int right=arr.length;
        while(left<right){
            int mid=(left+right)/2;
            if(rightMarker>=arr[mid])
                left=mid+1;
            else
                right=mid;
        }
        return left;
    }
}
