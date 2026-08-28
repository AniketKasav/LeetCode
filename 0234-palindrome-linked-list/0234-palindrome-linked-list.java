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
    ListNode curr;
    public boolean isPalindrome(ListNode head) {
        // use the recursion
        // curr=head;
        // return solve(head);

        // by make half linked list reverse and then compare the two half
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=reverse(slow.next);
        slow.next=null;
        while(rev!=null){
            if(head.val!=rev.val){
                return false;
            }
            head=head.next;
            rev=rev.next;
        }
        return true;
    }

    ListNode reverse (ListNode head){
        ListNode curr=head;
        ListNode pre=null;
        while(curr!=null){
            ListNode nxt=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nxt;
        }
        return pre;
    }

    // boolean solve(ListNode head){
    //     if(head==null) return true;
    //     boolean ans= solve(head.next) && head.val==curr.val;
    //     curr=curr.next;
    //     return ans;
    // }
}