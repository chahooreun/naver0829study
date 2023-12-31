package bit701.day0922;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleJdbc {
	static final String ORACLE_DRIVER="oracle.jdbc.driver.OracleDriver";
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:xe";
	
	public OracleJdbc() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName(ORACLE_DRIVER);
			System.out.println("오라클 드라이버 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("오라클 드라이버 오류:"+e.getMessage());
		}
	}
	
	public void shopAllDatas()
	{
		Connection conn=null;
		try {
			conn=DriverManager.getConnection(ORACLE_URL, "angel", "a1234");
			System.out.println("오라클 연결 성공");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패:"+e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleJdbc ex=new OracleJdbc();
		ex.shopAllDatas();
	}

}