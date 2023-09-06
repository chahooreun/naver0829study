import java.util.Arrays;

public class Ex16_Lotto {
    public static void main(String[] args) {
        /*
         * 6개 할당된 lotto 변수에 1~45 사이의 난수를 발생하는데
         * (중복된 경우 다시 발생)오름차순 정렬로 출력하시오
         */
    	
    	
    	int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            int randomNumber;

            do {
                randomNumber = (int) (Math.random() * 45) + 1;
            } while (isDuplicate(lotto, randomNumber, i));

            lotto[i] = randomNumber;
        }

        Arrays.sort(lotto);

        for (int number : lotto) {
            System.out.println(number);
        }
    }

    private static boolean isDuplicate(int[] array, int number, int endIndex) {
        for (int i = 0; i < endIndex; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
}
