import java.util.*;
import java.io.*;
public class TaskG {
    public static void main(String[] args) throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw=new PrintWriter(System.out);
    StringTokenizer sc1=new StringTokenizer(br.readLine());
    int rows=Integer.parseInt(sc1.nextToken());
    int columns=Integer.parseInt(sc1.nextToken());
    int k=Integer.parseInt(sc1.nextToken());
    int board[][]=new int[rows+1][columns+1];
    int knights_pos[][]=new int[k][2];
    int directions[][]={{-2,-1},{-2,1},{-1,-2},{-1,2},{1,-2},{1,2},{2,-1},{2,1}};
        for (int i = 0; i < k; i++) {
            StringTokenizer sc2=new StringTokenizer(br.readLine());
            int row_pos=Integer.parseInt(sc2.nextToken());
            int col_pos=Integer.parseInt(sc2.nextToken());
            knights_pos[i][0]=row_pos;
            knights_pos[i][1]=col_pos;
            board[row_pos][col_pos]=1;
        }
        for (int i = 0; i < knights_pos.length; i++) {
            int row_pos=knights_pos[i][0];
            int col_pos=knights_pos[i][1];
            for (int j = 0; j < directions.length; j++) {
            int pos_row=row_pos+directions[j][0];
            int pos_col=col_pos+directions[j][1];
            if((pos_row>=1&&pos_row<=rows)&&(pos_col>=1&&pos_col<=columns)){
                if(board[pos_row][pos_col]==1){
                    pw.println("YES");
                    pw.flush();
                    pw.close();
                    return;
                }
            }
            }
        }
        pw.println("NO");
        pw.flush();
        pw.close();
    }
}
