package Queue_Examples;

import Stack_Examples.Stack_Class;

public class Queue_Class {
	 private int Q[], MaxSize, front,rear;
	 Stack_Class obj1,obj2;

	    public void create_Queue(int size) {
	        front=0;
	        rear=-1;
	        Q=new int[size];
	        MaxSize = size;//init MaxSize
	        obj1 = new  Stack_Class();
	        
	        obj2=new  Stack_Class();
	    }

	    public void Enqueue(int e) {//inserting in queue
	        rear++;
	        Q[rear] = e;
	        System.out.println("Element " + e + " inserted:");
	    }

	    public boolean is_Full() {
	        if (front == MaxSize - 1)
	            return true;
	        else
	            return false;
	    }

	   public  int Dequeue() {
	        int temp = Q[front];
	        front++;
	        return (temp);

	        //return(stack[tos--]);
	    }

	   public boolean is_Empty() {
	        if (front>rear)
	            return true;
	        else
	            return false;
	    }


	   public void print_Queue() {//lifo print
	        System.out.println("Stack has");
	        for (int i =front ; i <=rear; i++) {
	            System.out.print(Q[i]+"--");
	        }

	    }

		
}
