package day1109.text5;

public class Car {
	Tire tire;
	
	public Car(Tire tire) {
		this.tire=tire;
		
	}
	
	public void myCarInfo()
	{
		System.out.println("내차 타이어는"+tire.getTireName()+"입니다");
	}

}
