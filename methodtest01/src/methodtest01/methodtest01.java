
package methodtest01;
import java.util.*; 
public class methodtest01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];

		for(int i=0; i<height.length; i++) {
			System.out.println("*** " + (i+1) + "��° �л�***");
			System.out.print("���� : ");
			height[i] = sc.nextInt();
			System.out.print("ü��:  ");
			weight[i] = sc.nextInt();
			System.out.print("����:  ");
			age[i] = sc.nextInt();

		}
		
		int maxheight = height[0];
		if(maxheight < height[1]) maxheight = height[1];
		if(maxheight < height[2]) maxheight = height[2];

		
		int maxweight = weight[0];
		if(maxweight < weight[1]) maxweight = weight[1];
		if(maxweight < weight[2]) maxweight = weight[2];

		
		int maxage = age[0];
		if(maxage < age[1]) maxage = age[1];
		if(maxage < age[2]) maxage = age[2];

		
		System.out.println("������ �ִ� : " + maxheight);
		System.out.println("ü���� �ִ� : " + maxweight);
		System.out.println("������ �ִ� : " + maxage);
		
		
		
		sc.close();

	}

}
