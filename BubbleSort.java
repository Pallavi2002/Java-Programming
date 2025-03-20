package DSA;

public class BubbleSort {
	public static int[] Bubble_sort(int arr[],int n)
	{
		int i,j,t;
		int flag = 1;

		for(i=n-1;((i>=0)&&(flag==1));i--)
		{
			flag=0;
			for(j=0;j<=i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					flag=1;
					t=arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			if(flag==0)
				break;
		}
		return arr;
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
		Bubble_sort(arr,n);
		display(arr,n);
	}
}