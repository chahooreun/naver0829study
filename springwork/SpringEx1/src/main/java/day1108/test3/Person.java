package day1108.test3;

import java.util.Set;

import lombok.Getter;
@Getter
public class Person {
	private String name;
	private String addr;
	private MyShop myShop;
	
	
	public  Person(String name) {
		this.name=name;
	}
	
	
	public void setAddt(String addr) {
		this.addr = addr;
	}
	
	public void setMyShop(MyShop myShop) {
		this.myShop = myShop;
		
	}
	
	public void writeProcee()
	{
		System.out.println("이름 : " +name);
		System.out.println("주소 : " + addr);
		System.out.println("쇼핑 정보");
		System.out.println(myShop.getSangpum()+"상품");
		System.out.println(myShop.getPrice()+"원");
		System.out.println(myShop.getColor()+"ㅗㅗ");
	}
}
