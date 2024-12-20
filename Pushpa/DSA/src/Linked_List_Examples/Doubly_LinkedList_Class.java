package Linked_List_Examples;

public class Doubly_LinkedList_Class {

	Dnode root;
	
	void create_list() {
		root=null;
	}
	
	
	
	void insert_left(int data) {
		Dnode n=new Dnode(data);
		if(root==null) 
		{
			root=n;
		}else {
			n.right=root;
			root=n;
		}
		System.out.println(data+"inserted");
	}
	
	
	
	void delete_left()
	{
		
	if(root==null)
	{
	System.out.println("Empty List");
	}
	else
	{
	Dnode t;
	t=root;//1
	root=root.right;
	root.left=null;//2 
	System.out.println(t.data+" deleted");
	}
	}
	
	
	
	
	
	void insert_right(int data)
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

	

void delete_right()
{
if(root==null)
System.out.println("Empty List");
else
{
Dnode t,t2;
t=t2=root;//1 
while(t.right!=null)
{
t2=t;
t=t.right;
}
t2.right=null;
if(t==root)//single node root=null;//reset root as only node left else
root=null;
System.out.println(t.data + " deleted");
}
}



void print_list()
{
if(root==null)
System.out.println("List Empty");
else
{
Dnode t=root;
while(t!=null)
{ System.out.print("<-|"+t.data+"|->");
t=t.right;
}
}
}


void print_list_rev() {
    if (root == null)
        System.out.println("List Empty");
    else {
        Dnode t = root;
        while (t.right != null)
                    t = t.right;
        while(t!=null)
        {
            System.out.print("<-|" + t.data + "|->");
            t = t.left;
        }
    }
}
	
	
	
	
	
	
	
}
