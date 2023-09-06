
public class Ex5_ArrayMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data;
		data=new int[] {5,-100,67,89,345,-9,123,58,110,200};
		int max,min;
		System.out.println(data.length);
		
		max=data[0];
		
		for(int i=1;i<data.length;i++)
		{
			if(max<data[i])
				max=data[i];
			
		}
		System.out.println("max="+max);

	}

}
