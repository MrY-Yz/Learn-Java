class LinkedNode {
    public int data = 0;
    public LinkedNode next = null;

    public LinkedNode(int data) {
        this.data = data;
    }
}

public class LinkdeList {
   private LinkedNode head = null;

   public void addFirst(int elem){
       LinkedNode node = new LinkedNode(elem);
       if(this.head == null){
          this.head = node;
          return;
       }
       node.next = this.head;
       this.head = node;
       return;
   }

   public void addLast(int elem){
       LinkedNode node = new LinkedNode(elem);
       if(this.head == null){
           this.head = node;
           return;
       }

       LinkedNode cur = this.head;
       while(cur.next != null){
           cur = cur.next;
       }
       cur.next = node;
       return;
   }

   public void addIndex(int index,int elem){
       LinkedNode node = new LinkedNode(elem);
       int len = size();
       if(index > len || index < 0){
           return;
       }
       if(index == 0){
           addFirst(elem);
           return;
       }
       if(index == len){
           addLast(elem);
           return;
       }
       LinkedNode pre = getIndexPos(index - 1);
       node.next = pre.next;
       pre.next = node;
   }

   public int size(){
       int size = 0;
       for(LinkedNode cur = this.head;cur != null;cur = cur.next){
           size++;
       }
       return size;
   }

   private LinkedNode getIndexPos(int index){
       LinkedNode cur = this.head;
       for(int i = 0; i < index; i++){
           cur = cur.next;
       }
       return cur;
   }

   public boolean contains(int toFind){
       for(LinkedNode cur = this.head; cur != null; cur = cur.next){
           if(toFind == cur.data){
               return true;
           }
       }
       return false;
   }

   public void remove(int toRemove){
       if(head == null){
           return;
       }
       if(head.data == toRemove){
           this.head = this.head.next;
           return;
       }
       LinkedNode prev = searchPre(toRemove);
       prev.next = prev.next.next;
   }

   private LinkedNode searchPre(int toRemove){
       if(this.head == null){
           return null;
       }
       LinkedNode prev = this.head;
       while(prev.next != null){
           if(prev.next.data == toRemove){
               return prev;
           }
           prev = prev.next;
       }
       return null;
   }

   public void disPlay(){
       System.out.print("[");
       for(LinkedNode cur = this.head; cur != null;cur = cur.next){
           System.out.print(cur.data);
           if( cur.next != null){
               System.out.print(", ");
           }
       }
       System.out.println("]");
   }
}
