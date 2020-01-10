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
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while (true) {
            temp.val = carry;
            if (l1 != null) {
                temp.val = temp.val + l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                temp.val = temp.val + l2.val;
                l2 = l2.next;
            }
            carry = temp.val / 10;
            temp.val = temp.val % 10;
            if (l1 != null || l2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            } else break;
        }
        if (carry != 0) {
            temp.next = new ListNode(carry);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}