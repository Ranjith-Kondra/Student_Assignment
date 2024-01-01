package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.dbConnector;

public class StudentById {
	
	public static void getStudent(int sid) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		con = dbConnector.getConnector();
		
		String query = "select * from student where sid = ?";
	    
		
		try {
			con = dbConnector.getConnector();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, sid);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Student details with id :"+sid);
				do {
					System.out.print(rs.getInt(1)+"   ");
					System.out.print(rs.getString(2)+"   ");
					System.out.print(rs.getString(3)+"   ");
					System.out.print(rs.getString(4)+"   ");
					System.out.print(rs.getString(5)+"   ");
					System.out.print(rs.getString(6)+"   ");
					System.out.println(rs.getString(7));
				}while(rs.next());
			} else {
				System.out.println("Please enter a valid Student Id");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student sid");
		int sid = sc.nextInt();
		
		getStudent(sid);
		sc.close();
	}

}

