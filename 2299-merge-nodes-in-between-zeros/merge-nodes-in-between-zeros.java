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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        if(head==null){
            return head;
        }
        ListNode curr=head;
        ListNode sumStore=head;

        while(curr!=null){
            int sum=0;
            while(curr.val!=0){
                sum+=curr.val;
                curr=curr.next;
            }

            sumStore.val=sum;
            curr=curr.next;
            sumStore.next=curr;
            sumStore=sumStore.next;
        }
        return head;
}
}