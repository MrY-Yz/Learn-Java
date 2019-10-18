public class Test {
    public static void main(String[] args) {
        DLinkedList s = new DLinkedList();
        s.disPlay();
        s.addIndex(0,1);
        s.addIndex(1,2);
        s.addIndex(0,0);
        s.addLast(9);
        s.addFirst(-1);
        s.addIndex(4,4);
        s.addIndex(5,5);
        s.addIndex(3,2);
        s.addIndex(2,5);
        s.disPlay();
        s.remove(5);
        s.disPlay();
        s.removeAllKey(2);
        s.disPlay();
        s.clear();
        s.disPlay();
    }
}
