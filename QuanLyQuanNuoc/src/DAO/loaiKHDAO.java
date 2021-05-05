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
public class loaiKHDAO {
     public static ArrayList<loaiKH> getdsLoaiKH() {
        ArrayList<loaiKH> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from loaiKH";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new loaiKH(rs.getString("MALOAIKH").trim(),rs.getString("TENLOAIKH").trim(),rs.getFloat("GIAMGIA")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
