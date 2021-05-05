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
public class nhapKhoDAO {
     public static ArrayList<nhapKho> getdsNK() {
        ArrayList<nhapKho> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from nhapKho";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new nhapKho(rs.getString("MANHAP").trim(),rs.getString("MANV").trim(),rs.getFloat("THANHTIEN"),rs.getDate("NGAYNHAP")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
