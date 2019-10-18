package p170;

public class AdvancedFor {
	public static void main(String[] args) {

		int[] scores = {95, 71, 84, 93, 87};
	
		int sum = 0;
		//증감변수 안 쓰는 향상된 for문 (타입변수 : 배열)
		for(int score : scores) {
			sum += score;
			}
		System.out.println("점수 총합 : "+sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : "+avg );

		//향상된 for문 연습
		String[] names = {"김유신", "김춘추", "이순신"};

		for(String name : names) {
			System.out.println(name);
		}
	}
}
