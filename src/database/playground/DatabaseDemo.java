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

    public void insert(int id,String name) {
        String sql = "INSERT INTO person(id,name) VALUES(?,?)";
        Connection conn = null;
        try  {
            conn=this.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
            System.out.println("yes");
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
    public void selectAll() {
        String sql = "SELECT * FROM person";
        Connection conn = null;
        try {
            conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t"
                        +rs.getString("name")+"\t");
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



}
