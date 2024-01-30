package main.java.linkedlist;
//https://leetcode.cn/problems/remove-nth-node-from-end-of-list/submissions/499253201/
public class RemoveNthFromEnd {
    public ListNode solution(ListNode head, int n) {

        ListNode dumyHead = new ListNode(-1);
        dumyHead.next = head;
        ListNode fast = dumyHead;
        ListNode slow = dumyHead;

        //先将 fast 移动到 slow 后面的第 n 个 node
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //此时，slow 已经移动到倒数 n+1 位的 node 了
        slow.next = slow.next.next;

        return dumyHead.next;

    }
}
