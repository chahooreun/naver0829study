import java.sql.Date;
import java.util.Scanner;

public class Ex6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//입력한 년,월,일에 해당하는 요일 구하기
		System.out.println("년,월,일을 순서대로 입력해주세요");
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		//컨트롤 i 자동정리
		
		//Date 클래스 생성
		Date date=new Date(year-1900,month-1,day);
		//요일 구하기
		int weekint=date.getDay();//0:일
		System.out.println("요일숫자 : "+weekint);
		
		String week=weekint==0?"일":weekint==0?"월":weekint==0?"화":weekint==0?"수":weekint==0?"목":weekint==0?"금":"토";
        System.out.println(week+"요일입니다");
	}

}
