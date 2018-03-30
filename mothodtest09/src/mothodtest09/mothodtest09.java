package mothodtest09;
import java.util.*;
public class mothodtest09 {
	//1번 방법 찾은개수 착기
	public static int linearsearch(int[] x,int n2) {
		int count = 0;
		System.out.println();
		for(int i=0;i<x.length;i++) {
			if(x[i] == n2) {
				count++;
			}	
		}
	return count;
	}
	
	//2방법
	public static int linearsserch2(int[] x, int k) {
		int count=0;
		for(int i=0; i<x.length;i++) {
			if(x[i]==k) {
				System.out.print(i+1 + "번째");
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 갯수 입력 : ");
		int n = sc.nextInt();
		System.out.print("검색할 값 입력 : ");

		int n2 = sc.nextInt();
		int[] count = new int[n];
		
		for(int i=0;i<n;i++) {
			int ran = (int)(Math.random()*10+1);
			count[i] = ran;
			System.out.print("    " + count[i]);

		}
		/* 1번방법 메소드
		int a = linearsearch(count,n2);
		System.out.print(a +"번 성공 ");
		 */
		//2번방법 메소드
		
		int count1=linearsserch2(count,n);
		if(count1==0) {
			System.out.println("검색 존재 하지 않음");

		}else {
			System.out.println("있습니다. \n검색한 값이" + count1 + "개있습니다.");

		}
		
		
	}
	

}
