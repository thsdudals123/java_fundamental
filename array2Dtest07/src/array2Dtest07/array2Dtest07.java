package array2Dtest07;
import java.util.*;

public class array2Dtest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** ���� ó�� ���α׷� ***");
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();
		int[][] a = new int[n][7];

		int result = 0;
		int sum = 0;
		int avg = 0;
		
		//�л����� �������� ���� �Է�
		for(int i=0; i<n;i++) {
			System.out.print("���������Է�");
			int so1 = sc.nextInt();
			System.out.print("���������Է�");
			int so2 = sc.nextInt();
			System.out.print("���������Է�");
			int so3 = sc.nextInt();
			for(int j=1; j<4; j++) {
				switch(j) {
				case 1:
						a[i][j] = so1;
						System.out.print("��������");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;
				case 2:
						a[i][j] = so2;
						System.out.print("��������");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;	
				case 3:
						a[i][j] = so3;
						System.out.print("��������");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;
				}
				
			}
			System.out.print("  �հ�����  ");
			System.out.printf("%3d", sum);
			avg = sum / 3;
			System.out.print("  �������  ");
			System.out.printf("%3d", avg);

			System.out.println();
			
		}
				//�л��� ������ ����� ����ϴ� �κ�
		
		//�л��� ������ ����ϴ� �κ�
		
		//�л��� ��ü ����� ����ϴ� �κ�
		

		
	
		
		
		
	
	}

}
