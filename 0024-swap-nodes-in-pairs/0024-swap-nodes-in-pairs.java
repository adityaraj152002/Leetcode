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
    public ListNode swapPairs(ListNode head) {
        ListNode p=head;
        int temp=0;

        if(p==null)
         return null;
        
        if(p.next==null)
         return p;

        while(p!=null)
        {
            if(p.next==null)
              break;
            temp=p.val;
            p.val=p.next.val;
            p.next.val=temp;

            p=p.next.next;

        }
        // head=p;
        return head;
    }
}