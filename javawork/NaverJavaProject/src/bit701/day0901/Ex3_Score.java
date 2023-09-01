package bit701.day0901;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex3_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 이름.3과목의 점수(kor,eng,mat)를 입력받은후 총점과 평균(소수점1자리 출력-NumberFormat)
		 * 그리고 등급을 출력(grade : 평균이 90 이상이라면 "Excellent!" ,80 이상이면"GOOD!!", 나머지는 "Try!" 라고 출력
		 * if~else 사용해서 구해보세요
		 */
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();
        
        System.out.print("국어 점수를 입력하세요: ");
        int kor = scanner.nextInt();
        
        System.out.print("영어 점수를 입력하세요: ");
        int eng = scanner.nextInt();
        
        System.out.print("수학 점수를 입력하세요: ");
        int mat = scanner.nextInt();
        
        int total = kor + eng + mat;
        double average = (double) total / 3;
        
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setMaximumFractionDigits(1);
        String formattedAverage = formatter.format(average);
        
        System.out.println("이름: " + name);
        System.out.println("총점: " + total);
        System.out.println("평균: " + formattedAverage);
        
        if (average >= 90) {
            System.out.println("등급: Excellent!");
        } else if (average >= 80) {
            System.out.println("등급: GOOD!!");
        } else {
            System.out.println("등급: Try!");
        }
        
        scanner.close();
    }

	}


