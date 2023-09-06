
import java.util.Scanner;

public class Ex6_Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num;

        while (true) {
            System.out.print("주민번호를 입력하세요: ");
            num = scanner.nextLine();

            if (num.substring(0, 2).equals("97")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            char sex = num.charAt(6);
            switch (sex) {
            case '1':
            case '3':
            	System.out.println("남자");
            	break;
            case '2':
            case '4':
            	System.out.println("여자");
            	break;
            }
            int length = num.length();
            if(length==13) {
            	System.out.println("주민번호 자릿수가 맞습니다.");
            	
            }else {
            	System.out.println("주민번호 자릿수가 틀립니다.");
            }
        }
        scanner.close();
    }
}
