package methodtest08;

import java.util.Scanner;

public class methodtest08 {
	public static int getmax(int[] x) {
		int max = x[0];
		for(int i =1; i<x.length;i++) {
			if(max < x[i])
				max = x[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("*** �ǰ�üũ ���α׷�***");
			System.out.println("�л� �� �Է�");
			int n = sc.nextInt();
			
			int[] height = new int[n];
			int[] weight = new int[n];
			int[] age = new int[n];
			
			
			for(int i=0;i<n;i++) {
				System.out.println("***" + (i+1) + "��° �л� ***");
				System.out.print("���� �Է� : ");
				height[i] = sc.nextInt();
				System.out.print("ü�� �Է� : ");
				weight[i] = sc.nextInt();
				System.out.print("���� �Է� : ");
				age[i] = sc.nextInt();

			}
			
			int maxheight = getmax(height);
			int maxweight = getmax(weight);
			int maxage = getmax(age);
			
			System.out.println("������ �ִ밪 : " + maxheight);
			System.out.println("ü���� �ִ밪 : " + maxweight);
			System.out.println("������ �ִ밪 : " + maxage);

		
		sc.close();
	}

}
