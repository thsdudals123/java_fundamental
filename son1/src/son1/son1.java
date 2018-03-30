package son1;

import java.util.*;

public class son1{

	public static void main(String[] args){


	int[] son = new int[5];
	
	Scanner sc = new Scanner(System.in);
	int sum=0;
	int avg=0;
	
	
	for(int i=0;i<5;i++)
	{
		son[i] = sc.nextInt();
		sum = sum + son[i];
		avg = avg + son[i];
	}

	for(int i=0;i<5;i++)
	{
		System.out.printf("%d",son[i]);

	}

		System.out.printf("%d",sum);
		System.out.printf("%d",avg);
	


















	}


}
