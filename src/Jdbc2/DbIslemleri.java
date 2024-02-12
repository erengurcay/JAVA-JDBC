package Jdbc2;

import Jdbc1.DbHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbIslemleri {
    Connection connection = null;
    static DbHelper2 helper = new DbHelper2();
    PreparedStatement statement = null;
    ResultSet resultSet;
    public static void OgrenciEkle(Ogrenci ogrenci){
        try (Connection connection = helper.getConnection()) {
            String sql = "INSERT INTO `deneme`.`ogrenci` (`ogr_no`, `ogr_ad`, `ogr_soyad`) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, ogrenci.getOgr_no());
                statement.setString(2, ogrenci.getOgr_ad());
                statement.setString(3, ogrenci.getOgr_soyad());
                int result = statement.executeUpdate();
                System.out.println("Kayıt eklendi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

