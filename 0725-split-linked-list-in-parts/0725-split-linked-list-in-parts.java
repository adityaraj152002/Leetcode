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
    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode p=head;

        int cnt=0;

        while(p!=null)
        {
            cnt++;
            p=p.next;
        }

        int w=cnt/k, rem=cnt%k;

        ListNode[] ans=new  ListNode[k];

        p=head;

        for(int i=0;i<k;++i)
        {
            ListNode root=new ListNode(0), write = root;
            for (int j = 0; j < w + (i < rem ? 1 : 0); ++j) 
            {
                write = write.next = new ListNode(p.val);
                if (p != null)
                  p = p.next;
            }
            ans[i] = root.next; 
        }
        return ans;
    }
}