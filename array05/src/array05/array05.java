package array05;

import java.util.Arrays;

public class array05 {

	public static void main(String[] args) {
	
		int arr1[] = {50,40,70,80,90,};
		int arr2[] = new int[5];
		//1�� ��� - ����
//		for(int i=0; i<arr1.length;i++) {
//			arr2[i] = arr1[i];
//		}
		//2�� ��� - array copy
		System.arraycopy(arr1, 1, arr2, 1, 3);
		
		/*
		 		System.out.print("arr1�迭:");
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%5d", arr1[i]);
		}
		System.out.println();
		
		System.out.print("arr2�迭:");
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
		 */
		
		//�迭�� ��� ���
		System.out.print("arr1�迭:");
		System.out.println(Arrays.toString(arr1));
		System.out.print("arr2�迭:");

		System.out.println(Arrays.toString(arr2));
		

		
		
		
	
		
	
	}
}
