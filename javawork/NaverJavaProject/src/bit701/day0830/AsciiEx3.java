package bit701.day0830;

public class AsciiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char, int 는 같은 타입이라고 봐도 된다
		char a1=65;
		int a2='B';
		System.out.println(a1);
		System.out.println(a2);
		System.out.println((int)a1);
		System.out.println((char)a2);
		
		System.out.printf("%d 의 아스키문자는 %c이다\n",(int)a1,a1);
		
		char b1='C';
		int b2=68;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+2);//묵시적 형변환에 의해서 char+int=int, 그러므로 E가 아니라 69가 나온다
		/*
		 * 묵시적 형변환(+는 실제 더하기만 의미하는게 아니라 연산을 의미)
		 * char+int= int
		 * int+int= int
		 * long+int= long 
		 * double+int= double
		 * String+int=String
		 * String+double=String
		 */
		
        //print 나 printn 은 모든타입 출력이 가능하다
		//이유는 타입별로 여러개를 같은 이름으로 만들어 놨기 때문이다
		//이런 메서드를 중복함수 (overloding method)라고 한다
		
		
		
		
		System.out.println((char)(b1+2));//b1+2=69로 int 타입인데 char로 강제 형변환 해서 출력
		
		
		System.out.println(5/2);//int와 int의 연산임으로 무조건 결과는 int 타입
	
	
		System.out.println(5.0/2);
		
		System.out.println((double)5/2);//double+int=double
		
		System.out.println((double)(5/2));//int+int 결과를 double로 형변환해도 2.0이 될뿐..
	
	
	
	
	}

}
