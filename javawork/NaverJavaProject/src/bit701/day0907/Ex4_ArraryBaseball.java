package bit701.day0907;

import java.util.Scanner;

public class Ex4_ArraryBaseball {
    public static void main(String[] args) {
        // 정답 숫자를 저장할 배열 생성
        int[] answer = new int[3];
        
        // 정답 숫자 생성
        for (int i = 0; i < 3; i++) {
            answer[i] = (int) (Math.random() * 9) + 1;
            
            // 중복된 숫자 방지
            for (int j = 0; j < i; j++) {
                if (answer[i] == answer[j]) {
                    i--;
                    break;
                }
            }
        }
        
        // 사용자 입력 받기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 게임 시작
        int tries = 0;  // 시도 횟수 초기화

        while (true) {
            System.out.print("세 자리 숫자를 입력하세요: ");
            int guess = scanner.nextInt();
            
            int[] guessArray = new int[3];  // 사용자 입력 숫자를 저장할 배열 생성
            
            // 사용자 입력 숫자를 배열에 저장
            for (int i = 2; i >= 0; i--) {
                guessArray[i] = guess % 10;
                guess /= 10;
            }
            
            int strike = 0;  // 스트라이크 개수
            int ball = 0;    // 볼 개수
            
            // 정답과 사용자 입력 숫자 비교
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (answer[i] == guessArray[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                        break;
                    }
                }
            }
            
            // 결과 출력
            System.out.printf("%dS %dB\n", strike, ball);
            
            // 정답을 맞춘 경우 게임 종료
            if (strike == 3) {
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
                break;
            }
            
            tries++;  // 시도 횟수 증가
        }
        
        // 게임 플레이 결과 출력
        System.out.printf("게임 종료! 총 %d회 시도하셨습니다.\n", tries);
        
        // Scanner 객체 닫기
        scanner.close();
    }
}
