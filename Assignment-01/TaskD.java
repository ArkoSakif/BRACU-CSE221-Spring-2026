import java.util.Scanner;
public class TaskD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i < T; i++) {
            boolean flag= true;
            long n=sc.nextInt();
            sc.nextLine();
            String sc1=sc.nextLine();
            String split[]=sc1.split(" ");
            long prev=-1;
            for (int j = 0; j < n; j++) {
            if(Integer.parseInt(split[j])<prev){
                flag=false;
                break;
            }
            else
                prev=Integer.parseInt(split[j]);
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
