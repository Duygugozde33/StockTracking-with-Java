package deneme;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db_connector{
    public static void main(String[] args) throws SQLException {

    }

    public static Connection connection;
    public db_connector(){

    }
    public static PreparedStatement Pstatement;
    public Connection connectdb() throws SQLException {

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "yaren", "yaren");
        return  connection;

    }
}




