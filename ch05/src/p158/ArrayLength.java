package p158;

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("¹è¿­ÀÇ ÃÑÇÕ: "+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("¹è¿­ÀÇ Æò±Õ: " +avg);
	}

}
