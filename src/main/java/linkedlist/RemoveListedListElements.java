package main.java.linkedlist;

import java.util.List;

public class RemoveListedListElements {
    public ListNode solution(ListNode head, int val){

        ListNode dumy = new ListNode(-1, head);
        ListNode pre = dumy;
        ListNode cur= dumy.next;

        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }

        return dumy.next;

    }

    public ListNode solution2(ListNode head, int val){

        while (head != null && head.val == val) {//make sure the  value of head is not equal to target val
            head = head.next;
        }
        if (head == null) {
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }

        return head;
    }

    public ListNode solution3(ListNode head,int val) {

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode cur = head;

        while (cur != null) {
            while (cur.next != null && cur.next.val == val) {
                cur.next= cur.next.next;
            }
            cur= cur.next;
        }
        return head;
    }
}
