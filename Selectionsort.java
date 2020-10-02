package optimized_code;
import java.util.*;


public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int arr[]=new int[n];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter " +n+" Array Elements");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		//selection sort
		for(int i=0; i<n-1; i++)
		{
			int min=i;
			for(int j=i+1; j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		// display ele
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}	
		sc.close();
		}

}
