package p154;

public class Array {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87, 100, 50};
		int sum1 = 0;
		for(int i=0 ; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("¼¼ °³ÀÇ ÃÑÇÕ : " +sum1);
		
		int sum2 = add(new int[] {83, 90, 87, 100, 50});
		System.out.println();
		System.out.println("´Ù¼¸°³ÀÇ ÃÑÇÕ : " +sum2);
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i<5 ; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
