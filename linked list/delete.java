public class delete {
    class Node{
        int data;
        Node next;
    }
    private Node head;
    private Node tail;
    private int size;
    public delete(){
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
    public void Delete(){
        Node temp = head;
        if(size == 0){
            System.out.println("List is empty");
        }
        else{
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
            size--;
        }
    }
    public void DeleteAt(int i){
        Node temp = head;
        int count = 0;
        if(i == 0){
            head = temp.next;
        }
        else{
            while(count < i-1 && temp.next != null){
                temp = temp.next;
                count++;
            }
            if(temp.next != null){
                temp.next = temp.next.next;
                size--;
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
        delete list = new delete();
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
        list.Delete();
        list.display();
        list.DeleteAt(4);
        list.DeleteAt(4);
        list.display();

    
}
}
