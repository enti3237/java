package p168;

public class ArrayCopyExam {
	public static void main(String[] args) {
		String[] oldArray = { "java", "array", "copy" };
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		//배열복사 = newArray는 배열 5개 중 3개에 oldArray의 값 3개를 복사했고 나머지는 기본값 null로 남았다
		for(int i=0 ; i<newArray.length ; i++) {
			System.out.print(newArray[i]+ ",");
		}
	}

}
