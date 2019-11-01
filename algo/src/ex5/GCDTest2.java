package ex5;

//유클리드 호제법 사용 ㅇ-ㅇ)
import java.util.Scanner;

public class GCDTest2 {

	public static void main(String[] args) {

		int v1, v2;
		int r = 1;
		int rs;

		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요");
		v1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		v2 = sc.nextInt();

		int t1 = v1, t2 = v2;	// 입력받은 값을 따로 저장한다
		if (v1 < v2) {			// 처음 받은 숫자가 두번째 받은 숫자보다 작으면 순서를 바꿔주기
			v1 = t2;
			v2 = t1;
		}

		while (r > 0) {			// r이 0 이하가 되면 루프를 멈춤
			r = v1 % v2;		// r은 큰 수 나누기 작은 수의 나머지
			v1 = v2;			// 작은 수를  큰 수 위치에
			v2 = r;				// 나머지를 작은 수 위치에
		}

		rs = t1 * t2 / v1;		// rs는 (큰 수 곱하기 작은 수) 나누기 (r이 0 이하가 됐을 때의 큰 수)

		System.out.println("최대공약수 : " + v1); // 큰 수(>작은 수) 나누기 작은 수(>나머지)를 반복하여 나머지가 0이 됐을 때의 큰 수 값  
		System.out.println("최소공배수 : " + rs); // 최초 입력 수 둘을 곱해서 최대공약수(v1)로 나눈 값

	}
}