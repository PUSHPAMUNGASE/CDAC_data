package AssignmentDSA21oct;
import java.util.Scanner;
public class SinglyLinkedListMain {

	
	
	          public static void main(String args[])
			    {
			        Scanner in=new Scanner(System.in);
			       singlyLinkedList obj =new singlyLinkedList();
			        obj.create_list();
			        int ch,e,key;
			        
			        do
			        {
			            System.out.println("\n1.insert");
			          
			            System.out.println("2.insert right");
			           
			            System.out.println("3.print element");
			           
			            System.out.println("4.search element");
			           
			            System.out.println("0.Exit");
			            System.out.println("-----------");
			            System.out.println("Choice:");
			            ch=in.nextInt();
			            switch(ch)
			            {
			                case 1:
			                	System.out.println("enter element");
			                	e=in.nextInt();
			                    obj.insert(e);
			                    break;
			                case 2:
			                	System.out.println("enter element");
			                	e=in.nextInt();
			                    obj.insert(e);
			                    break;
			              
			                case 3:
				                   obj.print_list();
				                    break;

			                case 4:
			                	System.out.println("enter element");
			                	key=in.nextInt();
				                   obj.searchNode(key);
			                    break;

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


