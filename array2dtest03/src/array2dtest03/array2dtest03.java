package array2dtest03;

public class array2dtest03 {

	public static void main(String[] args) {
		int[][] a = new int [3][]; //���� ����
		a[0] = new int[4]; // ù��° ���� ���� ����
		a[1] = new int[4]; // �ι�° ���� ���� ����
		a[2] = new int[4]; // ����° ���� ���� ����
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length;j++ ) {
				a[i][j] = (int)(Math.random() * 90) + 10;
					System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
			
		}
		
		
		
	}

}
