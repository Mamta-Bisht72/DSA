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
    public boolean isPalindrome(ListNode head) {

        // find the middle element,then reverse the elements after mid to tail;then compare first with last and second with second last so on....
        ListNode slow=middle(head);
        ListNode curr=reverse(slow);
        ListNode beg=head;
        while(curr!=null)
        {
            if(beg.val==curr.val)
            {
                curr=curr.next;
                beg=beg.next;
            }
            else 
                return false;
        }
        return true;
    }
    //mid element
        ListNode middle(ListNode head)
        {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
            return slow;
        }
       
        ListNode reverse(ListNode slow)
        {
        // slow pointer will be at middle element now reverse from slow to fast pointer;
            ListNode prev=null;
            ListNode curr=slow;
            while(curr!=null)
            {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            }
        return prev;
        }
        
}