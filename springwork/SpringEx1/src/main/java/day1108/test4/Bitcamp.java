package day1108.test4;

import lombok.Setter;

@Setter
public class Bitcamp {
	
	private Student stu;
	private Sawon sawon;
	
	public void infoProcess()
	{
		System.out.println("���Τ������Ϥ���");
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getBlood());
		System.out.println();
		System.out.println("�������");
		System.out.println(sawon.getCity());
		System.out.println(sawon.getName());
		System.out.println(sawon.getHobby());
	}

}
