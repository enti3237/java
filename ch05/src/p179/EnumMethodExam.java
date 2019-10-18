package p179;
import p175.Week;

public class EnumMethodExam {
	public static void main(String[] args) {
		//name() �޼ҵ� - ���Ű�ü�� ���� ���ڿ��� �����´�(�����Ѵ�)
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//original() �޼ҵ� - �� ��ü�� ���° ��ü�� '��' 0���� �����ϴ� ���� ��������
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() �޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int rs1 = day1.compareTo(day2); //2�� �������� 1�� ��ġ�� �����Ѵ� = ������ ���� �������� -2
		int rs2 = day2.compareTo(day1); //1�� �������� 2�� ��ġ�� �����Ѵ� = ������ ���� �������� +2
		System.out.println(rs1);
		System.out.println(rs2);

		//valueOf() �޼ҵ�
		//args�� �����ϱ� ���ؼ� Run Configuration>�ش��������� Arguments �ǿ��� ������ �Է��� �ʿ䰡 �ִ�. ���� FRIDAY �Է���
		if(args.length == 1) {
			String strDay = args[0];
			Week weekday = Week.valueOf(strDay);
			if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
				System.out.println("�ָ�");
			} else {
				System.out.println("����");
			}
		}
		
		//values() �޼ҵ� - ���� for������ ����Ÿ���� ��� ��ü�� ������
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
