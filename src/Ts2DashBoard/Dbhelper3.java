package Ts2DashBoard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbhelper3 {
    private String userName = "root";
    private String password = "";
    private String dbUrl = "";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);

    }
    public void shorErrorMessage(SQLException exception){
        System.out.println("Error : "+ exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }
}
