package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.dbConnector;

public class DeleteStudent {
	
	public static void delete() {
		PreparedStatement pstmt = null;
		Connection con = null;
		con = dbConnector.getConnector();
		//FetchAllStudents.printAllStudents();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student id to delete :");
		int sid = sc.nextInt();
		
		String query = "delete from student where sid = ?";
	    
		
		try {
			con = dbConnector.getConnector();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, sid);
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("Student record delted successfully !!");
				FetchAllStudents.printAllStudents();
			} else {
				System.out.println("Please enter a valid sid ");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
	
	public static void main(String[] args) {
		delete();
	}

}

