package bit701.day0830;

public class DataEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//		System.out.println("hi!");
		System.out.print("happy\t!");
		System.out.println("good!");
		System.out.println("네이버클라우드");
	
	
		//printf:변환기호에 의한 출력, 정수:%d,실수:%f,문자:%c,문자열%s
		//\n:줄넘김 , \t: 다음탭 위치로 이동
		int age=23;
		double weight=56.7;
		char blood='A';
		String name="캐서린";
		System.out.printf("이름:%s\n",name);
		System.out.printf("나이:%d세\n",age);
		System.out.printf("몸무개:%fkg\n",weight);
		System.out.printf("몸무개:%5.1fkg\n",weight);
		System.out.printf("혈액형:%c형\n",blood);
		System.out.println("=============================");
		System.out.printf("이름:%s\n혈액형:%c\n나이:%d",name,blood,age);
	}
	

}
