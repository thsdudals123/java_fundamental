import java.util.*;

public class arrray2dtest07 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("****성적처리 프로그램****");
		int n = sc.nextInt();
		int[][] a = new int[n][7];
		String[] subject = {"", "국어","영어","수학"};
		String[] title = {"NO","KOR","ENG","MAT","SUM","AVG","RANK"};
		for(int i=0; i<n; i++) {
			System.out.println("***" + (i+1) + "번째 학생 입력");
			a[i][0] = i+1;
			for(int j=1; j<4; j++) {
				System.out.print(subject[j] + "과목입력 :");
				a[i][j] = sc.nextInt();
			}
			
			
		}
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=1; j<4; j++) {
				sum = sum + a[i][j];
			}
			a[i][4] = sum;
			a[i][5] = sum / 3;
			
		}
		
		for(int i=0; i<n; i++) {
			int rank = 1;
			for(int j=0;j<n; j++) {
				if(a[i][4] < a[j][4]) {
					++rank;
				}
			}
			a[i][6] = rank;
		}
		
		
		System.out.println("**** 학생 성적 출력 ***");
		for(int i=0; i<title.length;i++) {
			System.out.printf("%5s", title[i]);

		}
		System.out.println();
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
			
			
		}
		
	}

}
