class Solution {
    public String longestPalindrome(String s) {  
        String res="";
        
        for(int i=0;i<s.length();i++){
            
            for(int j=i,k=i;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j--,k++){
                
                if(res.length()<k-j+1) res=s.substring(j,k+1);
                
            }
            
            for(int j=i,k=i+1;j>=0 && k<s.length() && s.charAt(j)==s.charAt(k);j--,k++){
                
                if(res.length()<k-j+1) res=s.substring(j,k+1);
            }
        }
        return res;
    }
}
