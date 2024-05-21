package deneme;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {
    public update(){

    }
    public void stok_guncelle(String deger,int a) throws SQLException {
        db_connector dbConnector = new db_connector();
        String sql = "UPDATE STOCK_TRACKING.PRODUCTS SET STOCK = ? WHERE PRODUCT_CODE = ?;";
        PreparedStatement preparedStatement = dbConnector.connectdb().prepareStatement(sql);
        preparedStatement.setInt(1,a);
        preparedStatement.setString(2,deger);
        preparedStatement.executeUpdate();
        dbConnector.connectdb().close();
    }
}
