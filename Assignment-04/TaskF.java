import java.util.*;
import java.io.*;
public class TaskF {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int size=Integer.parseInt(br.readLine());
        StringTokenizer pos= new StringTokenizer(br.readLine());
        int x_pos=Integer.parseInt(pos.nextToken());
        int y_pos=Integer.parseInt(pos.nextToken());
        int directions[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int count=0;
        int valid[][]=new int[8][2];
        for (int i = 0; i < 8; i++) {
            int pos_x=x_pos+directions[i][0];
            int pos_y=y_pos+directions[i][1];
            if((pos_x>=1 && pos_x<=size)&&((pos_y)>=1&&pos_y<=size)){
                valid[count][0]=pos_x;
                valid[count][1]=pos_y;
                count++;
            }
        }
        pw.println(count);
        for (int i = 0; i < count; i++) {
            pw.println(valid[i][0]+" "+valid[i][1]);
        }
        pw.flush();
        pw.close();
    }
}
