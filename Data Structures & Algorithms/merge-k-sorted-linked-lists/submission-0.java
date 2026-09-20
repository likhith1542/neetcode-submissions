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
    public ListNode mergeKLists(ListNode[] ls) {
        if(ls.length==0)return null;
        if(ls.length==1)return ls[0];

        ListNode dummy=merge2Lists(ls[0],ls[1]);
        
        for(int i=2;i<ls.length;i++){
            dummy=merge2Lists(dummy,ls[i]);
        }

        return dummy;
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) { tail.next = l1; l1 = l1.next; }
            else                  { tail.next = l2; l2 = l2.next; }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }
}
