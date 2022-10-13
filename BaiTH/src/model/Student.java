package model;

public class Student {
    private int maSinhvien;
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;
    private double diemTB;

    public Student() {
    }

    public Student(int maSinhvien, String hoTen, int tuoi, String gioiTinh, String diaChi, double diemTB) {
        this.maSinhvien = maSinhvien;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public int getMaSinhvien() {
        return maSinhvien;
    }

    public void setMaSinhvien(int maSinhvien) {
        this.maSinhvien = maSinhvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSinhvien=" + maSinhvien +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}
