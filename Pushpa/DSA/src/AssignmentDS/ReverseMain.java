//package AssignmentDS;
////menu driven code for stack
//	import java.util.Scanner;
//public class ReverseMain {
//	
//	
//	public class Stack_Main
//	{
//	    public static void main(String args[])
//	    {
//	        Scanner in=new Scanner(System.in);
//	        ReverseString obj =new ReverseString();
//	        //Stack_Class obj=new Stack_Class();//object created
//	        System.out.println("Enter size of stack:");
//	        int sentense=in.nextInt();
//	        obj.create_Stack(sentense);
//	        int ch,e;
//	        do
//	        {
//	            System.out.println("Stack Menu");
//	            System.out.println("-----------");
//	            System.out.println("1.Push");
//	            System.out.println("2.Pop");
//	            System.out.println("3.Peek");
//	            System.out.println("4.Print all elements");
//	            System.out.println("0.Exit");
//	            System.out.println("-----------");
//	            System.out.println("Choice:");
//	            ch=in.nextInt();
//	            switch(ch)
//	            {
//	                case 1:
//	                    if(obj.is_Full()!=true)//not full
//	                    {
//	                        System.out.println("Enter a number:");
//	                        e=in.nextInt();
//	                        obj.push(e);
//	                    }
//	                    else {
//	                        System.out.println("Stack Full");
//	                    }
//	                    break;
//	                case 2:
//	                    if(obj.is_Empty()!=true)//not empty
//	                    {
//	                        System.out.println("Element poped is "+obj.pop());
//	                    }
//	                    else {
//	                        System.out.println("Stack Empty");
//	                    }
//	                    break;
//	                case 3:
//	                    if(obj.is_Empty()!=true)//not empty
//	                    {
//	                        System.out.println("Element @peek is  "+obj.peek());
//	                    }
//	                    else {
//	                        System.out.println("Stack Empty");
//	                    }
//	                    break;
//	                case 4:
//	                    if(obj.is_Empty()!=true)//not empty
//	                    {
//	                        System.out.println("Elements in stack are\n");
//	                        obj.print_Stack();
//	                    }
//	                    else {
//	                        System.out.println("Stack Empty");
//	                    }
//	                    break;
//	                case 0:
//	                    System.out.println("Thanks for using code , coded by amartechnavigator");
//	                    break;
//	                default:
//	                    System.out.println("Wrong option selsected:");
//	                    break;
//	            }
//
//	        }while(ch!=0);
//	    }
//
//	}
//}