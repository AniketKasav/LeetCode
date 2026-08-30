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
    public ListNode partition(ListNode head, int x) {
        ListNode small=new ListNode(-101);
        ListNode large=new ListNode(101);
        ListNode smalltail=small;
        ListNode largetail=large;
        ListNode curr=head;
        while(curr!=null){
            ListNode currnext=curr.next;
            if(curr.val<x){
                smalltail.next=curr;
                curr.next=null;
                smalltail=smalltail.next;
                curr=currnext;
            }else{
                largetail.next=curr;
                curr.next=null;
                largetail=largetail.next;
                curr=currnext;
            }
        }
        small=small.next;
        large=large.next;
        if(small==null)return large;
        smalltail.next=large;
        return small;
    }
}