package mothodtest09;
import java.util.*;
public class mothodtest09 {
	//1�� ��� ã������ ����
	public static int linearsearch(int[] x,int n2) {
		int count = 0;
		System.out.println();
		for(int i=0;i<x.length;i++) {
			if(x[i] == n2) {
				count++;
			}	
		}
	return count;
	}
	
	//2���
	public static int linearsserch2(int[] x, int k) {
		int count=0;
		for(int i=0; i<x.length;i++) {
			if(x[i]==k) {
				System.out.print(i+1 + "��°");
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� �Է� : ");
		int n = sc.nextInt();
		System.out.print("�˻��� �� �Է� : ");

		int n2 = sc.nextInt();
		int[] count = new int[n];
		
		for(int i=0;i<n;i++) {
			int ran = (int)(Math.random()*10+1);
			count[i] = ran;
			System.out.print("    " + count[i]);

		}
		/* 1����� �޼ҵ�
		int a = linearsearch(count,n2);
		System.out.print(a +"�� ���� ");
		 */
		//2����� �޼ҵ�
		
		int count1=linearsserch2(count,n);
		if(count1==0) {
			System.out.println("�˻� ���� ���� ����");

		}else {
			System.out.println("�ֽ��ϴ�. \n�˻��� ����" + count1 + "���ֽ��ϴ�.");

		}
		
		
	}
	

}
