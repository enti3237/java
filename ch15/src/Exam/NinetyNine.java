package Exam;

public class NinetyNine {
	public static void main(String[] args) {
		
		for(int i=9 ; i>=0; i--) {
			if(i==0) {
				System.out.println("더이상 벽장에 맥주가 없네, 더이상 맥주는 없다네.");
				System.out.println("가게에 가서 더 사왔네, 9병의 맥주가 벽장에 있네.");
			} else {
				System.out.println("벽장에 " +i+ "병의 맥주가 있다네, " +i+ "병의 맥주라네");
				System.out.print("하나를 내려서 넘겨주었네, ");
				System.out.println((i-1) + "병의 맥주가 벽장에 있네.");
			}
		} 
	}
}