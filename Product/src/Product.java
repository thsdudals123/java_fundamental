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
		
		System.out.println("p1�� ��ǰ��ȣ(seial no)�� " + p1.serialNo);
		System.out.println("p2�� ��ǰ��ȣ(seial no)�� " + p2.serialNo);
		System.out.println("p3�� ��ǰ��ȣ(seial no)�� " + p3.serialNo);
		System.out.println("�� ������ " + product1.count);
		
		
	}

}
