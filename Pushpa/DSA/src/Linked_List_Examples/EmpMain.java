//package Linked_List_Examples;
//import java.util.Scanner;
//public class EmpMain {
//
//	public static void main(String[] args) {
//	
//        int ch,e,key,empNo = 0;
//        String name = null,email=null;
//        float salary = 0;
//		 
//		 EmpLinkedList obj=new EmpLinkedList();
//	     Scanner in= new Scanner(System.in);
//	 	obj.create_list();
//		
//		
//        
//        do{
//          
//            System.out.println("1.Add Employee");
//            System.out.println("2.Display employee");
//            System.out.println("3.Search Employee");
//            System.out.println("4.Delete Emplayee");
//          
//            
//            System.out.println("0.Exit");
//            System.out.println("-----------");
//            System.out.println("Choice:");
//            ch=in.nextInt();
//            switch(ch)
//            {
//                case 1:
//                    
//                     System.out.println("Enter Emp no:");
//                     empNo=in.nextInt();
//                     System.out.println("Enter Emp name:");
//                     name=in.next();
//                     System.out.println("Enter Salary:");
//                     salary=in.nextFloat();
//                     System.out.println("Enter email");
//                     email=in.next();
//                     Emp emp2 = new Emp(empNo,name ,salary, email);
//                     obj.insert_right(emp2);
//                     break;
//                case 2:
//                	 obj.print_list();
//	                    break;
//              
//                case 3:
//                	
//                	 obj.print_list();
//	                    break;
//                case 4:
//                	 System.out.println("Enter element:");
//                     key = in.nextInt();
//                     //obj.delete_element(Emp.empNo);
//                     break;
//                case 5:
//	                   obj.print_list();
//	                    break;
//        
//                case 0:
//                    System.out.println("Exiting....");
//                    break;
//                default:
//                    System.out.println("Wrong option selsected:");
//                    break;
//            }
//
//        }while(ch!=0);
//    }
//}
//
//	
//
//
