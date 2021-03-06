/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/11/2020
 * Time: 9:07 SA
 */

public class DanhBa {
    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private String facebook;
    private String gioiTinh;
    private String ngaySinh;

    public DanhBa() {
    }

    public DanhBa(String hoTen, String soDienThoai, String diaChi, String email, String facebook, String gioiTinh) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        this.facebook = facebook;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "DanhBa{" +
                "Họ Tên='" + hoTen + '\'' +
                ", Số điện thoại='" + soDienThoai + '\'' +
                ", Địa chỉ='" + diaChi + '\'' +
                ", Email='" + email + '\'' +
                ", Facebook='" + facebook + '\'' +
                ", Giới tính='" + gioiTinh + '\'' +
                ", Ngày sinh='" + ngaySinh + '\'' +
                '}';
    }
}
