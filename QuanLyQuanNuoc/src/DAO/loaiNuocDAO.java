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
public class loaiNuocDAO {
      public static ArrayList<loaiNuoc> getdsLoaiNuoc() {
        ArrayList<loaiNuoc> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from loaiNuoc";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new loaiNuoc(rs.getString("MALOAINUOC").trim(),rs.getString("TENLOAINUOC").trim()));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
