import java.io.*;
import java.util.*;
 public class TaskA {
     public static void main(String[] args) throws IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw= new PrintWriter(System.out);
         int length=Integer.parseInt(br.readLine());
         StringTokenizer sc1=new StringTokenizer(br.readLine());
         int arr[]=new int[length];
         for (int i = 0; i < length; i++) {
             arr[i]=Integer.parseInt(sc1.nextToken());
         }
         pw.println(mergeSort(arr));
         for (int i = 0; i < length; i++) {
             pw.print(arr[i]+" ");
         }
         pw.flush();
         pw.close();
     }
     private static long mergeSort(int [] arr){
         if(arr.length<=1)
             return 0;
         int middle= arr.length/2;
         int leftArr[]= new int[middle];
         int rightArr[]= new int[arr.length-middle];
         int idx=0;
         for (int i = 0; i < middle; i++) {
             leftArr[i]=arr[idx++];
         }
         for (int i = 0; idx < arr.length ; i++) {
             rightArr[i]=arr[idx++];
         }
         long left=mergeSort(leftArr);
         long right=mergeSort(rightArr);
         return merge(leftArr,rightArr,arr)+left+right;
     }
     private static long merge(int [] leftArr,int [] rightArr, int [] arr){
         int left=0;
         int right=0;
         int idx=0;
         long counter=0;
         while(left<leftArr.length&&right<rightArr.length){
             if(leftArr[left]<=rightArr[right]){
                 arr[idx++]=leftArr[left++];
             }
             else{
                 arr[idx++]=rightArr[right++];
                 counter+=(leftArr.length-left);
             }
         }
         while(left<leftArr.length){
             arr[idx++]=leftArr[left++];
         }
         while(right<rightArr.length){
             arr[idx++]=rightArr[right++];
         }
         return counter;
     }
}
