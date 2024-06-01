package Stack;

import java.util.Stack;

class CustomStack {
    int[] stack;
    int top;
    int cap;

    CustomStack(int cap)
    {
        this.stack=new int[cap];
        this.top=-1;
        this.cap=cap;

    }

    //this is the method for adding data into stack
    public void push(int data)
    {
        if(top==this.cap-1)
        {
            System.out.println("StackOverFlow : stack is full ");
            return;
        }
        top++;
        stack[top]=data;
    }

    //this is the method for removing a data from stack
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("StackUnderFlow : stack is Empty ");
            return -1;
        }
        int data=stack[top];
        top--;
        System.out.println("Remove data from stack : "+data);
        return data;
    }

    public int peek()
    {
        if(top==-1)
        {
            System.out.println("StackUnderFlow : stack is Empty ");
            return -1;
        }
        return stack[top];
    }



}


public class StackTest{

    public static void main(String[] args) {

        /*CustomStack stack=new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.push(60);
        stack.push(70);*/


        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }

}
