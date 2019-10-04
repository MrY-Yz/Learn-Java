public class Practice {
    public ListNode getIntersectionNode(ListNode headA,ListNode headB){
        int len1 = size(headA);
        int len2 = size(headB);
        if(len1 > len2){
            int steps = len1 - len2;
            for(int i = 0; i < steps; i++){
                headA = headA.next;
            }
        } else {
            int steps = len2 - len1;
            for(int i = 0; i < steps; i++){
                headB = headB.next;
            }
        }
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public int size(ListNode head){
        int len = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            len++;
        }
        return len;
    }
}
