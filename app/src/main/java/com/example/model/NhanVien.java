package com.example.model;

public class NhanVien {
    private String tenNhanVien;
    private String thuBatDauCongTac;
    private int soNgayCongTac;

    public NhanVien(String tenNhanVien, String thuBatDauCongTac, int soNgayCongTac) {
        this.tenNhanVien = tenNhanVien;
        this.thuBatDauCongTac = thuBatDauCongTac;
        this.soNgayCongTac = soNgayCongTac;
    }

    public NhanVien() {
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getThuBatDauCongTac(String s) {
        return thuBatDauCongTac;
    }

    public void setThuBatDauCongTac(String thuBatDauCongTac) {
        this.thuBatDauCongTac = thuBatDauCongTac;
    }

    public int getSoNgayCongTac() {
        return soNgayCongTac;
    }

    public void setSoNgayCongTac(int soNgayCongTac) {
        this.soNgayCongTac = soNgayCongTac;
    }


    @Override
    public String toString() {
        return this.tenNhanVien+"\n Bắt đầu đi công tác vào thứ [" +this.thuBatDauCongTac+"]"
                +"\n Số ngày công tác thoe dự kiến ="+ this.soNgayCongTac;
    }
}
