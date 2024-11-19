package Sorting_Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//) Write a program to read ‘n’ integers and store them in a 
//Binary search tree and display the nodes level wise.


public class binary_search3 {

	
	private Node root;
	private HashMap< Node, Integer> insertionOrder; 

	void create_Tree() {
		root = null;
		insertionOrder = new HashMap<>(); 
	}

	void insert(Node r, Node n) {
		
		if (root == null) {
			root = n;
			System.out.println(n.data + " inserted");
			insertionOrder.put(n ,n.data); 
		} else {
			if (n.data < r.data) { 
				if (r.left == null) {
					r.left = n;
					System.out.println(n.data + " inserted");
					insertionOrder.put(n ,n.data); 
				} else {
					insert(r.left, n);
					insertionOrder.put(n ,n.data); 
				}
			} else { 
				if (r.right == null) {
					r.right = n;
					System.out.println(n.data + " inserted");
					insertionOrder.put(n ,n.data); 
				} else {
					insert(r.right, n);
					insertionOrder.put(n ,n.data); 
				}
			}
		}
	}

	// Display insertion order
	public List<Integer> displayInsertionOrder() {
		return displayInsertionOrder();
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
