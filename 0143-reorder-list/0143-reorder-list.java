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
    public void reorderList(ListNode head) {
        //find middle → split → reverse second half → slow = head, fast = pre → alternate/merge.
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast = slow.next;
        slow.next=null;
        // 1->2->3   null 4->5->null
        //       s    fp  f  fn
        ListNode fpre=null;
        ListNode fnext=null;
        while(fast!=null){
            fnext=fast.next;
            fast.next=fpre;
            fpre=fast;
            fast=fnext;
        }
        //   5->4->null
        fast=fpre;
        slow=head;
        ListNode snext=null;
        while(fast!=null){
            fnext=fast.next;
            snext=slow.next;
            slow.next=fast;
            fast.next=snext;
            fast=fnext;
            slow=snext;
        }
    }
}