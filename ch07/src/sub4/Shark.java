package sub4;

public class Shark extends Animal {
	
	@Override // 컨트롤 스페이스 하면 알아서 붙는다
	public void move() {
		System.out.println("Shark - move...");
	}
	
	public void hunt() {
		System.out.println("Shark - hunt...");
	}

}
