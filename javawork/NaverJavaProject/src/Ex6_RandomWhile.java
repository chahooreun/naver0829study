import java.util.Scanner;

public class Ex6_RandomWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnd, count, num;

        Exit: while (true) {
            rnd = (int) (Math.random() * 100) + 1;
            count = 0;

            while (true) {
                System.out.print(++count + ": "); // println 대신 print를 사용하여 줄 바꿈을 제거
                num = sc.nextInt();
                sc.nextLine(); // 개행 문자 소비

                if (num > rnd)
                    System.out.println("\t" + num + "보다 작습니다");
                else if (num < rnd)
                    System.out.println("\t" + num + "보다 큽니다");
                else {
                    System.out.println("\t정답입니다(" + rnd + ")");
                    System.out.print("계속 하려면 y를 입력해주세요, y가 아닐 경우 종료! ");
                    String ans = sc.nextLine();

                    if (ans.equalsIgnoreCase("y")) { // 세미콜론 제거
                        System.out.println("새로운 난수를 발생하겠습니다");
                        continue Exit;
                    } else {
                        break Exit;
                    }
                }
            }
        }

        System.out.println("종료");
    }
}
