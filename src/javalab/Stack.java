package javalab;

public class Stack {
    private int[] data;
    private int size;
    private int tos;
    public static final int DEFAULT_CAPACITY = 10;

    Stack(int size) {
        this.data = new int[size];
        tos = 0;
    }

    Stack() {
        this.data = new int[DEFAULT_CAPACITY];
        tos = 0;
    }

    public Boolean isempty() {
        return this.size == 0;
    }

    public int getsize() {
        return this.size;
    }

    public void push(int data) throws Exception {
        if (this.getsize() == this.data.length) {
            throw new Exception("Stack is full");
        } else {

            this.data[tos] = data;
            size++;
            tos++;
        }

    }

    public int pop() throws Exception {
        if (isempty()) {
            throw new Exception("Stack is empty");
        } else {
            tos--;
            int data = this.data[tos];
            this.size--;
            return data;
        }
    }

    public void display() throws Exception {
        if (isempty()) {
            throw new Exception("Stack is empty");
        } else {
            for (int i = this.getsize()-1; i>=0; i--) {
                System.out.print(this.data[i] + " ");
            }
        }
    }
}
class test2{
    public static void main(String[] args) throws Exception {
        Stack s=new Stack(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.display();
        System.out.println();
        System.out.println(s.pop());
        s.display();
        System.out.println();
        System.out.println(s.getsize());
    }
}
