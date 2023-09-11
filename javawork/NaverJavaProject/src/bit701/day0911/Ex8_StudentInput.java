package bit701.day0911;

import java.util.Scanner;

public class Ex8_StudentInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inwon;
		MyStudent []stu;
		System.out.println("인원수는?");
		inwon=Integer.parseInt(sc.nextLine());
		stu=new MyStudent[inwon];
		
		for(int i=0;i<inwon;i++)
		{
			System.out.println(i+"번의 이름은?");
		}

	}

}
