package Linked_List_Examples;
	//menu driven code for stack
import java.util.Scanner;
public class Main {

	
		


		
		    public static void main(String args[])
		    {
		        Scanner in=new Scanner(System.in);
		       // Queue_Class obj=new Queue_Class();//object created
		       // Circular_LinkedList_Class obj= new Circular_LinkedList_Class();
		       // Doubly_LinkedList_Class obj =new Doubly_LinkedList_Class();
		       // Circular_Doubly_LinkedList_Class obj=new Circular_Doubly_LinkedList_Class();
		      Linked_List_Class obj =new  Linked_List_Class();
		        //System.out.println("Enter size of  queue:");
		        //int size=in.nextInt();
		        obj.create_list();
		        int ch,e,key;
		        
		        do
		        {
		            System.out.println("\n1.insert left");
		            System.out.println("2.delete left");
		            System.out.println("3.insert right");
		            System.out.println("4.delete right");
		            
		            System.out.println("5.print element");
		            System.out.println("6.reverse print");
		            System.out.println("6.search element");
		            System.out.println("7.delete element");
		            System.out.println("8.insert after");
		            System.out.println("9.insert before");
		            System.out.println("10.sort");
		            System.out.println("0.Exit");
		            System.out.println("-----------");
		            System.out.println("Choice:");
		            ch=in.nextInt();
		            switch(ch)
		            {
		                case 1:
		                	System.out.println("enter element");
		                	e=in.nextInt();
		                    obj.insert_left(e);
		                    break;
		                case 2:
		                    obj.delete_left();
		                    break;
		              
		                case 3:
		                	System.out.println("enter element");
		                	e=in.nextInt();
		                   obj.insert_right(e);
		                    break;
		                case 4:
		                   obj.delete_right();
		                    break;
		                case 5:
			                   obj.print_list();
			                    break;
//		                case 6:
//			                   obj.print_list_rev();
//			                    break;
//		                case 6:
//		                	System.out.println("enter element");
//		                	e=in.nextInt();
//			                   obj.search_list(e);
//			                    break;
//		                case 7:
//		                    System.out.println("Enter element:");
//		                    e = in.nextInt();
//		                    obj.delete_element(e);
//		                    break;
//		                case 8:
//		                    System.out.println("Enter element to insert after:");
//		                    e = in.nextInt();
//		                    System.out.println("Enter element to search:");
//		                     key = in.nextInt();
//		                    obj.insert_after(key,e);
//		                    System.out.println("Element Inserted");
//		                    break;
//		                    
//		                case 9:
//		                    System.out.println("Enter element to insert before:");
//		                    e = in.nextInt();
//		                    System.out.println("Enter element to search:");
//		                     key = in.nextInt();
//		                    obj.insert_before(key, e);
//		                    System.out.println("Element Inserted");
//		                    break;
		                case 10:System.out.println("sort data:");
		                obj.sort(obj.root);
		                case 0:
		                    System.out.println("Exiting....");
		                    break;
		                default:
		                    System.out.println("Wrong option selsected:");
		                    break;
		            }

		        }while(ch!=0);
		    }

		}



