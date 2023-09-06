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
    public int pairSum(ListNode head) {
        
        ListNode p=head;

        int cnt=0;

        while(p!=null)
        {
            p=p.next;
            cnt++;
        }

        int arr[]=new int[cnt/2];

        ListNode q=head;

        for(int i=0;i<cnt/2;i++)
        {
            arr[i]=q.val;
            q=q.next;
        }

        for(int i=cnt/2-1;i>=0;i--)
        {
            arr[i]+=q.val;
            q=q.next;
        }

        Arrays.sort(arr);

        return arr[cnt/2-1];
    }
}