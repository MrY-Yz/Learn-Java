public class Practice {
    public ListNode middleListNode(ListNode head){
        int middle = size(head) / 2;
        ListNode cur = head;
        for (int i = 0; i < middle; i++){
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head){
        int len = 0;
        for(ListNode cur = head;cur != null;cur = cur.next){
            len++;
        }
        return len;
    }
}
