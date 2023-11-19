/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Repository;

/**
 *
 * @author Admin
 */
import duan1_bangiay.Model.Hoa_don;
import java.sql.*;
import java.util.ArrayList;
public class HoadonRepo {
    
    public ArrayList<Hoa_don> getall(){
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {
            
            Connection con = DBconnect.getConnection();
            String get = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON";
            PreparedStatement ps = con.prepareStatement(get);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Hoa_don hd = new Hoa_don();
                hd.setMahd(rs.getString(1));
                hd.setKhachHang(rs.getString(2));
                hd.setSodt(rs.getString(3));
                hd.setDiachi(rs.getString(4));
                hd.setDongia(rs.getFloat(5));
                hd.setTrangthai(rs.getInt(6));
                hd.setNgaytao(rs.getDate(7));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
