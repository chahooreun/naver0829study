package bit701.day0830;

import java.net.MulticastSocket;

public class OperEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교 연산자와 논리 연산자, 결과값은 무조건 참 거짓(true,false)
		
	 int kor=100, eng=90, mat=100;
	 System.out.println(kor>=80);//t
	 System.out.println(kor>=80 || kor!=mat);
	 System.out.println(kor<80 || kor!=mat);
	 System.out.println(kor>=80 && kor!=mat);
	 System.out.println(!(kor==mat));
	 System.out.println(kor>=95 && eng>=95 && mat>=95);
	 System.out.println(kor>=95 && eng>=95 || mat>=95);
	 System.out.println(kor>=95 || eng>=95 && mat>=95);
	 
	 int year=2024;
	 //위의 연도가 윤년인지 아닌지 알아보자
	 System.out.println(year%4==0 && year%100!=0 || year%400==0);
	

	}

}
