class DLinkedNode {
    int data = 0;
    DLinkedNode prev = null;
    DLinkedNode next = null;
    public DLinkedNode(int data) {
        this.data = data;
    }
}

public class DLinkedList {
    DLinkedNode head = null;

    public DLinkedList() {
        head = new DLinkedNode(-1);
        head.next = head;
        head.prev = head;
    }

    public void addFirst(int data) {
        DLinkedNode Node = new DLinkedNode(data);
        DLinkedNode next = head.next;
        head.next = Node;
        Node.prev = head;
        Node.next = next;
        next.prev = Node;
    }

    public void addLast(int data) {
        DLinkedNode Node = new DLinkedNode(data);
        DLinkedNode prev = head.prev;
        prev.next = Node;
        Node.prev = prev;
        Node.next = head;
        head.prev = Node;
    }

    public void addIndex(int index,int data) {
        int size = size();
        if(index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        DLinkedNode Node = new DLinkedNode(data);
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;
        prev.next = Node;
        Node.prev = prev;
        Node.next = next;
        next.prev = Node;
    }

    private DLinkedNode getPos(int index) {
        DLinkedNode cur = head.next;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int data) {
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next){
            if(cur.data == data){
                return true;
            }
        }
        return false;
    }

    public void remove(int key) {
        DLinkedNode toRemve = find(key);
        if(toRemve == null){
            return;
        }
        toRemve.next.prev = toRemve.prev;
        toRemve.prev.next = toRemve.next;
    }

    private DLinkedNode find(int key){
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            if(cur.data == key){
                return cur;
            }
        }
        return null;
    }

    public void removeAllKey(int key){
        while(true){
            DLinkedNode toRemove = find(key);
            if(toRemove == null){
                return;
            }
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
        }
    }

    public void disPlay(){
        System.out.print("正向：[");
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next){
            System.out.print(cur.data);
            if(cur.next != head){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("反向：[");
        for(DLinkedNode cur = head.prev; cur != head; cur = cur.prev){
            System.out.print(cur.data);
            if(cur.prev != head){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private int size() {
        int len = 0;
        for(DLinkedNode cur = head.next; cur != head; cur = cur.next) {
            len++;
        }
        return len;
    }

    public void clear(){
        head.next = head;
        head.prev = head;
    }
}
