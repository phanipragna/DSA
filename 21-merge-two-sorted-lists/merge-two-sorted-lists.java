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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode ml=null;
        if(list1.val<=list2.val){
            ml=list1;
            list1=list1.next;
        }
        else{
            ml=list2;
            list2=list2.next;
        }
        ListNode i=ml;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
            i.next=list1;
            list1=list1.next;}
            else{
                i.next=list2;
                list2=list2.next;
            }
            i=i.next;
        }if(list1==null)
            i.next=list2;
        if(list2==null)
            i.next=list1; 
        return ml;     
    }
}