package sub1;

public class FruitBox<T> {
	//Generic 기호 <>를 사용해서 선언해준다
	
	private T fruit;
	
	//Getter (get+CTR+SPA) : 외부로 클래스의 멤버를 전달하기 위한 메서드
	public T getFruit() {
		return fruit;
	}
	
	//Setter (set+CTR+SPA) : 외부에서 클래스의 멤버를 전달받기 위한 메서드
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
