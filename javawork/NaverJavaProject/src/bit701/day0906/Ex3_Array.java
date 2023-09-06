package bit701.day0906;

public class Ex3_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []arr1= {'A','P','P','L','E'};
		double []arr2;
		arr2=new double[] {1.7,8.9,3.4};
		String []arr3=new String[3];
		arr3[0]="사과";
		arr3[1]="딸기";
		arr3[2]="오렌지";
		
		System.out.println("arr1출력");
		for(int i=0;i<arr1.length;i++)
			System.out.println(arr1[i]);
		
		System.out.println("arr2출력");
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		System.out.println("arr3출력");
		for(int i=0;i<arr3.length;i++)
			System.out.println(arr3[i]);
		
		System.out.println("=".repeat(30));
		System.out.println("arr1출력");
		for(char ch:arr1);
		
		

	}

}
