package methodtest06;
import java.util.*;

public class methodtest06 {
	
	public static void drawchars(char c,int n) {
		for(int i=1; i<=n; i++) {
			System.out.print(c);

		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			int n = sc.nextInt();
			for(int i = 1;i<=n;i++){
			drawchars(' ', i-1);
			drawchars(c,n-i+1);
			System.out.println();
			}
			
			
	}

}
