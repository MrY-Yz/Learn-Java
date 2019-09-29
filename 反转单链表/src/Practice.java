public class Practice {
    public ListNode reverseList(ListNode head){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode newHead = null;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = cur.next;
        while (cur != null){
            if(next == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }
}
