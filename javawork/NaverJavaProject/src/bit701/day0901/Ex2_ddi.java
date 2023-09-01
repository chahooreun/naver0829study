package bit701.day0901;

import java.util.Scanner;

public class Ex2_ddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//태어난 년도를 입력받아 띠를 구해보세요
		Scanner scanner=new Scanner(System.in);
		System.out.println("태어난 년도는?");
		int year=scanner.nextInt();
		//12로 나눈 나머지를 구한다.
		int m=year%12;
		//띠를 구해보자(서기1년은 닭띠해,12년이 원숭이)
		

	}

}
