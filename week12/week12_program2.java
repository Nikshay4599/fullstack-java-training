import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class week12_program2 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";           // change this
        String password = "yourpass";   // change this

        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
            pstmt = con.prepareStatement(sql);

            // Student 1
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Ravi");
            pstmt.setInt(3, 85);
            pstmt.executeUpdate();

            // Student 2
            pstmt.setInt(1, 2);
            pstmt.setString(2, "Sita");
            pstmt.setInt(3, 92);
            pstmt.executeUpdate();

            // Student 3
            pstmt.setInt(1, 3);
            pstmt.setString(2, "Amit");
            pstmt.setInt(3, 76);
            pstmt.executeUpdate();

            System.out.println("Inserted 3 student records successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

