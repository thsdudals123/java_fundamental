package array2Dtest07;
import java.util.*;

public class array2Dtest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*** 성적 처리 프로그램 ***");
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();
		int[][] a = new int[n][7];

		int result = 0;
		int sum = 0;
		int avg = 0;
		
		//학생별로 세과목의 성적 입력
		for(int i=0; i<n;i++) {
			System.out.print("국어점수입력");
			int so1 = sc.nextInt();
			System.out.print("영어점수입력");
			int so2 = sc.nextInt();
			System.out.print("수학점수입력");
			int so3 = sc.nextInt();
			for(int j=1; j<4; j++) {
				switch(j) {
				case 1:
						a[i][j] = so1;
						System.out.print("국어점수");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;
				case 2:
						a[i][j] = so2;
						System.out.print("영어점수");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;	
				case 3:
						a[i][j] = so3;
						System.out.print("수학점수");
						System.out.printf("%3d", a[i][j]);
						sum = a[i][j] + sum;
						break;
				}
				
			}
			System.out.print("  합계점수  ");
			System.out.printf("%3d", sum);
			avg = sum / 3;
			System.out.print("  평균점수  ");
			System.out.printf("%3d", avg);

			System.out.println();
			
		}
				//학생의 총점과 평균을 계산하는 부분
		
		//학생의 석차를 계산하는 부분
		
		//학생의 전체 결과를 출력하는 부분
		

		
	
		
		
		
	
	}

}
