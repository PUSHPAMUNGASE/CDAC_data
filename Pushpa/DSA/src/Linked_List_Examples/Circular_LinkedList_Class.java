//package Linked_List_Examples;
//
//public class Circular_LinkedList_Class {
//	Node root,last;//linked list uses container ship-uses has a relation
//	void create_list()
//	{
//	root=last=null;//preparing with empty root 
//	}
//
//	
//	
//	void insert_left(int data)
//	{
//	Node n=new Node(data);
//	if(root==null)
//	{
//	root=last=n;//n becomes 1st so root
//	last.next=root;
//	}
//	else
//	{
//	n.next=root;//1
//	root=n;//2 
//	last.next=root;//3
//	}
//	System.out.println(data+" inserted");
//
//	}
//
//
//
//	void delete_left()
//	{
//	if(root==null ||last==null)
//	{
//	System.out.println("Empty List");
//	}else {
//		if(root==last) {
//			root=last=null;
//		}
//	Node t;
//	t=root;//1
//	root=root.next;//2 
//	last.next=root;
//	
//	System.out.println(t.data+" deleted");
//	}
//	}
//
//
//
//
//
//	void insert_right(int data)
//	{
//	Node n=new Node(data);
//	if(root==null) {
//	root=last=n;//n becomes 1st so root=
//	last.next=root;
//	} else
//		
//	{
//	
//	//t.next=n;   at the end t automatically become last
//	last.next=n;//1
//	last=n;//2
//	last.next=root;//3
//	}
//
//	System.out.println(root.data+" inserted");
//
//	}
//	
//	
//
//
//
//
//
//	void delete_right()
//	{
//	if(root==null)
//	System.out.println("Empty List");
//	else
//	{
//	Node t,t2;
//	t=t2=root;//1 
//	while(t!=last)
//	{
//	t2=t;
//	t=t.next;
//	}
//	last=t2;
//	//t2.next=root;
//	last.next=root;
//	
//	if(last==root)//single node root=null;//reset root as only node left else
//	root = null;
//	System.out.println(t.data + " deleted");
//	}
//	}
//
//
//
//
//	   void print_list() {
//           if (root == null)
//               System.out.println("List Empty");
//           else {
//               Node t = root;
//               do{
//                   System.out.print("|" + t.data + "|->");
//                   t = t.next;
//               } while (t != root);
//           }
//       }
//
//}