package Heap;
import java.util.Scanner;
public class Check_hash {

	 private void insert(int[] hash, int key) {
	      
	        int ind = key % 10;

	       
	        while (hash[ind] != 0) {
	           
	            ind = (ind + 1) % 10;
	        }
	      
	        hash[ind] = key;
	    }

	    static void print(int[] hash) {
	        System.out.println("Hash Table:");
	        for (int i = 0; i < hash.length; i++) {
	            System.out.println("Index " + i + ": " + hash[i]);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Check_hash  obj = new Check_hash ();

	        int[] hashTable = new int[10];
	        int choice, key;

	        while (true) {
	            System.out.println("\n1. Insert\n2. Display Hash Table\n3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the key to insert: ");
	                    key = sc.nextInt();
	                    obj.insert(hashTable, key);
	                    break;

	                case 2:
	                    print(hashTable);
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }
	}
	
	

