package bit701.day0913;
//1번 예제의 메서드들을 호출해보자



public class Ex2_Inheri {
	//연자를 SubA로 하면SubA만 보낼수있다

			public static void processPlay(SuperA sub)
			{
				sub.process();//서브 변수에 누가 생성되었느냐에 따라서 하는일이 달라진다
			}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processPlay(new SubA());
		processPlay(new SubB());
		processPlay(new SubC());
		
	}

}
