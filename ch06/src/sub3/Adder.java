package sub3;

public class Adder {
	
	//원래는 프라이빗
	int x;
		
	//이름이 같으나 매개변수로 구별 - 오버로드 
	public void add(int x) {
		this.x = x + 50;
	} 
	public void add(int[] arr) {
		arr[0]++;arr[1]++;arr[2]++;
	} 
	public void add(Adder a1) {
		a1.x = a1.x + 40;
	} 
	public Adder addNew(Adder a2) {
		a2 = new Adder();
		return a2;
	} 

}
