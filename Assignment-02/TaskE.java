import java.util.*;
import java.io.*;
public class TaskE {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(sc1.nextToken());
        int k=Integer.parseInt(sc1.nextToken());
        int arr1[]=new int[n];
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr1[i]=Integer.parseInt(sc2.nextToken());
        }
        int longest=0;
        int left=0;
        int sum=0;
        int size=0;
        for (int right = 0; right < n; right++) {
            sum+=arr1[right];
            size++;
            while(left<=right&&sum>k){
                sum-=arr1[left];
                size--;
                left++;
            }
            if(size>longest)
                longest=size;
        }
        pw.println(longest);
        pw.flush();
        pw.close();

    }
}

