package bit701.day0901;

import java.util.Scanner;

public class Ex5_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 n을 입력 받은후 1부터 n까지의 총 합계를 출력하시오
		
		//구구단 숫자2~9사이의 숫자를 입력받은후 범위를 벗어날경우
		// "잘못입력하여 종료합니다" 라고 종료!
		//제대로 입력시 해당 구구단 출력
		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("숫자를 입력하세요: ");
		        int n = sc.nextInt();
		        
		        int sum = 0;
		        for (int i = 1; i <= n; i++) {
		            sum += i;
		        }
		        
		        System.out.println("1부터 " + n + "까지의 합계: " + sum);
		        
		        
		        Scanner sc2= new Scanner(System.in);
		        System.out.print("숫자를 입력하세요 (2부터 9까지): ");
		        int number = sc2.nextInt();
		        
		        if (number < 2 || number > 9) {
		            System.out.println("잘못 입력하여 종료합니다.");
		            System.exit(0);
		        }
		        
		        for (int i = 1; i <= 9; i++) {
		            System.out.println(number + " * " + i + " = " + (number * i));
		        }
		        
		        
		        
		        
		        
		        
	}
}
			
				



	

