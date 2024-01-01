package day01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.db.dbConnector;

public class UpdateStudent {
	
	public static void update() {
		PreparedStatement pstmt = null;
		Connection con = null;
		con = dbConnector.getConnector();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student sname,trainer and sid to Update");
		String sname = sc.nextLine();
		String trainer = sc.next();
		int sid = sc.nextInt();
		
		String query = "update student set sname = ? , trainer = ? where sid = ?";
	    
		
		try {
			con = dbConnector.getConnector();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, sname);
			pstmt.setString(2, trainer);
			pstmt.setInt(3, sid);
			StudentById.getStudent(sid);
			
			System.out.println("==================================================================");
			int cnt = pstmt.executeUpdate();
			if(cnt > 0) {
				System.out.println("Student Record Updated Successfully!!");
				StudentById.getStudent(sid);
			} else {
				System.out.println("Update failed !!");
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}


	public static void main(String[] args) {
		update();
	}

}
