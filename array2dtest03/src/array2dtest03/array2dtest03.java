package array2dtest03;

public class array2dtest03 {

	public static void main(String[] args) {
		int[][] a = new int [3][]; //행의 개수
		a[0] = new int[4]; // 첫번째 행의 열의 개수
		a[1] = new int[4]; // 두번째 행의 열의 개수
		a[2] = new int[4]; // 세번째 행의 열의 개수
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++ ) {
				a[i][j] = (int)(Math.random() * 90) + 10;
					System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
			
		}
		
		
		
	}

}
