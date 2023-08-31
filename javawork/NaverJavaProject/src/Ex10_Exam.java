import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명과 수량, 단가를 각각 입력받은후 총금액을 출력하시오
		 * 그리고 수량이 5개 이상일경우 10프로 할인된 최종 금액도 출력해주세요
		 * 
		 * (예)
		 * 상품명 : 딸기
		 * 수량:6
		 * 단가:1000
		 * 
		 * 총금액 : 6000원
		 * 5개이상 10프로 할인된 금액 : 5400원
		 * 
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.print("상품명을 입력하세요: ");
        String productName = scanner.nextLine();

        System.out.print("수량을 입력하세요: ");
        int quantity = scanner.nextInt();

        System.out.print("단가를 입력하세요: ");
        double unitPrice = scanner.nextDouble();

        double totalPrice = quantity * unitPrice;
        System.out.println("총금액: " + totalPrice);

        if (quantity >= 5) {
            double discount = totalPrice * 0.1;
            double finalPrice = totalPrice - discount;
            System.out.println("할인된 최종 금액: " + finalPrice);
        }

        scanner.close();
    }
}


