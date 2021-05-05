/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Duong Duy
 */
public class nuocUongDAO {

    public static ArrayList<nuocUong> getdsNuocUong() {
        ArrayList<nuocUong> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from nuocUong";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new nuocUong(rs.getString("MANUOCUONG").trim(), rs.getString("TENNUOCUONG").trim(), rs.getString("MALOAINUOC").trim(), rs.getFloat("DONGIA")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }

    public static Vector timTenNuoc(String tenNuoc,int soLuong) {
        Vector r = new Vector();
        try {
            for (nuocUong n : getdsNuocUong()) {
                if (n.getTenNuoc().equals(tenNuoc)) {
                    r.add(n.getMaNuoc());
                    r.add(tenNuoc);
                    r.add(n.getDonGia());
                    r.add(soLuong);
                    r.add(soLuong*n.getDonGia());
                    return r;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
