
package duan1_bangiay.Service;

import duan1_bangiay.Model.ChucVu;
import duan1_bangiay.Model.NhanVien;
import duan1_bangiay.Repository.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class NhanVien_Service {
    Connection con = null;
    PreparedStatement ps = null;
    String sql = null;
    ResultSet rs = null;
    
    public List<NhanVien> getAll(){
        sql = "SELECT NhanVien.id, MaNhanVien, HoTen, SoDt, Email, MatKhau, DiaChi, TrangThai, NhanVien.NgayTao, NhanVien.NgaySua, ChucVu FROM NhanVien JOIN ChucVu ON NhanVien.id_ChucVu = ChucVu.id";
        List<NhanVien> listnv = new ArrayList();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11));
                listnv.add(nv);
            }
            return listnv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public NhanVien getNV(int id){
        sql = "SELECT NhanVien.id, MaNhanVien, HoTen, SoDt, Email, MatKhau, MaOtp, DiaChi, TrangThai, NhanVien.NgayTao, NhanVien.NgaySua, ChucVu FROM NhanVien JOIN ChucVu ON NhanVien.id_ChucVu = ChucVu.id WHERE NhanVien.id = ?";
        NhanVien nv = null;
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getDate(9), rs.getDate(10), rs.getBoolean(11));
            }
            return nv;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int insertNV (NhanVien nv){
        sql = "INSERT INTO NhanVien (id_ChucVu, MaNhanVien, HoTen, SoDt, Email, MatKhau, DiaChi, TrangThai, NguoiTao, NguoiSua, NgayTao, NgaySua) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getMaNV());
            ps.setObject(2, nv.getHoTen());
            ps.setObject(3, nv.getSDT());
            ps.setObject(4, nv.getEmail());
            ps.setObject(5, nv.getMatKhau());
            ps.setObject(7, nv.getDiaChi());
            ps.setObject(8, nv.isTrangThai());
            ps.setObject(9, nv.getNguoiTao());
            ps.setObject(10, nv.getNguoiSua());
            ps.setObject(11, nv.getNgayTao());
            ps.setObject(12, nv.getNgaySua());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int insertCV (ChucVu cv){
        sql = "INSERT INTO ChucVu (id, ChucVu, NguoiTao, NguoiSua, NgayTao, NgaySua) VALUES (?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cv.getId());
            ps.setObject(2, cv.isChucVu());
            ps.setObject(3, cv.getNguoiTao());
            ps.setObject(4, cv.getNguoiSua());
            ps.setObject(5, cv.getNgayTao());
            ps.setObject(6, cv.getNgaySua());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int updateNV (int id, NhanVien nv){
        sql = "UPDATE NhanVien SET MaNhanVien = ?, HoTen = ?, SoDt = ?, Email= ?, MatKhau = ?, MaOtp = ?, DiaChi = ?, TrangThai = ?, NguoiTao = ?, NguoiSua = ?, NgayTao = ?, NgaySua = ? WHERE id_ChucVu = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, nv.getHoTen());
            ps.setObject(2, nv.getSDT());
            ps.setObject(3, nv.getEmail());
            ps.setObject(4, nv.getMatKhau());
            ps.setObject(5, nv.getMaOTP());
            ps.setObject(6, nv.getDiaChi());
            ps.setObject(7, nv.isTrangThai());
            ps.setObject(8, nv.getNguoiTao());
            ps.setObject(9, nv.getNguoiSua());
            ps.setObject(10, nv.getNgayTao());
            ps.setObject(11, nv.getNgaySua());
            ps.setObject(12, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int updateCV (int id, ChucVu cv){
        sql = "UPDATE ChucVu SET ChucVu = ?, NguoiTao = ?, NguoiSua = ?, NgayTao = ?, NgaySua = ? WHERE id = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, cv.isChucVu());
            ps.setObject(2, cv.getNguoiTao());
            ps.setObject(3, cv.getNguoiSua());
            ps.setObject(4, cv.getNgayTao());
            ps.setObject(5, cv.getNgaySua());
            ps.setObject(6, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int deleteNV (int id){
        sql = "DELETE FROM NhanVien WHERE id = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
