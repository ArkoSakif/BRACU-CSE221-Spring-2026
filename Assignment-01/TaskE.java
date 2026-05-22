import java.util.Scanner;
public class TaskE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        sc.nextLine();
        String sc1=sc.nextLine();
        String split[]=sc1.split(" ");
        int arr1[]=new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i]=Integer.parseInt(split[i]);
        }
        if(len<3){
            if(len==1) {System.out.println("YES\n0");return;}
            else if(arr1[0]>arr1[1]) {System.out.println("NO");return;}
        }
        String idx[]=new String[len*len];
        int counter=0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-2; j++) {
                if(arr1[j]>arr1[j+2]){
                    int temp=arr1[j];
                    arr1[j]=arr1[j+2];
                    arr1[j+2]=temp;
                    idx[counter]=""+(j+1)+" "+(j+3);
                    counter++;
                }
            }
        }
        for (int i = 0; i < len-1; i++) {
         if(arr1[i]>arr1[i+1]){
             System.out.println("NO");
             return;
         }
        }
        System.out.println("YES");
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            System.out.println(idx[i]);
        }
    }
}
