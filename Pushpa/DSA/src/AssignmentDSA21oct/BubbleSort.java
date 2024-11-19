package AssignmentDSA21oct;

public class BubbleSort {
	static void BubbleSort(char a[]) {
		int i,j;
	for( i=0;i<a.length;i++) {
		for(j=0;j<a.length-1-i;j++) {
			if(a[j]>a[j+1]) {
				char temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
}
	
	
	static void print_array(char a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ,");
		}
	}
	
	
	public static void main(String[] args) {
		char a[]= {'p','u','s','h','p','a'};
		BubbleSort(a);
		print_array(a);
	}
}