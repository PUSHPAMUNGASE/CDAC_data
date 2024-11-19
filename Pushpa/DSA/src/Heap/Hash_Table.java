package Heap;

import java.util.Scanner;

//Implement a hash table using linear probing with a table size of 10 and a hash 
//function of x % 10 for indexing. The hash table should 
//efficiently store and retrieve key-value pairs.
public class Hash_Table {

	private  void hash(int[] a, int no){
		int i,temp;
		//int a[]=new int[10];
		for(i=0;i<10;i++) {
			temp=no%10 ;
			if(temp==i) {
				a[i]=no;
			}else {
				i++;
				if(a[i]==0) {
					a[i]=temp;
				}
			}
		}
		
		
	}
	
	
	
	static void print(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hash_Table obj=new Hash_Table();
		int a[] = new int[10];
		int no,ch;
		
		
		  
	
	}
	
}
