//You are given two non-empty linked lists representing two non-negative integer
//s. The digits are stored in reverse order and each of their nodes contain a sing
//le digit. Add the two numbers and return it as a linked list. 
//
// You may assume the two numbers do not contain any leading zero, except the nu
//mber 0 itself. 
//
// Example: 
//
// 
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
// 
// Related Topics Linked List Math


package leetcode.editor.en;

import leetcode.editor.en.DataStructure.ListNode;

public class AddTwoNumbers {
    public static void main(String[] age) {
        Solution solution = new AddTwoNumbers().new Solution();
    }
    

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode temp = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int val = carry;
            if (l1 != null) val += l1.val;
            if (l2 != null) val += l2.val;
            temp = new ListNode(val % 10);
            carry = val / 10;
            temp = temp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}