import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class week12_program3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";           // change this
        String password = "yourpass";   // change this

        Connection con = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

            System.out.print("Enter student ID to update marks: ");
            int id = sc.nextInt();

            System.out.print("Enter new marks: ");
            int marks = sc.nextInt();

            String sql = "UPDATE students SET marks = ? WHERE id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, marks);
            pstmt.setInt(2, id);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Updated marks for student with ID: " + id);
            } else {
                System.out.println("No student found with ID: " + id);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
