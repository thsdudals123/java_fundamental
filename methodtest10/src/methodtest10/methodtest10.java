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
		
		System.out.println("�迭�� �Ųٷ� �ִ� ���α׷�");
		System.out.println("�迭�� ���� �Է�");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length;i++) {
			a[i] = (int)(Math.random()*100)+1;
		}
		System.out.print("reverse ��:");
		System.out.println(Arrays.toString(a));
		
		/* �޼ҵ� ���� 
		
		for(int i=0; i<a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length -1-i];
			a[a.length -1-i] = t;
		}
		*/
		
		// �޼ҵ� ����ؼ�
		
		
		
		reverse(a);

		System.out.print("reverse ��:");
		
		System.out.println(Arrays.toString(a));




		
		
	}

}
