package bit701.day0925;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import bit701.day0922.DbConnect;

public class Ex6_MysqlSawonUpdate {
	DbConnect db=new DbConnect();
	public void shopUpdate()
	
	{
		Scanner sc=new Scanner(System.in);
		//num,name,score,buseo 를 입력받은후 num에 해당하는 name,score,buseo 수정하기
		//num 이없으면 해당 데이터가 없어요
		System.out.println("수정할 사원 번호는?");
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 점수는?");
		int score=Integer.parseInt(sc.nextLine());
		System.out.println("수정할 부서는?");
		String buseo=sc.nextLine();
		
		String sql="update update sawon set name="+num+",score='"+score+",buseo="+buseo;
		System.out.println(sql);
		
		Connection conn=null;
		Statement stmt=null;
		conn=db.getMysqlConnection();
		try {
			stmt=conn.createStatement();
			int n=stmt.executeUpdate(sql);
		
		if(n==0)
			System.out.println("해당데이터가 없어요.");
		else
			System.out.println("");
	}catch (SQLException e) {
		e.printStackTrace();
	}finally {
		db.dbClose(stmt, conn);
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6_MysqlSawonUpdate ex=new Ex6_MysqlSawonUpdate();
	}

}
