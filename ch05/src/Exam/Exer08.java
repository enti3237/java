package Exam;

public class Exer08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86}, 
				{83, 92, 96}, 
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		//주어진 배열의 합과 평균을 구하시오 (중첩 for문 사용)

		int plus = 0;
		
		for(int i=0 ; i<array.length ; i++) {
			for(int k=0 ; k<array[i].length ; k++) {
				sum += array[i][k];
				plus++; //for문의 반복횟수 카운팅
			}
		}
		
		avg = (double)sum / (double)plus;

		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
	}

}
