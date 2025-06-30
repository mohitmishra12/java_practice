import javafx.scene.chart.ScatterChart;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcConnection {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/testdb", "root", "yourpassword");

            System.out.println("✅ Connection Successful!");
            con.close();
        }catch (Exception e){
            System.out.println("error");
       }

    }
}
