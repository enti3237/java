package p232;

public class CalcExam {
	public static void main(String[] args) {
		Calc mycalc = new Calc();
		
		//���簢���� ���� ���ϱ�
		double rs1 = mycalc.areaRec(10);
		
		//���簢���� ���� ���ϱ�
		double rs2 = mycalc.areaRec(10,20);
		
		//������
		System.out.println("���簢���� ���� = "+rs1);
		System.out.println("���簢���� ���� = "+rs2);
	}

}
