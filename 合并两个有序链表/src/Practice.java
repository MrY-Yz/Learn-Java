public class Practice {
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode newHead = null;
        ListNode newTail = null;
        while(cur1 != null && cur2 != null){
            if(cur1.val < cur2.val){
                if(newHead == null){
                    newHead = cur1;
                    newTail = cur1;
                    cur1 = cur1.next;
                } else {
                    newTail.next = cur1;
                    newTail = newTail.next;
                    cur1 = cur1.next;
                }
            } else {
                if(newHead == null){
                    newHead = cur2;
                    newTail = cur2;
                    cur2 = cur2.next;
                } else {
                    newTail.next = cur2;
                    newTail = newTail.next;
                    cur2 = cur2.next;
                }
            }
        }
        if(cur1 == null){
            newTail.next = cur2;
        } else {
            newTail.next = cur1;
        }
        return newHead;
    }
}
