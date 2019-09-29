public class Practice {
    public void removeAllKey(ListNode head,int toRemove) {
        if(head == null){
            return;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == toRemove){
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(head.val == toRemove){
            head = head.next;
        }
        return;
    }
}
