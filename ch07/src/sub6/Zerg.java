package sub6;

//Zerg에 붙은 빨간에러받침에 마우스를 가져가면 아래 메서드가 자동으로 뜬다 ㅇㅁㅇ)9
public class Zerg extends Unit {

	@Override
	public void attack() {
		System.out.println("Zerg attack...");		
	}

	@Override
	public void special() {
		System.out.println("Zerg special!!");				
	}
}
