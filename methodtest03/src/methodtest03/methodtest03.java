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
		
		System.out.print("실수 입력 : ");
		double a = sc.nextDouble();
		System.out.print("정수 입력:  ");
		int b = sc.nextInt();
		/*
		double result = 1;
		for(int i=0; i<b; i++) {
			result *= a;
		}
		System.out.println(a + "의 " + b + "승은 " + result + "입니다.");
		*/
		double result = power(a, b);  

		System.out.println(a + "의 " + b + "승은 " + result + "입니다.");

	sc.close();
		
	}

}
