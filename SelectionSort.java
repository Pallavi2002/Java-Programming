package DSA;

public class SelectionSort {
	public static void selectionSort(int []arr, int n)
	{
		int i,j,t,min;

		for(i=0;i < n-1;i++)
		{
			min = i;
			for(j=i+1; j<n ;j++)
			{
				if(arr[min] > arr[j]) min=j;
			}
			if(i!=min)
			{
				t=arr[i];
				arr[i]=arr[min];
				arr[min]=t;
			}
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
		selectionSort(arr,n);
		display(arr,n);
	}
}
