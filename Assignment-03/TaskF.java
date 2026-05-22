import java.util.*;
import java.io.*;
public class TaskF {
    static int index=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int len=Integer.parseInt(br.readLine());
        StringTokenizer sc1= new StringTokenizer(br.readLine());
        int og_arr[]=new int[len];
        for (int i = 0; i < len; i++) {
            og_arr[i]=Integer.parseInt(sc1.nextToken());
        }
        int result_arr[]=new int[len];
        makeBST(og_arr,result_arr,0,len-1);
        for (int i = 0; i < len; i++) {
            pw.print(result_arr[i]+" ");
        }
        pw.flush();
        pw.close();

    }
    private static void makeBST(int[] arr1, int[] arr2, int left, int right){
        if(left<0||right>=arr1.length||index>= arr1.length||left>right)
            return;
        if(left==right||left<0||right>=arr1.length) {
            arr2[index++] = arr1[left];
            return;
        }
        int mid=(left+right)/2;
        arr2[index++]=arr1[mid];
        makeBST(arr1,arr2,left,mid-1);
        makeBST(arr1,arr2,mid+1,right);

    }
}
