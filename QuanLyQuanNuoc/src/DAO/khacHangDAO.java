/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Duong Duy
 */
public class khacHangDAO {
     public static ArrayList<khachHang> getdsKH() {
        ArrayList<khachHang> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from khachHang";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new khachHang(rs.getString("MAKH").trim(),rs.getString("TENKH".trim()),rs.getString("GIOITINH").trim(),rs.getString("DIACHI").trim(),rs.getString("SDT").trim(),rs.getString("MALOAIKH").trim()));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
