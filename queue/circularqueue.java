public class circularqueue{
    int[] data;
    int front;
    int next;
    int size;
    public circularqueue(){
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
    public void enqueue(int element){
        if(size == data.length){
            System.out.println("Queue is full");
            return;
        }
        data[next] = element;
        next = (next + 1)%data.length;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[front];
        front = (front + 1)%data.length;
        size--;
        return temp;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return data[front];
    }
    public void display(){
        for(int i=0;i<size;i++){
            int index = (front + i)%data.length;
            System.out.print(data[index]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        circularqueue q=new circularqueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.front());
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(60);
        q.enqueue(330);
        q.enqueue(800);
        q.display();
    }
}