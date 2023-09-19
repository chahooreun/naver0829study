package bit701.day0912;
class SuperC
{
	protected String name;
	protected int age;
	
	public SuperC() {
		System.out.println("부모 디폴트 생성자 호출");
		name="홍길동";
		age=10;
	}
	SuperC(String name,int age)
	{
	System.out.println("부모의 두번째 생성자 호출");
	this.name=name;
	this.age=age;
	
	}
}
class SubC extends SuperC
{
String hp;

SubC()
{
	super();//부모의 디폴트 생성자 호출/기본으로 쓰지 않아도 내부적으로 호출된다-숨겨져있다(생략가능-단 디폴트인 경우만)
	System.out.println("서브클래스의 디폴트 생성자 호출");
	hp="010-3027-6666";
}
SubC(String hp)
{
	System.out.println("sub 의 두번째 생성자 호출");
	this.hp="010-9696-8787";
}
public void dataShow()
{
	//부모클래스의 멤버변수가 protected 이므로 패키지 상관없이 접근 가능
	System.out.println("이름: "+this.name);
	System.out.println("나이:"+this.age);
	System.out.println("핸드폰:"+this.hp);
	System.out.println("===================");
}

}
////////////////////////////////

public class Ex8_InheriConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubC sub1=new SubC();
		sub1.dataShow();
		SubC sub2=new SubC("010-6325-7412");
		sub2.dataShow();

	}

}
//교재 284-상속
//p290