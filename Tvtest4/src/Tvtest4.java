class Tv{
	String color;
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channerup() {
		++channel;
	}
	void channerdown() {
		--channel;
	}
	
	
	
}




public class Tvtest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[100];
		
		for(int i = 0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel = i + 10;
		}
		
		for(int i = 0; i<tvArr.length;i++) {
			tvArr[i].channerup();
			//System.out.printf("tvArr[%d].channel = %d%n", i , tvArr[i].channel);
			System.out.println("tvArr[" + i + "].channel = " + tvArr[i].channel);
		
		}
		
	}

}
