class stackusingarray {
    int[] data;
    int nextindex;
    int capacity;
    stackusingarray(){
        data = new int[5];
        nextindex=0;
        capacity=5;
    }
    void doublecapacity(){
        int[] temp=new int[capacity*2];
        for(int i=0;i<capacity;i++){
            temp[i]=data[i];
        }
        data=temp;
        capacity=capacity*2;
    }
    int size(){
        return nextindex;
    }
    boolean isEmpty(){
        return nextindex==0;
    }
    void push(int element){
        if(nextindex==capacity){
            doublecapacity();
        }
        data[nextindex]=element;
        nextindex++;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        nextindex--;
        return data[nextindex];
    }
    int top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return data[nextindex-1];
    }
    void display(){
        for(int i=0;i<nextindex;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        stackusingarray s=new stackusingarray();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.display();
        s.push(400);
        s.push(500);
        s.display();

    }

    
}
