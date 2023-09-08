package bit701.day09088;

public class EX5SawonCall {

	public static void main(String[] args, Sawon sa) {
		// TODO Auto-generated method stub
		Sawon sal=new Sawon();
		sa.setSawonNo("bit1234");
		sa.setName("홍길동");
		sa.setAge(23);
		
		System.out.println("** 신입사원 #1 정보 **");
		System.out.println("사원번호 : "+sa.getSawonNo());
		System.out.println("사원명 : "+sa.getName());
		System.out.println("나이 : "+sa.getAge());
		

	}

}
