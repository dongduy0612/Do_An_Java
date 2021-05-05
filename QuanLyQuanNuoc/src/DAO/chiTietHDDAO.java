/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Duong Duy
 */
public class chiTietHDDAO {

    public static ArrayList<chiTietHD> getdsCTHD() {
        ArrayList<chiTietHD> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from chiTietHD";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new chiTietHD(rs.getString("MAHD").trim(), rs.getString("MANUOCUONG").trim(), rs.getInt("SOLUONG"), rs.getFloat("THANHTIEN")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }

    public static void insert(String mahd, String manuoc, int soluong, float thanhTien) {
        try {
            dataBase.getConnection();
            String sql = "insert chitiethd values(?,?,?,?)";
            PreparedStatement pre = dataBase.con.prepareStatement(sql);
            pre.setString(1, mahd);
            pre.setString(2, manuoc);
            pre.setInt(3, soluong);
            pre.setFloat(4, thanhTien);
            pre.executeUpdate();
            pre.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        dataBase.close();
    }
}
