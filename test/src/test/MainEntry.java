package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class MainEntry {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;   
        ResultSet rs = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            
            con = DriverManager.getConnection(
                "jdbc:mariadb://127.0.0.1:3306/project",
                "root",
                "jean13568");
                        
            pstmt = con.prepareStatement("select * from seoul_pharmacy limit 3");
            
            rs = pstmt.executeQuery();
            
            while(rs.next()) {
                System.out.println(rs.getString("x_location"));
             }
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) {
                    rs.close(); // ���� ����
                }
                
                if(pstmt != null) {
                    pstmt.close(); // ���û��������� ȣ�� ��õ
                }
            
                if(con != null) {
                    con.close(); // �ʼ� ����
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
