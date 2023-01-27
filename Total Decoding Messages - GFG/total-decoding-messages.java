//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int MOD = 1_000_000_007;

    public static int CountWays(String str) {
        int n = str.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = str.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(str.substring(i - 1, i));
            int twoDigits = Integer.parseInt(str.substring(i - 2, i));
            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
                dp[i] %= MOD;
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
                dp[i] %= MOD;
            }
        }
        return dp[n];
    }
}

