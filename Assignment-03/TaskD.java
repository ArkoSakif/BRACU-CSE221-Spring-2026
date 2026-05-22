import java.util.*;
import java.io.*;
public class TaskD {
    static long mod = (1000000000L + 7L);

    public static void main(String[] args) throws IOException {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw= new PrintWriter(System.out);
        FastIO io = new FastIO();
        StringBuilder sb = new StringBuilder();
        int T = io.nextInt();
        for (int i = 0; i < T; i++) {
            long m_11 = (long) io.nextInt();
            long m_12 = (long) io.nextInt();
            long m_21 = (long) io.nextInt();
            long m_22 = (long) io.nextInt();
            long x = io.nextInt();
            long mat[][] = {{m_11, m_12}, {m_21, m_22}};
            long result[][] = pow(mat, x);
            sb.append(result[0][0] + " " + result[0][1] + "\n");
            sb.append(result[1][0] + " " + result[1][1] + "\n");
        }
        io.print(sb);
        io.flush();
    }

    private static long[][] pow(long[][] mat, long exp) {
        long[][] res = {{1, 0}, {0, 1}};
        while (exp > 0) {
            if (exp % 2 != 0) {
                res = mul(res, mat);
            }
            mat = mul(mat, mat);
            exp>>=1;
        }
        return res;
    }

    private static long[][] mul(long[][] matA, long[][] matB) {
        long[][] res = new long[2][2];
        res[0][0] = (matA[0][0] * matB[0][0] + matA[0][1] * matB[1][0]) % mod;
        res[0][1] = (matA[0][0] * matB[0][1] + matA[0][1] * matB[1][1]) % mod;
        res[1][0] = (matA[1][0] * matB[0][0] + matA[1][1] * matB[1][0]) % mod;
        res[1][1] = (matA[1][0] * matB[0][1] + matA[1][1] * matB[1][1]) % mod;
        return res;
    }
}
class FastIO extends PrintWriter {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        // standard input
        public FastIO() { this(System.in, System.out); }

        public FastIO(InputStream i, OutputStream o) {
            super(o);
            stream = i;
        }

        // file input
        public FastIO(String i, String o) throws IOException {
            super(new FileWriter(o));
            stream = new FileInputStream(i);
        }

        // throws InputMismatchException() if previously detected end of file
        private int nextByte() {
            if (numChars == -1) { throw new InputMismatchException(); }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) { throw new InputMismatchException(); }
                if (numChars == -1) {
                    return -1;  // end of file
                }
            }
            return buf[curChar++];
        }

        // to read in entire lines, replace c <= ' '
        // with a function that checks whether c is a line break
        public String next() {
            int c;
            do { c = nextByte(); } while (c <= ' ');

            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = nextByte();
            } while (c > ' ');
            return res.toString();
        }

        public int nextInt() {  // nextLong() would be implemented similarly
            int c;
            do { c = nextByte(); } while (c <= ' ');

            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = nextByte();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9') { throw new InputMismatchException(); }
                res = 10 * res + c - '0';
                c = nextByte();
            } while (c > ' ');
            return res * sgn;
        }

        public double nextDouble() { return Double.parseDouble(next()); }
    }

