package test;
import java.util.*;


public class test {

	public static void set(int arr)
	{
		System.out.printf("%d", arr);
	}
	public static void set2(int arr)
	{
		int i,j,temp;
		
		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
				
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,in;
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<arr.length;i++)
		{
			in = sc.nextInt();
			arr[i]= in;

		}
		for(i=0;i<arr.length;i++)
		{
		set(arr[i]);
		}
		
		
		

	}

}
