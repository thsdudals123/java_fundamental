package methodtest05;
import java.util.*;

public class methodtest05 {
	
	public static void count(int x) {
		
		for(int i=x; i>=0; i--) {
			System.out.println(i);
		}
	}
	
	

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
			
			System.out.println("***카운팅 프로그램");	
			System.out.print("정수입력 :");
			int n = sc.nextInt();
			count(n);
			
			sc.close();
	}

}
