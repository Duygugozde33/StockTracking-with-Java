package deneme;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class Kur_cevir {
    public Kur_cevir(){

    }
    public double kur_cevir(int a) throws SQLException {
        db_connector d_baglan = new db_connector(); //database baglanam nesnesi
        String sql = "SELECT Currency, TotalPrice FROM STOCK_TRACKING.BILLS ORDER BY dbill DESC LIMIT ?";
        PreparedStatement preparedStatement = d_baglan.connectdb().prepareStatement(sql);
        preparedStatement.setInt(1,a);
        ResultSet resultSet = preparedStatement.executeQuery();
        String currency0 = null;
        int tamount = 0;

        if(resultSet.next()) {
            currency0 = resultSet.getString("Currency");
            tamount = resultSet.getInt("TotalPrice");
        }
        double dolar_kuru = 29.00;
        double euro_kuru = 31.22 ;
        double toplam = 0;
        if ( currency0.equals("dolar")) {
            toplam += tamount*dolar_kuru;
        }
        else if ( currency0.equals("euro")) {
            toplam += tamount*euro_kuru;
        }
        else  {
            toplam += tamount;
        }
        return toplam;
    }
}
