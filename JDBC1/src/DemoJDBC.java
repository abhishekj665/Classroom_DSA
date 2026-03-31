import java.sql.*;


public class DemoJDBC {

    public static void main(String[] args) throws Exception {

        String name = "Naveen";
        int marks = 89;
        int id = 5;

        String query = "INSERT into Student values (?, ?, ?)";


        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql://localhost:5000/Demo";
        String user = "postgres";
        String password = "Abhishek@123";
        System.out.println("Connected to DB");

        Connection con = DriverManager.getConnection(url, user, password);


        PreparedStatement st = con.prepareStatement(query);

        st.setInt(1, id);
        st.setString(2, name);
        st.setInt(3, marks);

        st.executeUpdate();


        con.close();

        System.out.println("DB close");

    }
}
