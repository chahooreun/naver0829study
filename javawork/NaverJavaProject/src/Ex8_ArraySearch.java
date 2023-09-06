import java.util.Scanner;

public class Ex8_ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []names= {"강호동","유재석","한채영","이효리","이승기"};
		//이름을 검색하여 몇번째에 있는지 출력
		//없을경우 "xxx 님은 명단에 없습니다"
		Scanner sc=new Scanner(System.in);
		String searchName="";
		boolean bFind=false;
		
		//검색할 이름 입력
		System.out.println("검색할 이름 입력");
		searchName=sc.nextLine();
		//for문 : 같은 이름이 있을 경우 출력,bFind도 true 변경-break
		for(int i=0;i<names.length;i++)
		{
			if(searchName.equals(names[i]))
			{
				bFind=true;
				System.out.println(searchName+"님은"+(i+1)+"번째에 있습니다");
				break;
			}
		}
		//bFind 값에 따라 못찿은경우 메세지 출력
		if(!bFind)
		{
			System.out.println(searchName+"님은 명단에 없습니다");
		}

	}

}
