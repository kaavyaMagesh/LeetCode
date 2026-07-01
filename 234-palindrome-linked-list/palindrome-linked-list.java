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
    public boolean isPalindrome(ListNode head) {
        
        //find the middle node
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null  && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse the right half of the list from the middle node

        ListNode nxtptr;
        ListNode prev=null;

        while (slow!=null)
{       nxtptr=slow.next;
        slow.next=prev;

        prev=slow;
        slow=nxtptr;
}

//check from both ends (prev will be at the end and will travel till next==null as there will be one node in the middle who's next will point to null)
//create the 2 pointers for checking

ListNode left=head;
ListNode right=prev;

while(right!=null){
    if(left.val!=right.val){
        return false;
    }
    left=left.next;
    right=right.next;
}
return true;
    }
}