package methodtest07;

public class methodtest07 {

		static int x = 700; //��������(global variable)
		static int y = 900;		
		public static void printx() {
			System.out.println("3��x = " + x);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1��x = " + x);
		
		int x = 800; //��������(local variable)
		
		System.out.println("2��x = " + x);
		printx();
		System.out.println("4��x = " + methodtest07.x);
		
		System.out.println("1��y = " + y);
		

	}

}
