package DSA;

public class QuickSort {
	public static int partition(int arr[],int low,int high)
	{
		int left,right,pivot,t;
		left=low; right = high; pivot=arr[low];
		while(left <= right)
		{
			while((arr[left]<=pivot) && (left<high))
				left++;

			while(arr[right] > pivot)
				right--;
			if(left < right)
			{
				t=arr[left]; arr[left] = arr[right]; arr[right]=t;
				left++ ; right--;
			}
			else left++;

		}
		arr[low] = arr[right];
		arr[right] = pivot;
		return right;
	}
	public static void quickSort(int arr[],int low,int high)
	{
		int pivloc;
		if(low >= high) return;
		//System.out.println("high = "+high);
		pivloc = partition(arr,low,high);
		quickSort(arr,low,pivloc-1);
		quickSort(arr,pivloc+1,high);
	}
	public static void main(String[] args) {
		int arr[]={48,44,19,59,72,80,42,65,82,8,95,68};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
			System.out.println(" "+arr[i]);
	}

}
