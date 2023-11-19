/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import duan1_bangiay.Model.Lichsuhoadon;

/**
 *
 * @author Admin
 */
public class LichsuhoadonRepo {

    public ArrayList<Lichsuhoadon> getall() {
        ArrayList<Lichsuhoadon> list = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT HD.ID,NV.HoTen,HD.HoTen,HD.ThanhTien,HD.NgayTao,HD.NgayGiaoHang,HD.NgayNhanHang FROM HOADON AS HD JOIN NHANVIEN AS NV ON HD.ID_NhanVien=NV.ID";
            PreparedStatement ps = con.prepareStatement(get);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lichsuhoadon hd = new Lichsuhoadon();
                hd.setMahoadon(rs.getInt(1));
                hd.setTennhanvien(rs.getString(2));
                hd.setTenkhachhang(rs.getString(3));
                hd.setThanhtien(rs.getFloat(4));
                hd.setNgaytao(rs.getDate(5));
                hd.setNgaygiao(rs.getDate(6));
                hd.setNgaynhan(rs.getDate(7));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
