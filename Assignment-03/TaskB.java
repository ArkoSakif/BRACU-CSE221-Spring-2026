import java.io.*;
import java.util.*;
public class TaskB {
    static long counter=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw= new PrintWriter(System.out);
        int length=Integer.parseInt(br.readLine());
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        long arr[]=new long[length];
        for (int i = 0; i < length; i++) {
            arr[i]=Long.parseLong(sc1.nextToken());
        }
        mergeSort(arr);
        pw.print(counter);
        pw.flush();
        pw.close();
    }
    private static long[] mergeSort(long [] arr){
        if(arr.length<=1)
            return arr;
        int middle= arr.length/2;
        long leftArr[ ]= new long[middle];
        long rightArr[] = new long[arr.length-middle];
        int idx=0;
        for (int i = 0; i < middle; i++) {
            leftArr[i]=arr[idx++];
        }
        for (int i = 0; idx < arr.length ; i++) {
            rightArr[i]=arr[idx++];
        }
        long[] left=mergeSort(leftArr);
        long[] right=mergeSort(rightArr);
        return merge(left,right);
    }
    private static long[] merge(long [] leftArr,long [] rightArr){
        int left=0;
        int right=0;
        int idx=0;
        long [] arr=new long[leftArr.length+rightArr.length];
        if(rightArr.length>0){
            long[] valB=new long[rightArr.length];
            for (int i = 0; i < rightArr.length; i++) {
                valB[i]=Math.abs(rightArr[i]);
            }
            Arrays.sort(valB);
            int p1=0;
            for (int i = 0; i < leftArr.length; i++) {
                if(leftArr[i]<=0) continue;
                while(p1<rightArr.length){
                    long val=valB[p1];
                    long sqr=val*val;
                    if(sqr<leftArr[i])p1++;
                    else break;
                }
                counter+=p1;
            }
        }
        while(left<leftArr.length&&right<rightArr.length){
            if(leftArr[left]<=rightArr[right]){
                arr[idx++]=leftArr[left++];
            }
            else{
                arr[idx++]=rightArr[right++];
            }
        }
        while(left<leftArr.length){
            arr[idx++]=leftArr[left++];

        }
        while(right<rightArr.length){
            arr[idx++]=rightArr[right++];
        }
        return arr;
        
    }
}
