package p244;

public class SingleExam {
	public static void main(String[] args) {

//		Singletom obj1 = new Singleton();
//		Singletom obj2 = new Singleton();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� single ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� single ��ü�Դϴ�.");
		}
		
		Etc etc1 = Etc.getInstance();
		Etc etc2 = Etc.getInstance();		

		if(etc1 == etc2) {
			System.out.println("���� single ��ü�Դϴ�.");
		} else {
			System.out.println("�ٸ� single ��ü�Դϴ�.");
		}

	}

}
