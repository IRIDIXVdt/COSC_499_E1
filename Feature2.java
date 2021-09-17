public class Feature2{
    //this returns the longest palindromic substring in a given string s,
    //this is my solution from a question in leetcode.com
    public static String longestPalindrome(String s) {
        String longest = "";
        for(int i = 0; i<s.length();i++){
            String oddP = palindromeFromStart(s,i,i);
            String eveP = palindromeFromStart(s,i,i+1);
            if(oddP.length()>longest.length())
                longest = oddP;
            if(eveP.length()>longest.length())
                longest = eveP;
        }
        return longest;
    }
    
    public static String palindromeFromStart(String s, int left, int right){
        //this returns the longest palindrom string given a index
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }

}
