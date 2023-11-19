/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Repository;

/**
 *
 * @author Admin
 */
import duan1_bangiay.Model.Hoadonchitiet;
import java.sql.*;
import java.util.ArrayList;

public class HoadonchitietRepo {

    public ArrayList<Hoadonchitiet> getall() {
        ArrayList<Hoadonchitiet> hdct = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "select sp.tensp,th.TenThuongHieu,kc.KichCo,ms.MauSac,hdct.soluong,hdct.dongia from HoaDonChiTiet as hdct join hoadon as hd on hdct.id_hoadon=hd.id join sanpham as sp on hdct.id_sanpham = sp.id join thuonghieu as th on sp.ID_ThuongHieu = th.id join KichCo as kc  on sp.ID_KichCo = kc.ID join MauSac as ms on sp.ID_MauSac = ms.ID";
            PreparedStatement ps = con.prepareStatement(get);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadonchitiet hdc = new Hoadonchitiet();
                hdc.setTensp(rs.getString(1));
                hdc.setThuonghieu(rs.getString(2));
                hdc.setSixe(rs.getInt(3));
                hdc.setMau(rs.getString(4));
                hdc.setSoluong(rs.getInt(5));
                hdc.setDongia(rs.getFloat(6));
                hdct.add(hdc);
            }
            return hdct;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Hoadonchitiet gethdct(int ma) {

        try {
            Connection con = DBconnect.getConnection();
            String get = "select sp.tensp,th.TenThuongHieu,kc.KichCo,ms.MauSac,hdct.soluong,hdct.dongia from HoaDonChiTiet as hdct join hoadon as hd on hdct.id_hoadon=hd.id join sanpham as sp on hdct.id_sanpham = sp.id join thuonghieu as th on sp.ID_ThuongHieu = th.id join KichCo as kc  on sp.ID_KichCo = kc.ID join MauSac as ms on sp.ID_MauSac = ms.ID where hd.ID = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setInt(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Hoadonchitiet hdct = new Hoadonchitiet();
                hdct.setTensp(rs.getString(1));
                hdct.setThuonghieu(rs.getString(2));
                hdct.setSixe(rs.getInt(3));
                hdct.setMau(rs.getString(4));
                hdct.setSoluong(rs.getInt(5));
                hdct.setDongia(rs.getFloat(6));
                return hdct;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
}
