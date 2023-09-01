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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        temp=head;
        if(len==n)
        head=head.next;
        while(len!=n)
        {
            if(len==n+1)
            {
                temp.next=temp.next.next;
            }
            else
            temp=temp.next;
            len--;
        }
            return head;

    }
}