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
public class chiTietNKDAO {
     public static ArrayList<chiTietNK> getdsCTNK() {
        ArrayList<chiTietNK> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from chiTietNK";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new chiTietNK(rs.getString("MANHAP").trim(),rs.getString("MANUOC").trim(),rs.getInt("SOLUONG"),rs.getFloat("GIANHAP")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
