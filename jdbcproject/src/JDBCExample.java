
import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "password";

        String sql = "SELECT id, name, department FROM student";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("Student Details");
            System.out.println("-------------------------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("department")
                );
            }

            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
