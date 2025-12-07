

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class week12_program1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/schooldb";
        String user = "root";           // change this
        String password = "yourpass";   // change this

        Connection con = null;
        Statement stmt = null;

        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Get connection
            con = DriverManager.getConnection(url, user, password);

            // Create statement
            stmt = con.createStatement();

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "marks INT)";

            stmt.executeUpdate(sql);

            System.out.println("Table 'students' created (or already exists).");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
