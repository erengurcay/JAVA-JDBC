package ClassExercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbIslemleri {
    static DbHelper4 helper = new DbHelper4();
    public  static void createStudent(Student student){
        try(Connection connection = helper.getConnection()){
            String sql = "INSERT INTO `deneme`.`ogrenci` (`ogr_no`, `ogr_name`, `ogr_surname`,`ogr_grade`) VALUES (?, ?, ?, ?)";
            try(PreparedStatement statement = connection.prepareStatement(sql)){
                statement.setInt(1, student.getOgr_no());
                statement.setString(2, student.getOgr_name());
                statement.setString(3, student.getOgr_surname());
                statement.setInt(4, student.getOgr_grade());
                int result = statement.executeUpdate();
                System.out.println("Kayıt Eklendi");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
