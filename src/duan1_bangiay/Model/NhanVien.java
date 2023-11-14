
package duan1_bangiay.Model;

import java.util.Date;


public class NhanVien {
    private int id;
    private int id_ChucVu;
    private String maNV;
    private String hoTen;
    private String SDT;
    private String email;
    private String matKhau;
    private String maOTP;
    private String diaChi;
    private boolean trangThai;
    private int nguoiTao;
    private int nguoiSua;
    private Date ngayTao;
    private Date ngaySua;
    private boolean chucVu;

    public NhanVien() {
    }

    public NhanVien(int id, String maNV, String hoTen, String SDT, String email, String matKhau, String diaChi, boolean trangThai, Date ngayTao, Date ngaySua, boolean chucVu) {
        this.id = id;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.SDT = SDT;
        this.email = email;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.chucVu = chucVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ChucVu() {
        return id_ChucVu;
    }

    public void setId_ChucVu(int id_ChucVu) {
        this.id_ChucVu = id_ChucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getMaOTP() {
        return maOTP;
    }

    public void setMaOTP(String maOTP) {
        this.maOTP = maOTP;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public int getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(int nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public int getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(int nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public boolean isChucVu() {
        return chucVu;
    }

    public void setChucVu(boolean chucVu) {
        this.chucVu = chucVu;
    }

    
    public Object[] toDataRow(){
           return new Object[]{
               this.maNV,
               this.hoTen,
               this.SDT,
               this.email, 
               this.matKhau, 
               this.diaChi, 
               this.trangThai,
               this.ngayTao,
               this.ngaySua,
               this.chucVu
           };
    }
}
