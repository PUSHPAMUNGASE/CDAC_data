package AssignmentDSA21oct;

import Linked_List_Examples.Dnode;

public class DoublyLinkedListOddValue {

	Dnode root;
	
	void create_list() {
		root=null;
	}
	
	
	
	
	void insert(int data)
	{
	Dnode n=new Dnode(data);
	if(root==null)
	root=n;//n becomes 1st so root=
	 else
	{
	Dnode t=root;
	while(t.right!=null)
	{ t=t.right;

	}
	t.right=n;
	}

	System.out.println(data+" inserted");

	}

}
