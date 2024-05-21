package deneme;
import java.sql.*;

public class insert{

        public insert(){

        }
        public void insert_product(String deger,int a,int b, String stoktipi) throws SQLException {
            db_connector dbConnector = new db_connector();
            String sql = "INSERT INTO STOCK_TRACKING.PRODUCTS(product_code,categoryID,stock,stock_type)VALUES (?,?,?,?);";
            PreparedStatement preparedStatement = dbConnector.connectdb().prepareStatement(sql);
            preparedStatement.setString(1,deger);
            preparedStatement.setInt(2,a);
            preparedStatement.setInt(3,b);
            preparedStatement.setString(4,stoktipi);
            preparedStatement.executeUpdate();
            dbConnector.connectdb().close();
        }
}