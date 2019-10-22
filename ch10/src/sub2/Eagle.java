package sub2;

public class Eagle extends Animal {
	
	@Override // 컨트롤 스페이스 하면 알아서 붙는다
	public void move() {
		System.out.println("Eagle - move...");
	}
	
	public void hunt() {
		System.out.println("Eagle - hunt...");
	}

}
