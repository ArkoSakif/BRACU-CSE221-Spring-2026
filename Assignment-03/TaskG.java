import java.util.*;
import java.io.*;
public class TaskG {
    static PrintWriter pw=new PrintWriter(System.out);
    static int idx=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        StringTokenizer sc1=new StringTokenizer(br.readLine());
        StringTokenizer sc2=new StringTokenizer(br.readLine());
        long inOrder[]=new long[len];
        long preOrder[]=new long[len];
        for(int i=0;i<len;i++){
            inOrder[i]=Long.parseLong(sc1.nextToken());
            preOrder[i]=Long.parseLong(sc2.nextToken());
        }
        postOrder(inOrder,preOrder,0,len-1);
        pw.flush();
        pw.close();
    }
    private static void postOrder(long[] inOrder,long [] preOrder,int start,int end){
        if(start>end)
            return;
        long root=preOrder[idx++];
        int rootIdx=-1;
        for (int i = start; i <= end; i++) {
            if(inOrder[i]==root){
                rootIdx=i;
                break;
            }
        }
        postOrder(inOrder,preOrder,start,rootIdx-1);
        postOrder(inOrder,preOrder,rootIdx+1,end);
        pw.print(root+" ");
    }
}
