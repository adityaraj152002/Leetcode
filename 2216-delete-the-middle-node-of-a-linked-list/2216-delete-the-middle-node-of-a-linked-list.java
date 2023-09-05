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
    public ListNode deleteMiddle(ListNode head) {

        if(head==null || head.next==null)
          return null;

        ListNode q=head;

        int cnt=0,i=0;


        while(q!=null)
        {
           cnt++;
           q=q.next;
        }
        
        ListNode p=head;

       while(i<cnt/2-1)
       {
           i++;
           p=p.next;
       }

        p.next=p.next.next;

        return head;
    }
}