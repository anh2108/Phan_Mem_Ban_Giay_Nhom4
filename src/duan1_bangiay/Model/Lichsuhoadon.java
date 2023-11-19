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
public class Lichsuhoadon {
    private int mahoadon;
    private String tennhanvien;
    private String tenkhachhang;
    private float thanhtien;
    private Date ngaytao;
    private Date ngaygiao;
    private Date ngaynhan;

    public Lichsuhoadon() {
    }

    public Lichsuhoadon(int mahoadon, String tennhanvien, String tenkhachhang, float thanhtien, Date ngaytao, Date ngaygiao, Date ngaynhan) {
        this.mahoadon = mahoadon;
        this.tennhanvien = tennhanvien;
        this.tenkhachhang = tenkhachhang;
        this.thanhtien = thanhtien;
        this.ngaytao = ngaytao;
        this.ngaygiao = ngaygiao;
        this.ngaynhan = ngaynhan;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaygiao() {
        return ngaygiao;
    }

    public void setNgaygiao(Date ngaygiao) {
        this.ngaygiao = ngaygiao;
    }

    public Date getNgaynhan() {
        return ngaynhan;
    }

    public void setNgaynhan(Date ngaynhan) {
        this.ngaynhan = ngaynhan;
    }
    
    
}
