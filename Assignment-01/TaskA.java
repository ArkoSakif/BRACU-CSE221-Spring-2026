import java.util.Scanner;
public class TaskA {
    public static void main(String [] args){
     Scanner sc= new Scanner(System.in);
     int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
        int x= sc.nextInt();
        if(x%2==0)
            System.out.println(x+" is an Even number.");
        else
            System.out.println(x+" is an Odd number.");
        }
    }
}
