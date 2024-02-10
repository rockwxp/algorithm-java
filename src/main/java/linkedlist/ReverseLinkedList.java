package main.java.linkedlist;

public class ReverseLinkedList {

    public ListNode solution(ListNode head){

        ListNode pred = null;
        ListNode curr = head;
        // 1 > 2 > 3 > 4 > null
        while (curr != null) {
            ListNode temp = curr.next; // temp = 2 ,temp = 3
            curr.next = pred; // null < 1  , 1 < 2
            pred = curr; // pre = 1 , pre = 2
            curr = temp; // curr = 2 , temp = 3
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
