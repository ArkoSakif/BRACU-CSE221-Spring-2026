import java.util.*;
import java.io.*;
public class TaskH {
    static PrintWriter pw = new PrintWriter(System.out);
    static long preOrder[];
    static int preOrderIdx=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer sc1 = new StringTokenizer(br.readLine());
        StringTokenizer sc2 = new StringTokenizer(br.readLine());
        long inOrder[] = new long[len];
        long postOrder[] = new long[len];
        preOrder=new long[len];
        for (int i = 0; i < len; i++) {
            inOrder[i] = Long.parseLong(sc1.nextToken());
            postOrder[i] = Long.parseLong(sc2.nextToken());
        }
        preOrder(inOrder, postOrder, 0, len - 1,0,len -1);
        pw.flush();
        pw.close();
    }
    private static void preOrder(long [] inOrder, long [] postOrder, int start, int end,int start_pre,int end_pre){
        if(start>end) {
            return;
        }
        long root=postOrder[end_pre];
        int rootIdx=-1;
        for (int i = start; i <=end; i++) {
            if(inOrder[i]==root){
                rootIdx=i;
            }
        }
        pw.print(root+" ");
        int add=rootIdx-start;
        preOrder(inOrder,postOrder,start,rootIdx-1,start_pre,start_pre+add-1);
        preOrder(inOrder,postOrder,rootIdx+1,end,start_pre+add,end_pre-1);
    }
}
