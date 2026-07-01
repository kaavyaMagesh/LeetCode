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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode leftPrev=dummy;
        ListNode currNode=head;

//moving the currNode to the required Left node
        for (int i=0;i<left-1;i++){
             leftPrev=currNode;
             currNode=currNode.next;
        }
//just like revereser linked list 1- ur setting up connection reverse between the left and right nodes
ListNode prev=null;
for (int j=0;j<right-left+1;j++){

    ListNode nextPtr=currNode.next;
    currNode.next=prev;
    prev=currNode;
    currNode=nextPtr;
}
//now to handle the coonnections on the left and right sides of the left and right nodes

leftPrev.next.next=currNode;
leftPrev.next=prev;

 return dummy.next;
    }
}