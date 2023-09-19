package bit701.day0919;
//리턴 타입이 있는 람다식

interface Calcuable{
	double calc(double x,double y);
	
}
class Person{
	public void action(Calcuable cal) {
		double result=cal.calc(10,4);
		System.out.println("결과="+result);
		
	}
}

public class Ex1_B703_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		//실행문이 두개인경우
		Person.action(x,y)->{
			double result=x+y;
			return result;
			
		});
		//위호출문과 같은 로직처리
		Person.action((x,y->(x+y));

	}

}
