import java.util.Random;

public class Ex15_ArrayJungbok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10개의 배열안에1~20 사이의 난수를 구해서 저장후 출력해보자
	
		Random r=new Random();
		int []data=new int[20];
		
		for(int i=0;i<data.length;i++)
		{
			data[i]=r.nextInt(20)+1;
		}
		
		for(int i=0;i<data.length;i++)
		{
			System.out.printf("%4d",data[i]);
		}
		
	

	}

}
