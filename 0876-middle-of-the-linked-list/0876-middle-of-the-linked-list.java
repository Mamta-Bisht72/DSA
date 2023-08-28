/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        //use slow and fast pointer, slow moves by 1 and fast moves by 2 when fast reaches or exceeds the end then slow will be at middle.
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next; 
        }
        return slow;
        
    }
}