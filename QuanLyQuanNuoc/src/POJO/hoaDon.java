/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POJO;

import java.util.Date;

/**
 *
 * @author Duong Duy
 */
public class hoaDon {
   String mahd,makh,manv,maban;
   float thanhToan;
   Date ngayRaHD;
    public hoaDon() {
    }

    public hoaDon(String mahd, String makh, String manv, String maban, float thanhToan, Date ngayRaHD) {
        this.mahd = mahd;
        this.makh = makh;
        this.manv = manv;
        this.maban = maban;
        this.thanhToan = thanhToan;
        this.ngayRaHD = ngayRaHD;
    }

    public float getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(float thanhToan) {
        this.thanhToan = thanhToan;
    }


   
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMaban() {
        return maban;
    }

    public void setMaban(String maban) {
        this.maban = maban;
    }

    public Date getNgayRaHD() {
        return ngayRaHD;
    }

    public void setNgayRaHD(Date ngayRaHD) {
        this.ngayRaHD = ngayRaHD;
    }

    @Override
    public String toString() {
        return "hoaDon{" + "mahd=" + mahd + ", makh=" + makh + ", manv=" + manv + ", maban=" + maban + ", thanhToan=" + thanhToan + ", ngayRaHD=" + ngayRaHD + '}';
    }

  
}
