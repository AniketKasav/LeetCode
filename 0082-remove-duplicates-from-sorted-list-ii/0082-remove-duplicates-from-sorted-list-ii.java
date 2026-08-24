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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.val=0;
        dummy.next=head;
        ListNode pre=dummy;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            while(fast!=null && slow.val==fast.val){
                fast=fast.next;
            }
            if(slow.next!=fast){
                pre.next=fast;
                slow=fast;
            }else{
                pre=slow;
                slow=fast;
            }
        }
        return dummy.next;
    }
}