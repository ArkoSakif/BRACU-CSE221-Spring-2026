import java.util.Scanner;
public class TaskF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        sc.nextLine();
        String sc1=sc.nextLine();
        String split[]=sc1.split(" ");
        long arr1[]=new long[len];
        //Filling the array from the given string
        for (int i = 0; i < split.length; i++) {
            arr1[i]=Integer.parseInt(split[i]);
        }
        int i=0;
        while(i<len){
        int j=i;
        //Isolating
        while(j+1<len){
            if(arr1[j]%2==0&&arr1[j+1]%2==0||arr1[j]%2!=0&&(arr1[j+1]%2)!=0){
                j++;
            }
            else{
                break;
            }
        }
            sortBlock(arr1,i,j);
            i=j+1;
        }
        for (int j = 0; j < len; j++) {
            System.out.print(arr1[j]+" ");
        }
    }
    public static void sortBlock(long[] arr,int start,int end){
        for (int i = start; i <=end ; i++) {
            for (int j =start; j < end-i+start; j++) {
                if(arr[j]>arr[j+1]){
                    long temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
