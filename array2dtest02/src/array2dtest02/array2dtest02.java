package array2dtest02;
import java.util.*;

public class array2dtest02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�� �� �Է�:");
		int h = sc.nextInt();
		System.out.print("�� �� �Է�:");
		int w = sc.nextInt();
		
		int[][] a = new int[h][w];
		
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				a[i][j] = (int)(Math.random()*90)+10;
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
		}
		
		/*
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++) {
				System.out.printf("%3d", a[i][j]);
			}
			System.out.println();
			
		}
		*/
		
		
		sc.close();
		
	}

}
