class Tv{
	
	//�ɹ� ����
	String color;
	boolean power;
	int channel;
	//�ɹ� �޼ҵ�
	void power() {
	 power = !power;
	}
	
	void chaanelup() {
		++channel;
	}
	
	void chaaneldown() {
		--channel;
	}
	
	
}


public class Tvtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv1 = new Tv();
		tv1.color = "RED";
		tv1.power();
		tv1.channel = 9;
		tv1.chaanelup();
		tv1.chaanelup();
		//tv1.power();
		
		System.out.println("tv1�� ������" + tv1.color + "�Դϴ�");
		System.out.println("tv1�� ������" + (tv1.power==true ? "on" : "off") + "�Դϴ�");
		System.out.println("tv1�� ���� ä����" + tv1.channel+ "�Դϴ�");
		
		System.out.println();
		Tv tv2 = new Tv();
		tv2.color = "Black";
		tv2.power();
		tv2.channel = 15;
		tv2.chaanelup();
		
		System.out.println("tv2�� ������ " + tv2.color + "�Դϴ�.");
		System.out.println("tv2�� ������ " + (tv2.power==true ? "ON" : "OFF") + "�Դϴ�.");
		System.out.println("tv2�� ä���� " + tv2.channel + "�Դϴ�.");
		
		//���������� ����
		
		System.out.println();
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		t2 = t1; //t1�� ���������� t2�� �����Ѵ�.
		t1.channel = 7;
		
		System.out.println("t1�� ä���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� ä���� " + t2.channel + "�Դϴ�.");

		

	}

}
