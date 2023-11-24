/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Repository;

/**
 *
 * @author Admin
 */
import duan1_bangiay.Model.Login_Model;
import java.sql.*;

public class Login_Repo {
    public Login_Model getDangnhap(String manv,String mk){
        try {
            Connection con = DBconnect.getConnection();
            String get = ("SELECT NV.SODT, NV.MATKHAU, CV.CHUCVU FROM NHANVIEN AS NV JOIN CHUCVU AS CV ON NV.ID_CHUCVU=CV.ID WHERE NV.Manhanvien =? AND NV.MATKHAU=?");
            PreparedStatement ps = con.prepareStatement(get);
            ps.setString(1,manv);
            ps.setString(2, mk);
            ResultSet rs =  ps.executeQuery();
            while(rs.next()){
                Login_Model lg = new Login_Model();
                lg.setmanv(rs.getString(1));
                lg.setMatkhau(rs.getString(2));
                lg.setChucVu(rs.getInt(3));
                return lg;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
