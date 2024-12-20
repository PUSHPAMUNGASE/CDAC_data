package Linked_List_Examples;
  
public class Reverse_list {

	Node root;// linked list uses container ship-uses has a relation
	
	Stack_class obj;

	void create_list() {
		root = null;// preparing with empty root
	}
	
	
	void write_to_stack() {
		int length=0;
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				length++;
				t = t.next;
			}
		}
	}
	
	//create stack of size of length
	  
	    obj.create_Stack(length);
	    //read all element and push on stack
	    
	    

	    void push(int e) {
	        tos++;
	        stack[tos] = e;
	        System.out.println("Element " + e + " Pushed:");
	    }
	    

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;// n becomes 1st so root
		} else {
			n.next = root;// 1
			root = n;// 2
		}
		System.out.println(root.data + " inserted");

	}

	void insert(int data) {
		Node n = new Node(data);
		if (root == null)
			root = n;// n becomes 1st so root=
		else {
			Node t = root;
			while (t.next != null) {
				t = t.next;
			}
			t.next = n;
		}
		System.out.println(data + " inserted");

	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			while (t != null) {
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}
		}
	}

	public static void main(String args[]) {
		Reverse_list list1 = new Reverse_list();
		list1.create_list();
		list1.insert(5);
		list1.insert(15);
		list1.insert(20);
		list1.insert(25);
		System.out.println("List has");
		list1.print_list();

	}

}
