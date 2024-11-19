package Sorting_Examples;

public class merge_sort {
	
	
	 static void merge_sort(int a[],int start,int end) {
		if(start<end) {
			int mid=(start+end)/2;
			merge_sort(a, start, mid);
			merge_sort(a, mid+1,end);
			merger(a, start,mid, end);
		}
		
		
	}
static void merger(int a[],int start,int mid,int end) {
	int i,j,t[],tindex;
	i=start;
	j=mid+1;
	//temp array to keep sorted data
	t=new int [a.length];
	tindex=start;
	//compare and copy in order;
	while(i<=mid && j<=end) {
		if(a[i]<a[j])
			t[tindex++]=a[i++];
		else
			t[tindex++]=a[i++];
	}
	//copy leftover
	while(i<=mid)
		t[tindex++]=a[i++];
	while(j<=end)
		t[tindex++]=a[i++];
	
	//copy back to a form temp;
	for(i=start;i<=end;i++)
		a[i]=t[i];
}
	
	
	
}
