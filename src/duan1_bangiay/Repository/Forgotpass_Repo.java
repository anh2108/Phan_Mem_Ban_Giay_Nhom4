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
import java.util.ArrayList;
public class Forgotpass_Repo {
    
    public int updatepass(Forgotpass_Model fgp){
        try {
            Connection con = DBconnect.getConnection();
            String up = "UPDATE NHANVIEN SET MATKHAU = ? WHERE MANhanvien = ? ";
            PreparedStatement ps = con.prepareStatement(up);
            ps.setString(2, fgp.getUser());
            ps.setString(1, fgp.getMatkhau());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public ArrayList<Forgotpass_Model> selectEmail(String email){
        ArrayList<Forgotpass_Model> list = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT EMAIL FROM NHANVIEN where email = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
           while(rs.next()){
               Forgotpass_Model fg = new Forgotpass_Model();
               fg.setEmail(rs.getString(1));
               list.add(fg);
           }
         return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean getuser(Forgotpass_Model fgp){
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT MANhanVien FROM NHANVIEN WHERE MANhanvien = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setString(1, fgp.getUser());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
}
