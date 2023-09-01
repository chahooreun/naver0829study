package bit701.day0901;

public class Ex4_BreakConinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<10;a++) 
		{
			System.out.printf("%3d",a);
			if(a==5)
				break;//5까지 출력후 반복문을 빠져나간다.
		
		}
		System.out.println();
		System.out.println(".".repeat(30));
		
		for(int a=1;a<=10;a++)
		{
			if(a%2==0)
				continue;//a++ 증강식으로 가겠다
			System.out.printf("%3d",a);
		}
		System.out.println();
		System.out.println(".".repeat(30));
		//다중 for문을 경우 한꺼번에 2개의 반복문을 빠져나가고자 할경우
		for(int i=1; i<=3; i++)
		{
			System.out.println("i="+1);
			for(int j=1;j<=5;j++) {
				
			}
		
		}

	}

}
