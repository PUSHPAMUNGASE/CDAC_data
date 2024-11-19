package Sorting_Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// B) Write menu driven program for Binary Search Tree. The menu includes 
// - Create a Binary Search Tree
// - Display
// - Delete a given element from Binary Search Tree

public class binary_search2 {

	private Node root;
	private List<Integer> insertionOrder; 

	void create_Tree() {
		root = null;
		insertionOrder = new ArrayList<>(); 
	}

	void insert(Node r, Node n) {
		
		if (root == null) {
			root = n;
			System.out.println(n.data + " inserted");
			insertionOrder.add(n.data); 
		} else {
			if (n.data < r.data) { 
				if (r.left == null) {
					r.left = n;
					System.out.println(n.data + " inserted");
					insertionOrder.add(n.data); 
				} else {
					insert(r.left, n);
				}
			} else { 
				if (r.right == null) {
					r.right = n;
					System.out.println(n.data + " inserted");
					insertionOrder.add(n.data); 
				} else {
					insert(r.right, n);
				}
			}
		}
	}

	// Display insertion order
	public List<Integer> displayInsertionOrder() {
		return insertionOrder;
	}

	Node get_root() {
		return root;
	}

	public static void main(String args[]) {
		binary_search2 obj = new binary_search2();
		obj.create_Tree();
		Scanner in = new Scanner(System.in);
		int ch, val;
		do {
			System.out.println("\n1. Enter element in tree");
			System.out.println("2. Display insertion order");
			System.out.println("0. Exit");

			System.out.println("Enter choice:");
			ch = in.nextInt();

			switch (ch) {
			case 1:
				System.out.println("\nEnter element to insert in tree:");
				val = in.nextInt();
				obj.insert(obj.get_root(), new Node(val));
				System.out.println(val + " added to the tree!");
				break;

			case 2:
				System.out.println("\nElements in insertion order are:");
				System.out.println(obj.displayInsertionOrder());
				break;

			case 0:
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
			}

		} while (ch != 0);

		in.close();
	}
}



