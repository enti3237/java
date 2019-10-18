package Exam;

public class Exer07 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		int max = array[0];
		int min = array[0];
		
		//for문을 사용해 주여진 배열의 최댓값 구하기
		for(int i=0 ; i<array.length ; i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: "+max);
		
		//최소값도 구해보자
		for(int i=0 ; i<array.length ; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("min: "+min);
	}
}
