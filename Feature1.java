import java.util.HashSet;
import java.util.Set;

public class Feature1{
    public static int lengthOfLongestSubstring(String s) {
        //this returns the Longest Substring Without Repeating Characters
        //this is my solution from a question in leetcode.com
        Set<Character> set = new HashSet<Character>();
        int longest = 0, i = 0, j = 0, n = s.length();
        while(i<n&&j<n){
            if(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }else{
                set.add(s.charAt(j++));
                longest = Math.max(longest,j-i);
            }
        }
        return longest;
        
    }

}
