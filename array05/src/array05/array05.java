package array05;

import java.util.Arrays;

public class array05 {

	public static void main(String[] args) {
	
		int arr1[] = {50,40,70,80,90,};
		int arr2[] = new int[5];
		//1번 방법 - 복사
//		for(int i=0; i<arr1.length;i++) {
//			arr2[i] = arr1[i];
//		}
		//2번 방법 - array copy
		System.arraycopy(arr1, 1, arr2, 1, 3);
		
		/*
		 		System.out.print("arr1배열:");
		for(int i=0; i<arr1.length; i++) {
			System.out.printf("%5d", arr1[i]);
		}
		System.out.println();
		
		System.out.print("arr2배열:");
		for(int i=0; i<arr2.length; i++) {
			System.out.printf("%5d", arr2[i]);
		}
		 */
		
		//배열의 출력 방법
		System.out.print("arr1배열:");
		System.out.println(Arrays.toString(arr1));
		System.out.print("arr2배열:");

		System.out.println(Arrays.toString(arr2));
		

		
		
		
	
		
	
	}
}
