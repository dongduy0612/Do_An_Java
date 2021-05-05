/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import POJO.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Duong Duy
 */
public class hoaDonDAO {

    public static ArrayList<hoaDon> getDSHD() {
        ArrayList<hoaDon> ds = new ArrayList<>();
        try {
            dataBase.getConnection();
            String sql = "select *from hoaDon";
            ResultSet rs = dataBase.executeQuery(sql);
            while (rs.next()) {
                ds.add(new hoaDon(rs.getString("MAHD").trim(), rs.getString("MAKH").trim(), rs.getString("MANV").trim(), rs.getString("MABAN").trim(), rs.getFloat("THANHTOAN"), rs.getDate("NGAYRAHD")));
            }
        } catch (Exception e) {
        }
        dataBase.close();
        return ds;
    }

    public static int insert(String mahd, float thanhToan, String manv) {
        int i = -1;
        String sql = "set dateformat DMY insert into hoadon values(?,getdate(),?,?)";
        try {
            PreparedStatement pre = dataBase.getConnection().prepareStatement(sql);
            pre.setString(1, mahd);
            pre.setFloat(2, thanhToan);
            pre.setString(3, manv);
            i = pre.executeUpdate();
            pre.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Trùng mã hoá đơn", "Thông báo", 1);

        }
        dataBase.close();

        return i;
    }
}
