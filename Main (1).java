package deneme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        /* EKLEME
        insert insert1 = new insert();
        insert1.insert_product("celik",10,20,"demir");
           SİLME
        delete delete1 = new delete();
        delete1.delete_product("celik");
         */
        update update1= new update();
        update1.stok_guncelle("aa",20);
    }
}