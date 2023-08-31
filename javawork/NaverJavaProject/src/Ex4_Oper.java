import java.util.Scanner;

public class Ex4_Oper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 입력받아 90이상은a 80이상은b 70이상은c60이상은d나머지는f
		 * 
		 * 
				 */
		Scanner sc=new Scanner(System.in);
		//점수를 입력받아서 1~100점이 아닐경우는 일단 프로그램 종료
		//90점 이상은 합격, 80이상은 "재시험", 그 나머지는 "불합격"
		System.out.println("점수를 입력하세요");
		int score=sc.nextInt();
		if(score<1 || score>100) {
			System.out.println("잘못된 값 입력으로 종료합니다!");
			return;//return은 해당 메서드만 종료하는 명령어인데 main 메서드 종료는 곧 프로그램종료를 의미

		}
		System.out.println("입력된 점수 : "+score+" 점");
		
		String msg="";
		if(score>=90)
			msg="A";
			else if(score>=80)
				msg="B";
				else if(score>=70)
					msg="C";
				else if(score>=60)
					msg="D";
				else
					msg="F";
		System.out.println(score+"은"+msg+"학점입니다");
		
		//조건연산자
		msg=score>90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		
		System.out.printf("%d점은 %s학점입니다",score,msg);
		
					
			
	

	}

}
