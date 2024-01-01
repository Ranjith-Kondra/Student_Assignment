package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.dbConnector;

public class StudentByName {
	
	public static void getStudent() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		con = dbConnector.getConnector();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student sname");
		String sname = sc.nextLine();
		
		String query = "select * from student where sname = ?";
	    
		
		try {
			con = dbConnector.getConnector();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, sname);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Student details with name :"+sname);
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
				System.out.println("Please enter a valid Student Name");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}


	public static void main(String[] args) {
		getStudent();
	}

}
