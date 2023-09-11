package bit701.day0911;

class Apple{
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	public static int sum(int s1,int s2,int s3)
	{
		return s1+s2+s3;
	}
	public static double sum(double a,double b)
	{
		return a+b;
	}
	public static String sum(String a,String b)
	{
		return a+b;
		
	
	}
}

public class Ex2_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Apple.sum(5,7));
		System.out.println(Apple.sum("apple","orange"));
		
		//System.out.println(Apple.sum(100,"orange"));

	}

}
