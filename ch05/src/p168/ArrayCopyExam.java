package p168;

public class ArrayCopyExam {
	public static void main(String[] args) {
		String[] oldArray = { "java", "array", "copy" };
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		//�迭���� = newArray�� �迭 5�� �� 3���� oldArray�� �� 3���� �����߰� �������� �⺻�� null�� ���Ҵ�
		for(int i=0 ; i<newArray.length ; i++) {
			System.out.print(newArray[i]+ ",");
		}
	}

}
