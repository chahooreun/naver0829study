import java.util.Scanner;

public class Ex6_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int money=0;
		int total = 0;
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
			
			
			int num = sc.nextInt();
			switch(num){
				case 1:
					System.out.println("예금액 : ");
					money=sc.nextInt();
					total +=money;
					break;
				case 2:	
				System.out.println("잔고 : "+money);
				money=sc.nextInt();
				total +=money;
				break;
				case 3:
					default :
						System.out.println("");
						
				
			
		}
}	
		

	}

}
