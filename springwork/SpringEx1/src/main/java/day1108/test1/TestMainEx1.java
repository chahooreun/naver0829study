package day1108.test1;

public class TestMainEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDto dto=new TestDto();
		dto.setName("이상아");
		dto.setAddr("강남");
		dto.setAge(23);
		
		System.out.println("이름 : "+dto.getName());
		System.out.println("주소 :"+dto.getAddr());
		System.out.println("나이 :"+dto.getAge());
	}

}
