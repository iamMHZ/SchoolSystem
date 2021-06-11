package database.playground;

import java.sql.*;

public class DatabaseDemo {
    private String dbUrl = "jdbc:sqlite:database.db";

    public DatabaseDemo() {

    }

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.dbUrl);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }


    public void selectAll() {
        String sql = "SELECT * FROM test";

        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
