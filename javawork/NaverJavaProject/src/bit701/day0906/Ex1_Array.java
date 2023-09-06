package bit701.day0906;

public class Ex1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr1=new int[5];
		System.out.println("arr1 의 할당 갯수:"+arr1.length);
		
		
		arr1[1]=10;
		arr1[4]=50;
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println();
		
		for(int n:arr1)
		{
		System.out.println(n);
	}

}
}
