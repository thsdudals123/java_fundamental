package array2Dtest06;
import java.util.*;

public class array2Dtest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String retry = null;
		
		int a[][] = new int[4][5];
		
	do {
		System.out.println("����� ��(1~45)");
		int in = sc.nextInt();
		int result = 0;
		//2���� �迭 �� ���, ���� ���� ����
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()*45)+1;
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}

			
			System.out.println();
		
		// ����Ǽ��� �迭�� �� ��
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if (in == a[i][j]) {
					result++;
				}
			}
		}
			

		switch(result) {
		case 0:
			System.out.println("���� ���Դϴ�.");
			break;
		case 1:
				System.out.println("������ ���Դϴ�.");
				break;
		case 2:
				System.out.println("���� �������Դϴ�.");
				break;
		case 3:
			System.out.println("��� ������ ���Դϴ�.");
			break;
		case 4:
			System.out.println("����� ���Դϴ�.");
			break;

		default:
			System.out.println("�ְ��� ���Դϴ�.");

			
		}			
		System.out.println("���߽� ������ " + result + "���Դϴ�.");
		System.out.println("�ѹ��� �Ͻðڽ��ϱ�(y/n) : ");
		retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
		
	}

}
