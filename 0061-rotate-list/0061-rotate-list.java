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
    public ListNode rotateRight(ListNode head, int k) {
        
        int s=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            s++;
        }
        if(s==0)return head;
        int i=1;
        k=k%s;
        ListNode slow=head;
        ListNode fast=head.next;
        while(i<s-k){
            fast=fast.next;
            slow=slow.next;
            i++;
        }
        ListNode ans=fast;
        if(fast==null)return head;
        while(fast.next!=null){
            fast=fast.next;
        }
        slow.next=null;
        fast.next=head;
        return ans;

    }
}