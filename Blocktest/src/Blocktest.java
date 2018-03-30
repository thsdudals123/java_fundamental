public class Blocktest {
	
	static {
		System.out.println("Static {}");
	}
	{
		System.out.println("{}");
	}
	public Blocktest() {
		System.out.println("»ý¼ºÀÚ");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Blocktest bt = new Blocktest(); ");
		Blocktest bt = new Blocktest();
		System.out.println("Blocktest bt2 = new Blocktest(); ");
		Blocktest bt2 = new Blocktest();
		

		
	}

}
