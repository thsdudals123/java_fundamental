package bubblesort2;
import java.util.Arrays;
import java.util.Scanner;;


public class bubblesort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ���� �Է�: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*100); //0~99����
			for(int j=0; j<i; j++) {
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("�������� ��: ");;
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length-1; i++) {
			boolean cheked = false;
			for(int j=0; j<a.length-1-i; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
					cheked = true;
					
				}
			}
			
			System.out.print("  " + (i+1) + "ȸ�� ��:");
			System.out.println(Arrays.toString(a));
			if(!cheked) break;
		
			
		}
		System.out.print("�������� �� : ");
		System.out.println(Arrays.toString(a));

		
		
		sc.close();
	}

}
