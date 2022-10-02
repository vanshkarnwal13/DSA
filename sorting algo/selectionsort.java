import java.util.Scanner;
public class selectionsort {
    void sort(int arr[],int n)
	{
		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	void printArray(int arr[], int n)
	{
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		selectionsort ob = new selectionsort();
        Scanner sc = new Scanner(System.in);
		int[] arr;
        int n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
		ob.sort(arr,n);
		System.out.println("Sorted array");
		ob.printArray(arr,n);
	}
}
