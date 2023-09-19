package bit701.day0912;

class SuperA
{
	public void processA() {
		System.out.println("부모가 가진 메서드 A");
	}
	public void processB() {
		System.out.println("부모가 가진 메서드 B");
	}	
	public void processC() {
		System.out.println("부모가 가진 메서드 C");
	}
}


class SubA extends SuperA
{
	public void show()
	{
		
	}
}

public class Ex6_Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubA sub1=new SubA();
		sub1.processA();
		sub1.processB();
		
		System.out.println("----");

	}

}
