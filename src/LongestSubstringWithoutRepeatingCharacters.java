import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int stringLength = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while(i < stringLength && j < stringLength){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                ans = Math.max(j-i, ans);
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }

        return ans;

    }
}