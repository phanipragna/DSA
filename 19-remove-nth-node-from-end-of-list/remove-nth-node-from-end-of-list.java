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
        int c=0;
        ListNode i=head;
        while(i!=null){
            c++;
            i=i.next;
        }
        if(c==n){
            head=head.next;
            return head;
        }
        ListNode t1=head,t2=head.next;
        for(int j=1;j<c-n;j++){
            t1=t1.next;
            t2=t2.next;
        }
        t1.next=t2.next;
        return head;
    }
}