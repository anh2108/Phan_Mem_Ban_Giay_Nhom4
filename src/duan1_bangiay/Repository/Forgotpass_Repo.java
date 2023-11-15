/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Repository;

/**
 *
 * @author Admin
 */
import duan1_bangiay.Model.Forgotpass_Model;
import java.sql.*;
public class Forgotpass_Repo {
    
    public int updatepass(Forgotpass_Model fgp){
        try {
            Connection con = DBconnect.getConnection();
            String up = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANV = ? ";
            PreparedStatement ps = con.prepareStatement(up);
            ps.setString(2, fgp.getUser());
            ps.setString(1, fgp.getMatkhau());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int selectEmail(String email){
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT EMAIL FROM NHANVIEN";
            PreparedStatement ps = con.prepareStatement(get);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               Forgotpass_Model fg = new Forgotpass_Model();
               fg.setEmail(rs.getString(1));
               
           }
           return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
