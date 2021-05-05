/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.ban;
import POJO.nhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Duong Duy
 */
public class banDAO {
     public static ArrayList<ban> getdsban() {
        ArrayList<ban> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from BAN";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new ban(rs.getString("MABAN").trim(),rs.getString("TENBAN").trim(),rs.getString("TINHTRANG").trim()));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }
}
