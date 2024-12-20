package Sorting_Examples;

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
//
//Data Structure
//A) Write menu driven program  for Binary Search Tree. The menu includes 
//-	Create a Binary Search Tree
//-	Traverse it by using Preorder and Post order traversing technique

public class Binary_Search {

	private Node root;

	void create_Tree() {
		root = null;
	}

	void insert(Node r, Node n)// in bst manner
	// r is root , n is new node
	{
		if (root == null)
			root = n;
		else {
			if (n.data < r.data)// if less to left
			{
				if (r.left == null)// empty left
				{
					r.left = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.left, n);// recursion call
			} else// if equal or greater than to right
			{
				if (r.right == null)// empty left
				{
					r.right = n;
					System.out.println(n.data + " inserted");
				} else
					insert(r.right, n);// recursion call

			}

		}
		

	}

	void preorder(Node r) {
		if (r != null) {// PLR
			System.out.print(r.data + ",");// P
			preorder(r.left);// L
			preorder(r.right);// R
		}
	}

	void postorder(Node r) {
		if (r != null) {// LRP
			postorder(r.left);// L
			postorder(r.right);// R
			System.out.print(r.data + ",");// P

		}
	}

	Node get_root() {
		return root;
	}

	public static void main(String args[]) {
		Binary_Search obj = new Binary_Search();
		obj.create_Tree();
		Node x = new Node(10);
		Scanner in = new Scanner(System.in);
		int ch, val;
		do {
			System.out.println("1.Enter element in tree");
            System.out.println("2.preorder");
			System.out.println("3.postorder");
			System.out.println("Enter choice:");
			ch = in.nextInt();

			switch (ch) {
			case 1:
				System.out.println("\nEnter element in tree:");
				val = in.nextInt();
				obj.insert(obj.get_root(), new Node(val));
				System.out.println(val+" added in tree!!");
				break;
			
			case 2:
				System.out.println("\nTree in Pre-order:");
				obj.preorder(obj.get_root());
				break;

			case 3:
				System.out.println("\nTree in Postorder:");
				obj.postorder(obj.get_root());
				break;
			case 0: System.out.println("Exiting....");
            break;
			}

		} while (ch != 0);

	}


}
