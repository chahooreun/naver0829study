package bit701.day0913;

class SuperA
{
	public void process()
	{
		System.out.println("부모가 처리하는 process");
	}
}
//3개의 서브클래스를 구현해보자
class SubA extends SuperA
{

	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("그림을 그린다");
	}
	
	}


class SubB extends SuperA {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("야구게임을 한다");
		

	}

}
class SubC extends SuperA {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("테니스를 친다");
		

	}

}
public class Ex1_Inheri {

	public static void main(String[] args) {
		
		SuperA sub1;
		// TODO Auto-generated method stub
		//만약 서브 클래스로 선언시 3개의 일을 처리하려면 3번을 선언해야만 한다
		
		
		System.out.println("--------------");
		//선언은 한번만 하고3가지의 일을 처라하려묜?
		//부모로 선언하면된다
		SuperA sub4=null;
		sub4=new SubA();
		sub4.process();
		
		sub4=new SubB();
		sub4.process();
		
		sub4=new SubC();
		sub4.process();
	}
	

}
