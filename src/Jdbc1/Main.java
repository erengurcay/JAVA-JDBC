package Jdbc1;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "delete from `deneme`.`ogrenci` where ogr_no = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 6);
            int result = statement.executeUpdate();
            System.out.println("Kayıt silindi.");

        }catch (SQLException exception){
            helper.shorErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }

    }
    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select ogr_no,ogr_ad,ogr_soyad from deneme.ogrenci");
            ArrayList<Student> students = new ArrayList<Student>();
            while (resultSet.next()){
                students.add(new Student(
                        resultSet.getInt("ogr_no"),
                        resultSet.getString("ogr_ad"),
                        resultSet.getString("ogr_soyad")));
            }
            System.out.println(students.size());

        }catch (SQLException exception){
            helper.shorErrorMessage(exception);
        }
        finally {
            connection.close();
        }
    }
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "INSERT INTO `deneme`.`ogrenci` (`ogr_no`, `ogr_ad`, `ogr_soyad`) VALUES (?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 6);
            statement.setString(2, "Tamer");
            statement.setString(3, "Taner");
            int result = statement.executeUpdate();
            System.out.println("Kayıt eklendi");

        }catch (SQLException exception){
            helper.shorErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }
    public void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            String sql = "update `deneme`.`ogrenci` set ogr_soyad = 'Gür', ogr_ad = 'Göktuğ' where ogr_no = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 3);
            int result = statement.executeUpdate();
            System.out.println("Kayıt güncellendi.");

        }catch (SQLException exception){
            helper.shorErrorMessage(exception);
        }
        finally {
            statement.close();
            connection.close();
        }
    }


}
