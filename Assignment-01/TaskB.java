import java.util.Scanner;
public class TaskB {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
        String sc1=sc.nextLine();
        String split[]=sc1.split(" ");
        double num1=(double)Integer.parseInt(split[1]);
        double num2=(double)Integer.parseInt(split[3]);
 
        double val=0.0;
        if(split[2].equals("+"))
            val=(double)num1+num2;
        if(split[2].equals("-"))
            val=(double)num1-num2;
        if(split[2].equals("*"))
            val=(double)num1*num2;
        if(split[2].equals("/"))
            val=(double)num1/num2;
 
        System.out.println(val);
        }
    }
}
