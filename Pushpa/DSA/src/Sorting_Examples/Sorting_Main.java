package Sorting_Examples;

 public class Sorting_Main {
	
	 
	static void bubble_sort(int a[]) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			
			}
			System.out.println(a[i]);
			
		}
	}
	 static void print_array(int 
			 a[]) {
		
		for(int index=0;index<a.length;index++) {
			//System.out.print(a[index]+" ,");
		}
			

		}

	public static void main(String[] args) {
		
		int a[]= {77,11,22,33,99,44,88,55,66};	
		//print_array(a);
		//bubble_sort(a);
	Quick_sort obj=new Quick_sort();
	obj.quick_sort(a,0, a.length-1);
	//merge_sort();

}
	
}