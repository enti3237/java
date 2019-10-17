package p124;

public class ForMultiplicaXam {
	public static void main(String[] args) {
		for (int m=2 ; m<=9 ; m++) {
			System.out.println();
			System.out.println(m+"´Ü");
			for (int n=1 ; n<=9 ; n++) {
				int sum = m*n;
				System.out.println(m+"X"+n+"="+sum);
			}
		}
	}

}
