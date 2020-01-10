//Given a string, find the length of the longest substring without repeating cha
//racters. 
//
// 
// Example 1: 
//
// 
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
// 
//
// 
// Example 2: 
//
// 
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// 
// Example 3: 
//
// 
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence
// and not a substring.
// 
// 
// 
// 
// Related Topics Hash Table Two Pointers String Sliding Window


package leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] age) {
        Solution solution = new LongestSubstringWithoutRepeatingCharacters().new Solution();
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        int max = 1;
        int left = 0;
        int right = 1;
        int current = 1;
        Set<String> set = new HashSet<>();
        String[] list = s.split("");
        set.add(list[left]);
        while (right < list.length) {
            if (set.contains(list[right])) {
                while (left < right && set.contains(list[right])) {
                    set.remove(list[left]);
                    current--;
                    left++;
                }
            }
            set.add(list[right]);
            current++;
            max = Math.max(max, current);
            right++;
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}