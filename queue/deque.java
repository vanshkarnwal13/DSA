public class deque{
    int[] data;
    int front;  
    int next;
    int size;
    public deque(){
        data = new int[5];
        front = 0;
        next = 0;
        size = 0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void addFirst(int element){
        if(size == data.length){
            System.out.println("Queue is full");
            return;
        }
        front = (front - 1)%data.length;
        data[front] = element;
        size++;
    }
    public void addLast(int element){
        if(size == data.length){
            System.out.println("Queue is full");
            return;
        }
        
        data[next] = element;
        next = (next + 1)%data.length;
        size++;
    }
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[front];
        front = (front + 1)%data.length;
        size--;
        return temp;
    }
    public int removeLast(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[next];
        next = (next - 1 )%data.length;
        size--;
        return temp;
    }
    public int getFirst(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }
    public int getLast(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[(next - 1 + data.length)%data.length];
    }
    public void display(){
        for(int i=0;i<size;i++){
            int index = (front + i)%data.length;
            System.out.print(data[index]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        deque q=new deque();
        
        
        q.addLast(60);
        q.addLast(70);
        q.addLast(80);
        q.addLast(90);
        q.addLast(100);
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        q.display();
        q.removeFirst();
        q.removeLast();
        q.display();
        q.addFirst(20);
        q.addFirst(30);
        q.addFirst(10);
        q.display();
        System.out.println(q.getFirst());
        System.out.println(q.getLast());
        q.removeLast();
        q.display();
        q.addFirst(10);
        q.display();
    }
    
}