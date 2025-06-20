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
        ListNode t1=head;
        for(int i=1;i<=n;i++) t1=t1.next;
        if(t1==null) return head.next;
        ListNode t2=head,prev=null;
        while(t1!=null){
            prev=t2;
            t1=t1.next;
            t2=t2.next;
        }prev.next=t2.next;
        return head;
    }
}