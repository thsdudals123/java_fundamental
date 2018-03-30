package methodtest10;
import java.util.*;

public class methodtest10 {
	
	public static void swap(int[] x, int idx1, int idx2) {
		int t = x[idx1];
		x[idx1] = x[idx2];
		x[idx2] = t;

	}
	public static void reverse(int[] x) {
		for(int i=0; i<x.length/2;i++) {
			swap(x, i, x.length-1-i);
		}
		//System.out.println(Arrays.toString(x));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열을 거꾸로 넣는 프로그램");
		System.out.println("배열의 개수 입력");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length;i++) {
			a[i] = (int)(Math.random()*100)+1;
		}
		System.out.print("reverse 전:");
		System.out.println(Arrays.toString(a));
		
		/* 메소드 없이 
		
		for(int i=0; i<a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length -1-i];
			a[a.length -1-i] = t;
		}
		*/
		
		// 메소드 사용해서
		
		
		
		reverse(a);

		System.out.print("reverse 후:");
		
		System.out.println(Arrays.toString(a));




		
		
	}

}
