public class Practice {
    public boolean chkPalindrome(ListNode A) {
        int size = size(A);
        int steps = size / 2;
        ListNode B = A;
        for(int i =0; i < steps; i++){
            B = B.next;
        }
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null){
           ListNode next = cur.next;
           if(next == null){
               B = cur;
           }
           cur.next = prev;
           prev = cur;
           cur = next;
        }
        while(B != null){
            if(B.val != A.val){
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }

    public int size(ListNode head){
        int size = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            size++;
        }
        return size;
    }
}
