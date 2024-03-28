import java.sql.*;

public class db {    
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    static final String USERNAME = "your_username";
    static final String PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);            
            pstmt = conn.prepareStatement("SELECT id FROM users WHERE username = ?");
            pstmt.setString(1, "desired_username");            
            rs = pstmt.executeQuery();
            
            int userId = 0;
            if (rs.next()) {
                userId = rs.getInt("id");
                System.out.println("User ID: " + userId);
            } else {
                System.out.println("User not found.");
                return;
            }

            pstmt = conn.prepareStatement("UPDATE users SET(userid, user_name) VALUES(desired_userid=?, desired_username=?)");
            pstmt.setInt(1, userId);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User with ID " + userId + " deleted successfully.");
            } else {
                System.out.println("User deletion failed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {            
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
