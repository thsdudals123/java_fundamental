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
		System.out.println("=== 메소드로 나누어 별표 찍기===");
		int a = sc.nextInt();
		//방법 1 - 메소드로 나누지 않았을 때
/*		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
*/
		//방법 2 - 메소드로 나누어 쓰기
		for(int i=1; i<=a;i++) {
			int result = drawstar(i);
			
		}

			
			
		sc.close();
	}

}
