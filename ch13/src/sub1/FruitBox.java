package sub1;

public class FruitBox<T> {
	//Generic ��ȣ <>�� ����ؼ� �������ش�
	
	private T fruit;
	
	//Getter (get+CTR+SPA) : �ܺη� Ŭ������ ����� �����ϱ� ���� �޼���
	public T getFruit() {
		return fruit;
	}
	
	//Setter (set+CTR+SPA) : �ܺο��� Ŭ������ ����� ���޹ޱ� ���� �޼���
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}

}
