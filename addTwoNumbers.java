

/*

You are given two non-empty linked lists representing two 
non-negative integers. The digits are stored in reverse order 
and each of their nodes contain a single digit. Add the two numbers 
and return it as a linked list.

You may assume the two numbers do not contain any 
leading zero, except the number 0 itself.


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(l1.val + l2.val);
        int carry = 0, rem = 0;
        if(l3.val >= 10){
                carry = l3.val % 10;
                rem = l3.val / 10 ;
                l3.val = carry;
            }
        ListNode head = l3;
        
        while(l1.next != null || l2.next != null){
            if(l1.next == null){
                l1.next = new ListNode(0);
            }
            if(l2.next == null) {
                l2.next = new ListNode(0);
            }
            l1 = l1.next; 
            l2 = l2.next;
            if(rem != 0) {
                l3.next = new ListNode(l1.val + l2.val + rem);
                rem = 0;
            }
            else {
                l3.next = new ListNode(l1.val + l2.val);
            }
            l3 = l3.next;
            if(l3.val >= 10){
                carry = l3.val % 10;
                rem = l3.val / 10 ;
                l3.val = carry;
            }
        }
        if(rem != 0){
            l3.next = new ListNode(rem);
        }
        return head;
    }
}