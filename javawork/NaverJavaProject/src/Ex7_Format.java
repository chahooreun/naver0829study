import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex7_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//패턴을 이용해서 다양하게 날짜,시간을 출력해보자
		Date date=new Date();
		
		//패턴 1
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd:mm:ss EEE");
		System.out.println(dateFormat.format(date));
		//패턴 2
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년-MM월-dd일:mm시:ss분 EEEE");
		System.out.println(dateFormat2.format(date));
		
		//EEE: 요일짧게,EEEE:요일길게
		
		//숫자를 포맷 양식에 맞게 출력하기
		int money=4567890;
		
		NumberFormat numberFormat=NumberFormat.getInstance();
		System.out.println(numberFormat.format(money));//4,567,890,단순컴마
		
		NumberFormat numberFormat2=NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat2.format(money));//지역화페단위 붙여서 출력

		double num=456.12345;
		System.out.println(numberFormat.format(num));
		
		numberFormat.setMaximumFractionDigits(1);
		System.out.println(numberFormat.format(num));
		
		
	}

}
