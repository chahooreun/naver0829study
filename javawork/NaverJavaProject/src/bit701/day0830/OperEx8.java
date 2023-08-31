package bit701.day0830;

public class OperEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//money 변수에 args[0] 값을 대입후(급여 : 백만단위:5674321)
		/*
		 * 출력
		 * money : 5674321 원
		 * 만원짜리 567장
		 * 천원짜리 4장
		 * 백원짜리 3개
		 * 일원짜리 1개
		 * 
		 * 
		 * : 산술연산자를 사용해 출력해 보세요		 
		 *
		 * */
		String money = args[0];
		int i = Integer.parseInt(money);
		System.out.println("money : "+money+"원");
		System.out.println("만원짜리"+i/10000+"장");
		System.out.println("천원짜리"+(i%10000)/1000+"장");
		System.out.println("백원짜리"+(i%1000)/100+"장");
		System.out.println("십원짜리"+(i%100)/10+"개");
		System.out.println("일원짜리"+(i%10)/1+"개");
		
		
	}

}
