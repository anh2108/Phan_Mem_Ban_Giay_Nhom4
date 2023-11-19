package duan1_bangiay.Repository;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBconnect { //Kết nối

    public static final String HOSTNAME = "localhost";
    public static final String PORT = "1433";
    public static final String DBNAME = "DA_BANGIAY";
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "anh";
    private static Connection con;

    /**
     * Get connection to MSSQL Server
     *
     * @return Connection
     */
    public static Connection getConnection() {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + HOSTNAME + ":" + PORT + ";"
                + "databaseName=" + DBNAME + ";encrypt=true;trustservercertificate=true;";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(connectionUrl, USERNAME, PASSWORD);
        } // Handle any errors that may have occurred.
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    // tra lai mot tap doi tuong
    public static ResultSet getDataFromQuery(String sql, Object... args) throws SQLException {
        PreparedStatement pstm = getStmt(sql, args);
        return pstm.executeQuery();
    }

    // chuan bi truy van truoc khi thuc hien - cac varargs su dung dau 3 cham (...) sau kieu du lieu
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        try {
            con = getConnection();
            PreparedStatement ps;
            ps = con.prepareStatement(sql); //dung de trien khai cac cau lenh truy van thuong
            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }
            return ps;
        } catch (SQLException ex) {
            return null;
        }
    }

    public static void main(String[] args) {
        getConnection();
    }
}
