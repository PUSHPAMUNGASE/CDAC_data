package Linked_List_Examples;

public class Circular_Doubly_LinkedList_Class {

	Dnode root, last;

	void create_list() {
		root = last = null;// preparing with empty root
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = last = n;
		} else {
			n.right = root;
			root = n;
			root.left = last.right;
		}
		System.out.println(data + "inserted");
	}

	void delete_left() {

		if (root == null) {
			System.out.println("Empty List");
		} else {
			Dnode t;
			t = root;// 1
			root = root.right;
			root.left = last.right;// 2
			System.out.println(t.data + " deleted");
		}
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = last = n;
			last.right = root;
			root.left = last;
		} else {
			Dnode t = root;
			while (t.right != last) {
				t = t.right;

			}
			t.right = n;
			n.left = t;
			last = n;
			last.right = root;
			root.left = last;
		}

		System.out.println(data + " inserted");

	}

	void delete_right() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Dnode t, t2;
			t = t2 = root;// 1
			while (t != last) {
				t2 = t;
				t = t.right;
			}
			t2.right = null;
			t2.right = root.left;
			if (t == root)// single node root=null;//reset root as only node left else
				root = null;
			System.out.println(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = root;
			while (t.right != root) {
				System.out.print("<-|" + t.data + "|->");
				t = t.right;
			}
		}
	}

//	void print_list_rev() {
//	    if (root == null)
//	        System.out.println("List Empty");
//	    else {
//	        Dnode t = root;
//	        while (t!=root.left) {
//	                    t = t.right;
//	      
//	        
//	            System.out.print("<-|" + t.data + "|->");
//	            t = t.left;
//	        
//	        }
//	    }
//	}
//		
//		

	void print_list_rev() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Dnode t = last;
			// System.out.print("<-|" + t.data + "|->");
			while (t != root) {
				System.out.print("<-|" + t.data + "|->");
				t = t.left;
			}
			System.out.print("<-|" + root.data + "|->");
		}
	}

}
