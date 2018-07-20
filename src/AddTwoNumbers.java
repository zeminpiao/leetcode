//*
// * Definition for singly-linked list.

class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode a = l1;
        ListNode b = l2;
        int sum = 0;
        int digit = 0;
        int tenDigit = 0;
        ListNode l3 = new ListNode(0);
        ListNode zeroNode = new ListNode(0);
        ListNode c = l3;
        while(a!=null || b!=null){

            sum = (a==null ? 0 : a.val) + (b==null ? 0 : b.val) + tenDigit;
            digit = sum % 10;
            tenDigit = sum / 10;

            c.next = new ListNode(digit);
            c = c.next;
            if(a!=null)a = a.next;
            if(b!=null)b = b.next;

        }
        if(tenDigit!=0){
            c.next = new ListNode(tenDigit);
        }
        return l3.next;
    }
}