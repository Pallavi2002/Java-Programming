package DSA;

public class InsertionSort {
	public static void insertion_sort(int arr[],int n) {

		int i,j,k;
		for(i=1; i<n; i++) // starts from 2nd array element
		{
			k=arr[i]; /*k is to be inserted at proper place*/
			for(j=i-1; j>=0 && k<arr[j]; j--)//looks at lower part of arr

				for(j=i-1; j>=0 && k<arr[j]; j--)//looks at lower part of arr
					arr[j+1]=arr[j];
			arr[j+1]=k;
		}
	}

	public static void display(int []arr, int n)
	{
		int i;
		System.out.println();
		for(i=0;i<n;i++)
			System.out.print(arr[i] + " ");

	}
	public static void main(String[] args) {
		int arr[] = {12,20,15,30,50,35,22,70,55,60};
		int n = arr.length;
		insertion_sort(arr,n);
		display(arr,n);
	}
}
