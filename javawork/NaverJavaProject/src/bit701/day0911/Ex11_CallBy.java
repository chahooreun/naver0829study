package bit701.day0911;

class CallBy
{
	String name;
	String addr;
	String hp;
	
	CallBy(String name,String addr,String hp)
	{
		this.name=name;
		this.addr=addr;
		this.hp=hp;
	}
}

public class Ex11_CallBy {

	public static void changeCallBy(CallBy by)
	{
		
		System.out.println("이름:"+by.name);
		System.out.println("주소:"+by.addr);
		System.out.println("핸드폰:"+by.hp);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallBy by=new CallBy("김이사", "강남구", "010-222-3333");
		System.out.println("**초기값 출력***");
		writeData(by);
		System.out.println("**값 변경후 출력");
		changeCallBy(by);
		writeData(by);

	}
	private static void writeData(CallBy by) {
		// TODO Auto-generated method stub
		
	}

}
