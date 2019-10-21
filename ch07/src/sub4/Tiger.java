package sub4;

public class Tiger extends Animal {

	@Override // 컨트롤 스페이스 하면 알아서 붙는다
	public void move() {
		System.out.println("Tiger - move...");
	}
	
	public void hunt() {
		System.out.println("Tiger - hunt...");
	}

}
