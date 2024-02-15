package ClassExercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper4 {
    private String userName = "root";
    private String password = "14122022";
    private String dbUrl = "jdbc:mysql://localhost:3306/school";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : "+ exception.getErrorCode());
    }
}
