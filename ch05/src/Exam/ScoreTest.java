package Exam;

/*
 * 성적처리 프로그램 1단계
 * 국어, 영어, 수학점수와 이름을 입력받아 총점과 평균을 계산하여 출력하는 프로그램을 구현하시오.
 * 
 * <입력형식>
 * 이름 = 홍길동
 * 국어 = xx
 * 영어 = xx
 * 수학 = xx
 * 
 * 홍길동님!! 당신의 성적은 다음과 같습니다.
 * 총점 : xxx점
 * 평균 : xx.xx점
 * */
import java.io.*;
 
public class ScoreTest {
    public static void main(String[] ar) throws IOException{
        // 선언문 - 변수의 자료형과 초기값을 선언하는 문장
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int kor, eng, math, tot;
        float avg;
        
        // 입력문
        System.out.print("이름 = ");
        name = in.readLine();
        
        System.out.print("국어 = ");
        kor = Integer.parseInt( in.readLine() );
        
        System.out.print("영어 = ");
        eng = Integer.parseInt( in.readLine() );
        
        System.out.print("수학 = ");
        math = Integer.parseInt( in.readLine() );
        
        // 처리문 or 출력문
        tot = kor + eng + math;
        avg = tot / 3.0f;
        
        System.out.println(); // 개행의 의미
        System.out.println(name + " 님!! 당신의 성적은 다음과 같습니다.");
        System.out.println("총점 : " + tot + " 점");
        System.out.printf("평균 : %.2f 점\n", avg);
    }
}