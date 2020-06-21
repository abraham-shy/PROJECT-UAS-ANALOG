package mysql;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class connect {
    private static Connection mysql;
    public static Connection GetConnection() throws SQLException{
        if (mysql==null){
            new Driver();
            mysql = DriverManager.getConnection("jdbc:mysql://localhost:3306/ujian_offline","root","");
            
        }
        return mysql;
    }
    
}
