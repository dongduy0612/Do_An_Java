/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

/**
 *
 * @author Duong Duy
 */
public class chiTietHD {
    String maHD,maNuocUong;
    int soLuong;
    float thanhTien;

    public chiTietHD() {
    }

    public chiTietHD(String maHD, String maNuocUong, int soLuong, float thanhTien) {
        this.maHD = maHD;
        this.maNuocUong = maNuocUong;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNuocUong() {
        return maNuocUong;
    }

    public void setMaNuocUong(String maNuocUong) {
        this.maNuocUong = maNuocUong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "chiTietHD{" + "maHD=" + maHD + ", maNuocUong=" + maNuocUong + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }
    
}
