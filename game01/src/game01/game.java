package game01;
import java.util.*;


public class game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"����","����","��"};
		int[] score = new int[3];  //���������� ���к�� �� ����
		String retry;//�ٽ��ѹ�
		
		System.out.println("***���� ���� �� ���� ***");
		do { 
			
			System.out.print("�����Է�(0-����/1-����/2-��) : ");
			int user = sc.nextInt();
			int com = (int)(Math.random()*3);
			
			System.out.println("������ " + s[user] + "�̰�, ��ǻ�ʹ� "  +  s[com] + "�Դϴ�.");
			int result = (user - com+3) % 3;
			switch(result) {
			case 1:
					System.out.println("user�� �¸��Ͽ����ϴ�.");
					++score[1];
					break;
			case 2:
					System.out.println("user�� �й��Ͽ����ϴ�.");
					++score[2];
					break;
					
			case 0:
				System.out.println("�����ϴ�.");
					++score[0];	
					break;
			}
			System.out.print("�ѹ��� �Ͻðڽ��ϱ�?(y/n) : ");
			retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		System.out.println("������ �·� : " + score[1] + " ��" + score[2] + " �� "+ score[0] + "���º�");
		
		sc.close();
		
		
	}

}
