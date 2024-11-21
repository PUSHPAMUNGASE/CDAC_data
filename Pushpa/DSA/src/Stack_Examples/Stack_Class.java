package Stack_Examples;

public class Stack_Class {
	private int stack1[],stack2[], MaxSize, tos;

    public void create_Stack(int size) {
        tos = -1;//init tos
        stack1 = new int[size];//create stack
        MaxSize = size;//init MaxSize
        stack2 = new int [size];
    }

    void push(int e) {
        tos++;
        stack[tos] = e;
        System.out.println("Element " + e + " Pushed:");
    }

    boolean is_Full() {
        if (tos == MaxSize - 1)
            return true;
        else
            return false;
    }

    int pop() {
        int temp = stack[tos];
        tos--;
        return (temp);

        //return(stack[tos--]);
    }

    boolean is_Empty() {
        if (tos == -1)
            return true;
        else
            return false;
    }

    int peek() {
        return (stack[tos]);
    }

    void print_Stack() {//lifo print
        System.out.println("Stack has");
        for (int i = tos; i >= 0; i--) {
            System.out.println(stack[i]);
        }

    }
}