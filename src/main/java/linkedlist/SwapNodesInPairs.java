package main.java.linkedlist;

public class SwapNodesInPairs {

    //[0,1,2,3,4,5]
    //[]
    public ListNode solution(ListNode head){

        if (head == null||head.next==null) {
            return head;
        }
        ListNode dumyHead = new ListNode(-1);
        dumyHead.next = head;
        ListNode pred = dumyHead;
        ListNode first;
        ListNode scond;
        ListNode temp;

        while (pred.next != null && pred.next.next != null) {
            first = pred.next; //1
            scond = pred.next.next; //2
            temp = pred.next.next.next; //3

            pred.next = scond; //2
            scond.next = first; //1
            first.next = temp; //3

            pred = first;

        }

        return dumyHead.next;
    }


}
