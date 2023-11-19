/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Hoa_don {
    private int stt;
    private String mahd;
    private String khachHang;
    private String sodt;
    private String diachi;
    private float Dongia;
    private int trangthai;
    private int Soluong;
    private Date ngaytao;

    public Hoa_don() {
    }

    public Hoa_don(int stt, String mahd, String khachHang, String sodt, String diachi, float Dongia, int trangthai, int Soluong, Date ngaytao) {
        this.stt = stt;
        this.mahd = mahd;
        this.khachHang = khachHang;
        this.sodt = sodt;
        this.diachi = diachi;
        this.Dongia = Dongia;
        this.trangthai = trangthai;
        this.Soluong = Soluong;
        this.ngaytao = ngaytao;
    }

    
    
    public Hoa_don(String mahd, String khachHang, String sodt, String diachi, float Dongia, int trangthai, int Soluong, Date ngaytao) {
        this.mahd = mahd;
        this.khachHang = khachHang;
        this.sodt = sodt;
        this.diachi = diachi;
        this.Dongia = Dongia;
        this.trangthai = trangthai;
        this.Soluong = Soluong;
        this.ngaytao = ngaytao;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    
    
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(String khachHang) {
        this.khachHang = khachHang;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public float getDongia() {
        return Dongia;
    }

    public void setDongia(float Dongia) {
        this.Dongia = Dongia;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
    

    
}
