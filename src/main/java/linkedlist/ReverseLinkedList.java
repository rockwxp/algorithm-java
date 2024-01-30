package main.java.linkedlist;

public class ReverseLinkedList {

    public ListNode solution(ListNode head){

        ListNode pred = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pred;
            pred = curr;
            curr = temp;
        }
        return pred;
    }

    //递归
    public ListNode reverse(ListNode pred, ListNode curr){
        if (curr == null) {
            return pred;
        }
        ListNode temp = curr.next;
        curr.next = pred;
        return reverse(curr,temp);
    }


}
