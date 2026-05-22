import java.util.*;
import java.io.*;
public class TaskF {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(sc1.nextToken());
        int target=Integer.parseInt(sc1.nextToken());
        StringTokenizer userIn=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(userIn.nextToken());
        }
        int store[]=new int[n+1];
        int left=0;
        int uniqCount=0;
        int longest=0;
        for (int right = 0; right < n; right++) {
            if(store[arr[right]]==0){
                uniqCount++;
            }
            store[arr[right]]++;
            while(uniqCount>target){
                store[arr[left]]--;
                if(store[arr[left]]==0) {
                    uniqCount--;
                }
                left++;
            }
            int size=right-left+1;
            if(size>longest)
                longest=size;
        }
        pw.print(longest);
        pw.flush();
        pw.close();

    }
}
