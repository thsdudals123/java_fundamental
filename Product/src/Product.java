class product1{
	static int count = 0;
	int serialNo;
	{
		serialNo = ++count;
	}
	public product1() {}
}


public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product1 p1 = new product1();
		product1 p2 = new product1();
		product1 p3 = new product1();
		
		System.out.println("p1의 제품번호(seial no)는 " + p1.serialNo);
		System.out.println("p2의 제품번호(seial no)는 " + p2.serialNo);
		System.out.println("p3의 제품번호(seial no)는 " + p3.serialNo);
		System.out.println("총 개수는 " + product1.count);
		
		
	}

}
