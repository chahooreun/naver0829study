package bit701.day0830;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증강 연산자 : ++(1씩증가) --(1씩 감소)
		//변수 앞에 붙일경우(전치) 1순위
		//변수 뒤에 붙일경우(후치) 끝순위
		// 단 , 단항으로 사용할경우 상관없다(앞뒤 노상관)
		int a=5;
		int b=5;
		//단항으로 연산할 경우
		System.out.println(++a);//1씩증가
		b++;//1씩증가
		System.out.println(b);
		
		System.out.println(--a);
		b--;
		System.out.println(b);
		
		System.out.println();
		
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(--b);
		
		a=b=5;
		
		int m=++a;//증가후 대입
		int n=b++;//대입후 증가
		
		System.out.printf("a=%d,b=%d,m=%d,n=%d\n",a,b,m,n);
		
		
		
	}

}
