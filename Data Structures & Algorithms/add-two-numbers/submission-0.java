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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode dummy=head;

        int carry=0;

        while(l1!=null || l2!=null){
            int sum=carry;
            if(l1!=null)sum+=l1.val;
            if(l2!=null)sum+=l2.val;

            int val=sum%10;
            carry=sum/10;

            ListNode temp=new ListNode(val);
            dummy.next=temp;
            dummy=dummy.next; 

            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }

        if(carry!=0){
            ListNode temp=new ListNode(carry);
            dummy.next=temp;
            dummy=dummy.next; 
        }

        return head.next;


    }
}
