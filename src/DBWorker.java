import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBWorker {

    private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String URL =
            "jdbc:mysql://localhost:3306/q?serverTimezone=UTC";

    private Connection connection;


    public DBWorker() throws SQLException{

        try {
            Class.forName(DRIVER_NAME);
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.err.println(DRIVER_NAME + " loading failure");
            return;
        }

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    public Connection getConnection() {
        return connection;
    }
}
