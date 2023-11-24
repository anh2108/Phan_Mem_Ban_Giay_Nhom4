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

    public ArrayList<Hoa_don> getall() {
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {

            Connection con = DBconnect.getConnection();
            String get = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON";
            PreparedStatement ps = con.prepareStatement(get);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Hoa_don> gettim(String key) {
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {

            Connection con = DBconnect.getConnection();
            String get1 = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON where ID = ?";
            PreparedStatement ps1 = con.prepareStatement(get1);
            ps1.setInt(1, Integer.parseInt(key));
            ResultSet rs = ps1.executeQuery();
            while (rs.next()) {
                Hoa_don hd1 = new Hoa_don();
                hd1.setMahd(rs.getString(1));
                hd1.setKhachHang(rs.getString(2));
                hd1.setSodt(rs.getString(3));
                hd1.setDiachi(rs.getString(4));
                hd1.setDongia(rs.getFloat(5));
                hd1.setTrangthai(rs.getInt(6));
                hd1.setNgaytao(rs.getDate(7));
                list.add(hd1);
            }

        } catch (Exception e) {
            try {

                Connection con = DBconnect.getConnection();
                String get2 = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON where hoten like ?";
                PreparedStatement ps2 = con.prepareStatement(get2);
                ps2.setString(1, "%" + key + "%");
                ResultSet rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    Hoa_don hd2 = new Hoa_don();
                    hd2.setMahd(rs2.getString(1));
                    hd2.setKhachHang(rs2.getString(2));
                    hd2.setSodt(rs2.getString(3));
                    hd2.setDiachi(rs2.getString(4));
                    hd2.setDongia(rs2.getFloat(5));
                    hd2.setTrangthai(rs2.getInt(6));
                    hd2.setNgaytao(rs2.getDate(7));
                    list.add(hd2);

                }

            } catch (Exception q) {
                q.printStackTrace();
            }

        }
        return list;
    }

    public ArrayList<Hoa_don> getcbo(int tt) {
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON where TRANGTHAI = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setInt(1, tt);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Hoa_don> getrbo(int ht) {
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT HD.ID,HD.HOTEN,HD.SODT,HD.DIACHI,HD.THANHTIEN,HD.TRANGTHAI,HD.NgayTao FROM HOADON AS HD JOIN HINHTHUCTHANHTOAN AS HTTT ON HD.ID_HinhThucThanhToan = HTTT.ID JOIN ThanhToan AS TT ON HTTT.ID_ThanhToan = TT.HinhThuc WHERE TT.HinhThuc = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setInt(1, ht);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Hoa_don> getngaytao(java.util.Date ngaytao) {
        ArrayList<Hoa_don> list = new ArrayList<>();
        try {
            Connection con = DBconnect.getConnection();
            String get = "SELECT ID,HOTEN,SODT,DIACHI,THANHTIEN,TRANGTHAI,NgayTao FROM HOADON where Ngaytao = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setDate(1, (Date) ngaytao);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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
