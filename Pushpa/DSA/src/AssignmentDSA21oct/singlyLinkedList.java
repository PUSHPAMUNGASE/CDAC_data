package AssignmentDSA21oct;



public class singlyLinkedList {

	Node root;
	 void create_list(){
		root=null;
	}
	  void insert(int data) {
		  Node n=new Node(data);
		  if(root==null) {
			  root=n;
		  }else {
			  Node t;
			  t=root;
			  while(t.next!=null) {
				  t=t.next;
			  }
			  t.next=n;
			  
		  }
		  System.out.println(data+" inserted!!");
	  }
	  
	   void  searchNode(int data)
	   {
		   if(root==null) {
			   System.out.println("Empty list!!");
		   }else {
			   Node t;
			   t=root;
			   while(t!=null) {
				   if(t.data==data) {
					   System.out.println(t.data+" present in the list");
					   break;
				   }
				   t=t.next;
				   
			   }
			  
			   if(t==null) {
			   System.out.println(data +" not found in the list!!");
			   }
		   }
		   
	   }
	   
	   

              void print_list()
                 {
                 if(root==null)
                 System.out.println("List Empty");
                 else
                {
                Node t=root;
             while(t!=null)
                {                       
            	 System.out.print("|"+t.data+"|->");
                 t=t.next;
             }
          }
      } 
	   
}
