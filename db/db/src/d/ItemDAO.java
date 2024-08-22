package d;

import java.sql.*;

public class ItemDAO {
    private Connection con;
    private PreparedStatement stmt;
    private ResultSet rs;
    
    private String url = "jdbc:mariadb://127.0.0.1:3306/test24";
    private String id = "root";
    private String pwd = "0815";
    
    public ItemDAO() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(url, id, pwd);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void selectAll() {
        String sql = "select * from item";

        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                int no = rs.getInt("no");
                String name = rs.getString("name");
                String company = rs.getString("company");
                int amount = rs.getInt("amount");
                
                System.out.println(no + " " + name + " " + company + " " + amount);
                
                dbClose();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void dbClose() {
        try {
           if (rs != null) rs.close();
           if (con != null) con.close();
           if (stmt != null) stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
