package methodtest03;
import java.util.*;
public class methodtest03 {
	
	public static double power(double x, int n){
		double result = 1;
		for(int i=0; i<n; i++) {
			result *= x;}
		return result;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Ǽ� �Է� : ");
		double a = sc.nextDouble();
		System.out.print("���� �Է�:  ");
		int b = sc.nextInt();
		/*
		double result = 1;
		for(int i=0; i<b; i++) {
			result *= a;
		}
		System.out.println(a + "�� " + b + "���� " + result + "�Դϴ�.");
		*/
		double result = power(a, b);  

		System.out.println(a + "�� " + b + "���� " + result + "�Դϴ�.");

	sc.close();
		
	}

}
