package Exam;

/*
 * ����ó�� ���α׷� 1�ܰ�
 * ����, ����, ���������� �̸��� �Է¹޾� ������ ����� ����Ͽ� ����ϴ� ���α׷��� �����Ͻÿ�.
 * 
 * <�Է�����>
 * �̸� = ȫ�浿
 * ���� = xx
 * ���� = xx
 * ���� = xx
 * 
 * ȫ�浿��!! ����� ������ ������ �����ϴ�.
 * ���� : xxx��
 * ��� : xx.xx��
 * */
import java.io.*;
 
public class ScoreTest {
    public static void main(String[] ar) throws IOException{
        // ���� - ������ �ڷ����� �ʱⰪ�� �����ϴ� ����
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int kor, eng, math, tot;
        float avg;
        
        // �Է¹�
        System.out.print("�̸� = ");
        name = in.readLine();
        
        System.out.print("���� = ");
        kor = Integer.parseInt( in.readLine() );
        
        System.out.print("���� = ");
        eng = Integer.parseInt( in.readLine() );
        
        System.out.print("���� = ");
        math = Integer.parseInt( in.readLine() );
        
        // ó���� or ��¹�
        tot = kor + eng + math;
        avg = tot / 3.0f;
        
        System.out.println(); // ������ �ǹ�
        System.out.println(name + " ��!! ����� ������ ������ �����ϴ�.");
        System.out.println("���� : " + tot + " ��");
        System.out.printf("��� : %.2f ��\n", avg);
    }
}