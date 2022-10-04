public class insertat_i {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public insertat_i(){
        head = null;
        tail = null;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void add(int element){
        Node node = new Node();
        node.data = element;
        node.next = null;
        if(size == 0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void insertAt(int i, int element){
        Node node = new Node();
        node.data = element;
        int count = 0;
        Node temp = head;
        if(i==0){
            node.next=head;
            head=node;
        }
        else{
            while(count < i-1 && temp!= null ){
                temp = temp.next;
                count++;
    
            }
            if(temp!= null){
                node.next = temp.next;
                temp.next = node;
                size++;
            }
        }

    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        insertat_i list = new insertat_i();
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(900);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.insertAt(0, 100);
        list.display();

    
}
}
