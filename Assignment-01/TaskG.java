import java.util.Scanner;
public class TaskG {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            int len=sc.nextInt();
            sc.nextLine();
            String sc1 = sc.nextLine();
            String sc2 = sc.nextLine();
            int ID[]=new int[len];
            int marks[]=new int[len];
            String IdTemp[]=sc1.split(" ");
            String MarksTemp[]=sc2.split(" ");
            //Filling the Arrays
            for (int j = 0; j < len; j++) {
                ID[j]=Integer.parseInt(IdTemp[j]);
                marks[j]=Integer.parseInt(MarksTemp[j]);
            }
        int swaps=specialSelectionSort(ID,marks);
            System.out.println("Minimum swaps: "+swaps);
            for (int j = 0; j < len; j++) {
                System.out.println("ID: "+ ID[j] + " Mark: "+marks[j]);
            }
        }

    }
    public static int specialSelectionSort(int [] arr1,int [] arr2){
        int swaps=0;
        for (int i = 0; i < arr1.length; i++) {
            int max=-1;
            int maxIdx=-1;
            for (int j = i; j < arr1.length; j++) {
                if(j==i){
                    max=arr2[j];
                    maxIdx=j;
                    continue;
                }
                if(arr2[j]>max){
                    max=arr2[j];
                    maxIdx=j;
                }
                else if(arr2[j]==max){
                    if(arr1[j]<arr1[maxIdx]) maxIdx=j;
                }
            }
            if(maxIdx==i) continue;
            else{
                int temp1=arr1[i];
                int temp2=arr2[i];
                arr1[i]=arr1[maxIdx];
                arr2[i]=arr2[maxIdx];
                arr1[maxIdx]=temp1;
                arr2[maxIdx]=temp2;
                swaps++;
            }
        }
    return swaps;
    }
}
