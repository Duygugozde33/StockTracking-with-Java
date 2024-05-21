package deneme;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class toplam {
    public toplam(){
    }
    public double toplam_gider() throws SQLException {
        Kur_cevir kurCevir= new Kur_cevir();

        double toplam = 0;
        for ( int i = 1 ; i<30; i++) {
            toplam = toplam + kurCevir.kur_cevir(i);
        }

        return toplam;

    }
}
