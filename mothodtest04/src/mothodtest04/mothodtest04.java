package mothodtest04;
import java.util.*;

public class mothodtest04 {
	public static int drawstar(int x) {
		int result = 1;
		for(int j=1; j<=x; j++) {
			System.out.print("*");
			
		}
		System.out.println();

		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== �޼ҵ�� ������ ��ǥ ���===");
		int a = sc.nextInt();
		//��� 1 - �޼ҵ�� ������ �ʾ��� ��
/*		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
*/
		//��� 2 - �޼ҵ�� ������ ����
		for(int i=1; i<=a;i++) {
			int result = drawstar(i);
			
		}

			
			
		sc.close();
	}

}
