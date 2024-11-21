package Queue_Examples;

public class Circular_Queue {
	

	
		 private int Q[], MaxSize, front,rear,count;

		    public void create_Queue(int size) {
		    	
		     count=0;
		        front=0;
		        rear=-1;
		        Q=new int[size];
		        MaxSize = size;//init MaxSize
		    }

		    public void Enqueue(int e) {//inserting in queue
		    	 rear=(rear+1)%MaxSize;
		    	  
		        Q[rear] = e;
		        count++;
		        System.out.println("Element " + e + " inserted:");
		    }

		    public boolean is_Full() {
		        if (count == MaxSize )
		            return true;
		        else
		            return false;
		    }

		   public  int Dequeue() {
		        int temp = Q[front];
		        front=(front+1)%MaxSize;
		        count--;
		        return (temp);

		        //return(stack[tos--]);
		    }

		   public boolean is_Empty() {
		        if (count==0)
		            return true;
		        else
		            return false;
		    }


		   public void print_Queue() {//lifo print
		        int i,c;
		        i=front;
		        c=0;
		        while(c<count) {
		        	System.out.println(Q[i]);
		        	i=(i+1)%MaxSize;
		        	c++;
		        }

		    }

			
	}

