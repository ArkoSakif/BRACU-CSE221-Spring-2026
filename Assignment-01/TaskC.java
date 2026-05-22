import java.util.Scanner;
public class TaskC {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i = 0; i < T; i++) {
            long num=sc.nextInt();
            long sum=(num*(num+1))/2;
            System.out.println(sum);
        }
    }
}
