
public class Ex6_ArrayScoreInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * score에 5개의 배열할당후 키보드로 직접 점수를 입력하여 배열에 저장후
		 * 총점과 평균을 구하세요
		 */
		int[]score= {78,100,90,89,69};
		int sum=0;
		double avg=0;
		
		for(int i=0;i<5;i++) {
			sum+= score[i];
		}
		
		for(int n:score)
			sum+=n;
		avg=(double)sum/score.length;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg );

		
		

	}

}
