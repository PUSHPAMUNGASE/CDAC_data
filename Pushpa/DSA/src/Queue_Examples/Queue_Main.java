package Queue_Examples;
//menu driven code for stack
import java.util.Scanner;
public class Queue_Main {
	


	
	    public static void main(String args[])
	    {
	        Scanner in=new Scanner(System.in);
	       // Queue_Class obj=new Queue_Class();//object created
	        Circular_Queue obj=new Circular_Queue();
	        System.out.println("Enter size of  queue:");
	        int size=in.nextInt();
	        obj. create_Queue(size);
	        int ch,e;
	        do
	        {
	            System.out.println(" queue Menu");
	            System.out.println("-----------");
	            System.out.println("1.insert in Queue");
	            System.out.println("2.Remove from Queue");
	            
	            System.out.println("3.Print all elements in Que");
	            System.out.println("0.Exit");
	            System.out.println("-----------");
	            System.out.println("Choice:");
	            ch=in.nextInt();
	            switch(ch)
	            {
	                case 1:
	                    if(obj.is_Full()!=true)//not full
	                    {
	                        System.out.println("Enter a number:");
	                        e=in.nextInt();
	                        obj. Enqueue(e);
	                    }
	                    else {
	                        System.out.println(" queueFull");
	                    }
	                    break;
	                case 2:
	                    if(obj.is_Empty()!=true)//not empty
	                    {
	                        System.out.println("Element poped is "+obj.Dequeue());
	                    }
	                    else {
	                        System.out.println("Queue Empty");
	                    }
	                    break;
	              
	                case 3:
	                    if(obj.is_Empty()!=true)//not empty
	                    {
	                        System.out.println("Elements in queue are\n");
	                        obj.print_Queue();;
	                    }
	                    else {
	                        System.out.println(" queue Empty");
	                    }
	                    break;
	                case 0:
	                    System.out.println("Thanks for using code , coded by amartechnavigator");
	                    break;
	                default:
	                    System.out.println("Wrong option selsected:");
	                    break;
	            }

	        }while(ch!=0);
	    }

	}

