
public class Ex5_FileReader {
	
	static final String SUNGJUK_FILE="D:/naver0829/sungjuk.txt";
	Sungjuk []sung=new Sungjuk[20];
	int count;
	
	public Ex5_FileReader(String sungjukFile) {
		String str1="이름,국어,영어,총점,평균";
	//문자열을 , 로 분리해서 배열에 담아보자
	String []strArray=str1.split(",");
	System.out.println("총 "+strArray+" 개로 분리됨");
	for(int i=0;i<strArray.length;i++)
	{
		System.out.println(i+":"+strArray[i]);
	}
	System.out.println("-".repeat(20));
	String str2="sea.jpg";
	//String[]str2Array=str2.split("[.]");
	String []str2Array=str2.split("\\.");
	System.out.println(str2Array.length);
	System.out.println(str2Array[0]);
	System.out.println(str2Array[1]);
	
	String str3="국|영|수";
	String []str3Array=str3.split("|");
	System.out.println(str3Array.length);
	for(int i=0;i<str3Array.length;i++)
	{
		System.out.println(i+":"+str3Array[i]);
	}

}

		//파일 읽어서 sung 배열에 담기(줄단위로 읽은후, 로 분리해서 넣기)

	
	public void dataList()
	{
		//출력
		//이름 국어 영어 총점 평균
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Ex5_FileReader ex=new Ex5_FileReader(null);
		ex.dataList();
		
		ex=new Ex5_FileReader(SUNGJUK_FILE);
		ex.write("이름:홍길동\n");
		ex.write("핸드폰:010-3333-9999\n");
		ex.write("----------------\n");
		ex.close();
		System.out.println("탐색기를 열고 sungjuk.txt 파일을 확인하세요");
			
}
	



	private void close() {
		// TODO Auto-generated method stub
		
	}



	private void write(String string) {
		// TODO Auto-generated method stub
		
	}
}