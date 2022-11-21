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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.UniquePartitions(n);
            for(ArrayList<Integer>i: ans)
                for(int j: i)
                    System.out.print(j + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public ArrayList<ArrayList<Integer>> UniquePartitions(int n)
    {
        // Code here
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>();
        fun(n, sol, new ArrayList<>());
        return sol;
    }
    
    public static void fun(int n, ArrayList<ArrayList<Integer>> sol, ArrayList<Integer> list) {
        if(n <=0 ) {
            if(n == 0) sol.add((ArrayList)list.clone());
            return;
        }
        int j = n;
        if(list.size() > 0) j = list.get(list.size() - 1);
        
        for(int i = j; i >= 1; i--) {
            list.add(i);
            fun(n-i, sol, list);
            list.remove(list.size() - 1);
        }
    }
}