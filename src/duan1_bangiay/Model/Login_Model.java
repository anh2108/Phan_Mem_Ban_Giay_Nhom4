/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1_bangiay.Model;

/**
 *
 * @author Admin
 */
public class Login_Model {

    private String manv;
    private String matkhau;
    private int ChucVu;

    public Login_Model() {
    }

    public Login_Model(String manv, String matkhau, int ChucVu) {
        this.manv = manv;
        this.matkhau = matkhau;
        this.ChucVu = ChucVu;
    }

    public String getmanv() {
        return manv;
    }

    public void setmanv(String manv) {
        this.manv = manv;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getChucVu() {
        return ChucVu;
    }

    public void setChucVu(int ChucVu) {
        this.ChucVu = ChucVu;
    }

}
