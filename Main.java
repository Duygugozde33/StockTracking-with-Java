package deneme;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) throws SQLException {
        /* EKLEME
        insert insert1 = new insert();
        insert1.insert_product("celik",10,20,"demir");
           SİLME
        delete delete1 = new delete();
        delete1.delete_product("celik");
         */
        /*
        update update1= new update();
        update1.stok_guncelle("aa",20);
        */
        toplam giderHesapla = new toplam();
        System.out.println(giderHesapla.toplam_gider());
    }
}