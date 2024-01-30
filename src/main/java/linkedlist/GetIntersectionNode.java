package main.java.linkedlist;
//https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/description/
public class GetIntersectionNode {

    //把两个链表末端对齐，然后把长的链表的 head 指针移动到和短的相同位置，然后两个链表同时往后遍历，当遇到 value 一样时，这个 value 所在节点就是两个链表的相交点
    public ListNode solution1(ListNode headA, ListNode headB) {
        int sizeA = 0;
        int sizeB = 0;
        int gap = 0;

        ListNode currA = headA;
        ListNode currB = headB;

        while (currA != null) {
            currA = currA.next;
            sizeA++;
        }
        while (currB != null) {
            currB = currB.next;
            sizeB++;
        }
        currA = headA;
        currB = headB;

        if (sizeB > sizeA) {
            gap = sizeB - sizeA;
            currA = headB;
            currB = headA;
        } else {
            gap = sizeA - sizeB;
        }

        while (gap-- > 0) {
            currA= currA.next;
        }
        while (currA != null) {
            if (currA == currB) {
                return currA;
            }
            currA= currA.next;
            currB = currB.next;

        }

        return null;

    }
}
