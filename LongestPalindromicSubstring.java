public class LongestPalindromicSubstring {
    int maxLength;
    // int start;
    int lo;
    public String longestPalindrome(String s) {
        if(s.length()<2){
            return s;
        }
        // int end = 0;
        for(int start = 0; start<s.length()-1;start++){
            expandPalindrome(s, start, start);
            expandPalindrome(s, start, start+1);
        }
        return s.substring(lo, lo+maxLength);
    }

    private void expandPalindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        // maxLength = Math.max(maxLength, end-start-1);
        if(maxLength<end-start-1){
            maxLength = end-start-1;
            lo = start+1;
        }
    }
}
