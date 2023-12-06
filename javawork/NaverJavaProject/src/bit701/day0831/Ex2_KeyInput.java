package bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex2_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date 클래스를 이용해서 현재 년도를 구해보자
		//권장 : Calendar 를 권장
		Date date=new Date();
		int curYear=date.getYear()+1900;
		System.out.println("현재 년도 : "+curYear);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("당신이 태어난 년도는???");
		int birthYear=Integer.parseInt(sc.nextLine());
		
		System.out.println("지금 사는곳은 어디입니까???");
		String adress=sc.nextLine();
		
		int age=curYear-birthYear;
		
		System.out.println("저는"+adress+"에 사는"+birthYear+"년생("+age+"세) 학생입니다");
		System.out.printf("저는 %s에사는 %d년생(%d세)학생입니다\n",adress,birthYear,age);
		
		//20세이상이면 "성인" , 미만이면 "미성년자"라는 글자를 출력
		// if문으로 해도되거 조건(삼항)연산자(조거닉?참일때값: 거짓일때 값)
		
		
		
		//if문으로 할경우
		String msg="";
		if(age>=20)
		{
			//한문장만 쓸경우 {} 구역설정 생략가능하지만 두문장 이상일경우는 반드시 구역설정({
		
		}else {
			msg="미성년자";
		}
		System.out.println("당신은"+msg);
	sc.close();
	}
	

}
