package sub2;

//ġȯ������ �ΰ���
public class Product<A, B> {
	
	private A item;
	private B spec;
	
	public Product(A item, B spec) {
		this.item = item;
		this.spec = spec;
	}

	public void info() {
		System.out.println("���� : " + item);
		System.out.println("���� : " + spec);
	}	
}