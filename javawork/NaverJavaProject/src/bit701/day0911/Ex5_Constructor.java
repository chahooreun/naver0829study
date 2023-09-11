package bit701.day0911;
class Car2
{
	String carName;
	String carColor;
	
	private Car2()
	{
		carName="아우디";
		carColor="검정색";
	}
	
	public String toString() {
		return "자동차명:"+carName+", 색상:"+carColor;
	}

	public static Car2 getInstance() {
		// TODO Auto-generated method stub
		return null;
	}
}

public class Ex5_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car2 car1=new Car2();//오류발생,private 이라 같은 멤버만 호출이 가능하다
		
		Car2 car1=Car2.getInstance();
		System.out.println(car1.toString());
		System.out.println(car1);
		

	}

}
