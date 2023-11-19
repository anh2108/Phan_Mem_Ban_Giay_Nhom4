/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Model;

/**
 *
 * @author Admin
 */
public class Hoadonchitiet {
    
    private String tensp;
    private String thuonghieu;
    private int sixe;
    private String mau;
    private int soluong;
    private float dongia;

    public Hoadonchitiet() {
    }

    public Hoadonchitiet(String tensp, String thuonghieu, int sixe, String mau, int soluong, float dongia) {
        this.tensp = tensp;
        this.thuonghieu = thuonghieu;
        this.sixe = sixe;
        this.mau = mau;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public int getSixe() {
        return sixe;
    }

    public void setSixe(int sixe) {
        this.sixe = sixe;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
    
    
    
}
