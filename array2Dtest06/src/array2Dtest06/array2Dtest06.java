package array2Dtest06;
import java.util.*;

public class array2Dtest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		String retry = null;
		
		int a[][] = new int[4][5];
		
	do {
		System.out.println("행운의 수(1~45)");
		int in = sc.nextInt();
		int result = 0;
		//2차원 배열 값 출력, 난수 생성 대입
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = (int)(Math.random()*45)+1;
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}

			
			System.out.println();
		
		// 행운의수와 배열의 값 비교
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if (in == a[i][j]) {
					result++;
				}
			}
		}
			

		switch(result) {
		case 0:
			System.out.println("보통 날입니다.");
			break;
		case 1:
				System.out.println("괜찬은 날입니다.");
				break;
		case 2:
				System.out.println("운이 좋은날입니다.");
				break;
		case 3:
			System.out.println("운수 대통인 날입니다.");
			break;
		case 4:
			System.out.println("대박인 날입니다.");
			break;

		default:
			System.out.println("최고의 날입니다.");

			
		}			
		System.out.println("맞추신 갯수는 " + result + "개입니다.");
		System.out.println("한번더 하시겠습니까(y/n) : ");
		retry = sc.next();
		}while(retry.equalsIgnoreCase("y"));
		
		sc.close();
		
	}

}
