	class Data1 {
		int value;
		Data1(){
			System.out.println("data1디폴트 생성자");
		}
	}
	
	class Data2 {
		int value;
		

		Data2(){
			System.out.println("data2디폴트 생성자");

		}
		Data2(int x){
			value = x;
			System.out.println("data2 생성자");

		}
	}


public class ConstructorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(10);
		
		System.out.println("d2.value = " + d2.value);
		
	}

}
