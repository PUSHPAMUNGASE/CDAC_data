package Heap;

public class heap_sort {
	static void heap_sort(int a[])

	{

		int i, j, current;

		boolean done;

		for (i = a.length - 1; i > 0; i--)// everytime one element is reduced

		{

			for (j = 0; j <= i; j++)// current will go j to till zero

			{

				current = j;

				done = true;

				while (current > 0 && current / 2 >= 0 && done == true)

				{

					if (a[current / 2] < a[current])// parent<child

					{

						int temp = a[current / 2];

						a[current / 2] = a[current];

						a[current] = temp;

						current = current / 2;// move to parent

					}

					else

						done = false;

				} // while

			} // for j

			// swap 0th with ith

			int temp = a[0];

			a[0] = a[i];

			a[i] = temp;

		} // for i

	}// code

	static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		int a[] = { 2, 8, 10, 6 };
		// print(a);
		heap_sort(a);
		print(a);

	}

}