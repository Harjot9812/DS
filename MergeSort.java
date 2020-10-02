package optimized_code;

import java.util.*;
public class MergeSort {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter "+n +" Array Elements: ");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int lb=0; 
		int ub=n-1;
		mergeSort(arr, lb, ub);
		System.out.println("Sorted List:");
		for(int c=0; c<n;c++)
		{
			System.out.print(arr[c]+" ");
		}
		sc.close();
	}
	public static void mergeSort(int arr[], int lb, int ub)
	{
		int mid;
		if(lb<ub)
		{
			mid=(lb+ub)/2;
			mergeSort(arr, lb,mid);
			mergeSort(arr, mid+1, ub);
			merge(arr, lb, mid, ub);
		}
	}
	public static void merge(int arr[], int lb, int mid, int ub)
	{
		int n=ub+1;
		int b[]=new int[n];
		int i=lb;
		int j=mid+1;
		int k=lb;
		while(i<=mid && j<=ub)
		{
			if(arr[i]<=arr[j])
			{
				b[k]=arr[i];
				i++;
				k++;
			}
			else {
				b[k]=arr[j];
				j++;
				k++;
			}
		}
		// left out ele
		if(i>mid)
		{
			while(j<=ub)
			{
				b[k]=arr[j];
				j++;
				k++;
			}
		}
		else {
			while(i<=mid)
			{
				b[k]=arr[i];
				i++;
				k++;
			}
		}
		for(int c=lb; c<n;c++)
		{
			arr[c]=b[c];
		}
	}
}
