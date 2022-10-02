public class queueusingarray{
    int[] data;
    int front;
    int next;
    int size;
    public queueusingarray(){
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
    void doublecapacity(){
        int[] temp = data;
        data = new int[2*temp.length];
        int index = 0;
        for(int i=front;i<temp.length;i++){
            data[index] = temp[i];
            index++;
        }
        for(int i=0;i<front-1;i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        next = temp.length;
    }
    public void enqueue(int element){
        if(size == data.length){
            doublecapacity();
        }
        data[next] = element;
        next = next + 1;
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = data[front];
        front = front + 1;
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
            int index = front + i;
            System.out.print(data[index]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        queueusingarray q=new queueusingarray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.front());
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
        q.dequeue();
        q.display();
    }
}