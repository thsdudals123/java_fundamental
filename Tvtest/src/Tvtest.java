class Tv{
	
	//맴버 변수
	String color;
	boolean power;
	int channel;
	//맴버 메소드
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
		
		System.out.println("tv1의 색상은" + tv1.color + "입니다");
		System.out.println("tv1의 전원은" + (tv1.power==true ? "on" : "off") + "입니다");
		System.out.println("tv1의 현재 채널은" + tv1.channel+ "입니다");
		
		System.out.println();
		Tv tv2 = new Tv();
		tv2.color = "Black";
		tv2.power();
		tv2.channel = 15;
		tv2.chaanelup();
		
		System.out.println("tv2의 색상은 " + tv2.color + "입니다.");
		System.out.println("tv2의 전원은 " + (tv2.power==true ? "ON" : "OFF") + "입니다.");
		System.out.println("tv2의 채널은 " + tv2.channel + "입니다.");
		
		//참조변수의 변경
		
		System.out.println();
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		
		t2 = t1; //t1의 참조변수를 t2도 참조한다.
		t1.channel = 7;
		
		System.out.println("t1의 채널은 " + t1.channel + "입니다.");
		System.out.println("t2의 채널은 " + t2.channel + "입니다.");

		

	}

}
