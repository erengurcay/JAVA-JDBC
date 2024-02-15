package Ts2DashBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VeritabaniIslemleri {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet;
    static Dbhelper3 helper = new Dbhelper3();
    public static void updateUser(User user){
        try (Connection connection = helper.getConnection()) {

            String selectSql = "SELECT * FROM `ts2`.`dor` WHERE user_name = ?";
            try (PreparedStatement selectStatement = connection.prepareStatement(selectSql)) {
                selectStatement.setString(1,  user.getUser_name());
                try (ResultSet resultSet = selectStatement.executeQuery()) {
                    if (resultSet.next()) {

                        int eskiDorCount = resultSet.getInt("dor_count");
                        int eskiSkyBox = resultSet.getInt("sky_box");


                        int yeniDorCount = eskiDorCount + user.getDor_count();
                        int yeniSkyBox = eskiSkyBox + user.getSky_box();


                        String updateSql = "UPDATE `ts2`.`dor` SET dor_count = ?, sky_box = ? WHERE user_name = ?";
                        try (PreparedStatement updateStatement = connection.prepareStatement(updateSql)) {
                            updateStatement.setInt(1, yeniDorCount);
                            updateStatement.setInt(2, yeniSkyBox);
                            updateStatement.setString(3, user.getUser_name());
                            updateStatement.executeUpdate();
                            System.out.println("Kayıt güncellendi");
                        }
                    } else {
                        String insertSql = "INSERT INTO `ts2`.`dor` (user_name, dor_count, sky_box) VALUES (?, ?, ?)";
                        try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                            insertStatement.setString(1, user.getUser_name());
                            insertStatement.setInt(2, user.getDor_count());
                            insertStatement.setInt(3, user.getSky_box());
                            insertStatement.executeUpdate();
                            System.out.println("Kayıt eklendi");
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

    /*
    public static void CreateUser(User user){
        try (Connection connection = helper.getConnection()) {
            String sql = "INSERT INTO `ts2`.`dor` (`user_name`, `dor_count`, `sky_box`) VALUES (?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUser_name());
                statement.setInt(2,user.getDor_count());
                statement.setInt(3,user.getSky_box() );

                int result = statement.executeUpdate();
                System.out.println("Kayıt eklendi");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    */







