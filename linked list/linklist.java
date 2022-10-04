public class linklist {
    private class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public linklist(){
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
    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        linklist list = new linklist();
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(900);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();

    
}
}
