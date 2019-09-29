public class Practice {
    public ListNode findKthToTail(ListNode head,int k){
        int len = size(head);
        if(head == null || k <= 0 || k > len){
            return null;
        }
        int step = len - k;
        ListNode cur = head;
        for(int i = 0;i < step;i++){
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int len = 0;
        for(ListNode cur = head;cur != null; cur = cur.next){
            len++;
        }
        return len;
    }
}
