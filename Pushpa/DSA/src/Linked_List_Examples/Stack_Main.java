//package Linked_List_Examples;
//
//
//	
//	//menu driven code for stack
//	import java.util.Scanner;
//
//import Stack_Examples.Stack_Class;
//	public class Stack_Main
//	{
//	    public static void main(String args[])
//	    {
//	        Scanner in=new Scanner(System.in);
//	        //Stack_Class obj=new Stack_Class();//object created
//	        Dynamic_stack_class obj1 =new Dynamic_stack_class();
//	        
//	       // System.out.println("Enter size of stack:");
//	        //int size=in.nextInt();
//	        obj1.create_stack();
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
//	                	System.out.println("Enter element:");
//	                	e=in.nextInt();
//	                    obj1.push(e);
//	                    break;
//	                   
//	                 
//	                case 2:
//	                    
//	                      obj1.pop();
//	                      break;
//	                case 3:
//		                   obj1.peek();
//		                    break;
//	                  
//	                case 4:
//	                   obj1.print_stack();
//	                    break;
//	               
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
//
