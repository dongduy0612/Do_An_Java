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
public class ban {
    String maBan,tenBan,tinhTrang;

    public ban() {
    }

    public ban(String maBan, String tenBan, String tinhTrang) {
        this.maBan = maBan;
        this.tenBan = tenBan;
        this.tinhTrang = tinhTrang;
    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "ban{" + "maBan=" + maBan + ", tenBan=" + tenBan + ", tinhTrang=" + tinhTrang + '}';
    }
    
}
