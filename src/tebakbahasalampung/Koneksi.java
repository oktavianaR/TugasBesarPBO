package tebakbahasalampung;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {

    
    private static Connection conn;

    public Koneksi() {
        connect();
    }

    public static void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tebakbahasalampung", "lampung", "lampung");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Koneksi gagal. kesalahan " + ex);
        }
    }
    
    public Connection getKoneksi(){
        return conn;
    }
}
