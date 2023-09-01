import java.util.Scanner;

public class Ex6_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 *구구단을 출력할 시작단 입력
		 *4
		 *구구단을 출력할 끝단 입력
		 *6
		 *
		 * 
		 * 4단	5단	6단
		 * 
		 * 4x1=4
		 *
		 */
		System.out.print("구구단을 출력할 시작단: ");
        int s = sc.nextInt();
        
        System.out.print("구구단을 출력할 끝단: ");
        int e = sc.nextInt();
        
        for(int j=1;j<=9;j++) {
        for(int i=s; i<=e;i++) {
        	
        		 System.out.print(i + " * " + j + " = " + (i * j)+"\t");
            }
            System.out.println();
        }
        
	}

}
