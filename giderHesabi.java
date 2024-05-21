import java.sql.*;

public class giderHesabi {
    public static double calculateDifference() {
        double difference = 0.0;
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root123")) {
            Statement statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT TotalPrice, dbill FROM stock_tracking.bills ORDER BY dbill");

            double previousPrice = 0.0;
            boolean firstBill = true;

            while (resultSet.next()) {
                double currentPrice = resultSet.getDouble("TotalPrice");
                if (!firstBill) {

                    difference = currentPrice - previousPrice;
                } else {
                    firstBill = false;
                }
                previousPrice = currentPrice;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return difference;
    }
}
