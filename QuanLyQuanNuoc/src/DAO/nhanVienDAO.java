/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Duong Duy
 */
public class nhanVienDAO {

    public static ArrayList<nhanVien> getdsnv() {
        ArrayList<nhanVien> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from nhanvien";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new nhanVien(rs.getString("MANV").trim(), rs.getString("MATKHAU").trim(), rs.getString("TENNV").trim(), rs.getString("GIOITINH").trim(), rs.getString("DIACHI").trim(), rs.getString("SODT").trim(),rs.getDate("NAMSINH"),rs.getDate("NGAYVL"), rs.getFloat("LUONG")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
    public static String dangNhap(String taikhoan,String matKhau)
    {
        for(nhanVien nv:getdsnv())        
            if(nv.getManv().equals(taikhoan)&&nv.getMatkhau().equals(matKhau))
                return nv.getManv();        
        return "";
    }
    public static String timTenNVTheoMa(String manv)
    {
        for(nhanVien nv:getdsnv())        
            if(nv.getManv().equals(manv))
                return nv.getTennv();        
        return "";
    }    
    public static void doiMatKhau(String manv,String matKhauMoi)
    {
        String sql="update nhanvien set matkhau='"+matKhauMoi+"' where manv='"+manv+"'";
        System.out.println(sql);
        dataBase.executeUpdate(sql);   
    }            
    public static String timMKTheoMa(String manv)
    {
        for(nhanVien nv:getdsnv())
            if(nv.getManv().equals(manv))
                return nv.getMatkhau();
        return "";
    }
}
