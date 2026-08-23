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
        // int s=1;
        // ListNode temp=head;
        // while(temp.next!=null){
        //     temp=temp.next;
        //     s++;
        // }
        // if(s==2 && n==1){
        //     head.next=null;
        //     return head;
        // }
        // if(s==2 && n==2){
        //     head=head.next;
        //     return head;
        // }
        // if(s==1 || s==n){
        //     head=head.next;
        //     return head;
        // }
        // temp=head;
        // int i=1;
        // while(i!=s-n){
        //     temp=temp.next;
        //     i++;
        // }
        // temp.next=temp.next.next;
        // return head;
        ListNode slow=head;
        ListNode fast=head;
        while(n!=0){
            fast=fast.next;
            n--;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}