public class ArgsArray{
	public static void main(String []args)
		{
	//args 로 두개의 숫자를 읽어서 출력해보자
	String str1=args[0];
	String str2=args[1];
	System.out.println("str1="+str1);
	System.out.println("str2="+str2);
	System.out.println("두수의 합="+(str1+str2));


	//String 을 기본형 int 로 변환하는 방법
	int su1=(int)
	//Integer 라는 Wrapper class 를 이용하여 변환해보자
	int su1=Integer.parseInt(str1);
	int su2=Integer.parseInt(str2);
	System.out.println("두수의 합="+(su1+su2));



			}
	}