package javalab;

public class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;//changes will be in the local variable only
    }
    void change(Operation op){
        op.data=op.data+100;//changes will be in the instance variable
    }
    public static void main(String args[]){
        Operation op=new Operation();
        //call by value
        System.out.println("before change "+op.data);
        op.change(500);
        System.out.println("after change "+op.data);
        //call by reference
        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }

}



