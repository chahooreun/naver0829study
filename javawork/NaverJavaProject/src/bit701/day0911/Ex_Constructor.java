package bit701.day0911;

public class Ex_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []stu=new Student[3];//3개로 배열 할당,초기값은 null
		stu[0]=new Student();
		stu[1]=new Student("이효리");
		stu[2]=new Student("이진",1999,99);
		
		for(int i=0;i<stu.length;i++)
			stu[i].studentInfo();
		
		for(Student s:stu)
			s.studentInfo();

	}

}
