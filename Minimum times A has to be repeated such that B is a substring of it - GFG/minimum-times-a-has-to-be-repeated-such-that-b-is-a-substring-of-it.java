//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        int n = A.length(), m = B.length();
        int[] lps = new int[m];
        int j = 0, i;
        for (i = 1; i < m; i++) {
            while (j > 0 && B.charAt(j) != B.charAt(i)) {
                j = lps[j - 1];
            }
            if (B.charAt(j) == B.charAt(i)) {
                j++;
            }
            lps[i] = j;
        }
        j = 0;
        for (i = 0; i < n * m; i++) {
            while (j > 0 && B.charAt(j) != A.charAt((i % n))) {
                j = lps[j - 1];
            }
            if (B.charAt(j) == A.charAt((i % n))) {
                j++;
            }
            if (j == m) {
                return (i / n) + 1;
            }
        }
        return -1;
    }
};