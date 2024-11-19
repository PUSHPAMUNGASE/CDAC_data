package Stack_Examples;
import java.lang.Math;
public class Queue_binary_toDecimal {

	public class Queue_Class {
		 private int Q[], MaxSize, front,rear;
	

		    public void create_Queue(int size) {
		        front=0;
		        rear=-1;
		        Q=new int[size];
		        MaxSize = size;//init MaxSize
		     
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
			   int sum=0;
		        int temp = Q[front];
		        while(front>rear) {
		         sum=(int) (Q[front]*(Math.pow(2, MaxSize-1)));
		        front++;
		        MaxSize--;
		        
		        }
		        return (sum);
		        
				

		        //return(stack[tos--]);
		    }

		    
		    
	
}
}