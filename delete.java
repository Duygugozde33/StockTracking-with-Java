package deneme;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete {
    public delete(){

    }
    public void delete_product(String deger) throws SQLException {
        db_connector dbConnector = new db_connector();
        String sql = "DELETE FROM STOCK_TRACKING.PRODUCTS WHERE PRODUCT_CODE = ?;";
        PreparedStatement preparedStatement = dbConnector.connectdb().prepareStatement(sql);
        preparedStatement.setString(1,deger);;
        preparedStatement.executeUpdate();
        dbConnector.connectdb().close();
    }
}

