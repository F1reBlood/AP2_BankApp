package turki.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String BDD = "annee2_ap2_banque";
    private static final String URL = "jdbc:mysql://localhost:3306/"+BDD+"?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezoneUTC";
    private static final String USER = "root";
    private static final String PWD = "";

    public static Connection get() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL,USER,PWD);
    }
}
