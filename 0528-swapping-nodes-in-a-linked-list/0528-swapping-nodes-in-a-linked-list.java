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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode p=head,q=head;

        int cnt=0;    //1 2 3
        while(p!=null)//1 2 3 4 5 
        {
            cnt++;
            p=p.next;
        }

        System.out.println(cnt);

        int rev=cnt-k;
        int f=0,l=0,i=0;
         System.out.println("rev : "+rev);
        while(q!=null)
        {
            if(i==k-1)
            {
             f=q.val;
            }
            if(i==rev)
             l=q.val;
            q=q.next;
            i++;
        }

        ListNode r=head;
        i=0;
        while(r!=null)
        {
            if(i==k-1)
            {
             r.val=l;
            }
            if(i==rev)
             r.val=f;
            r=r.next;
            i++;
        }

        return head;
    }
}