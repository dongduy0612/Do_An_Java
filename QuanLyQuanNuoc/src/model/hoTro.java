/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Thread.sleep;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Duong Duy
 */
public  class hoTro {

    static SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static boolean ktraRong(JTextField txt) {
        if (txt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, txt.getName() + " không được rỗng", "Thông báo", 1);
            txt.requestFocus();
            return true;
        }
        return false;
    }

    public static void clock(JLabel lbTime) {
        Thread clock = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Date t = new Date();
                        lbTime.setText(ft.format(t));
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        System.out.println("hihih");
        clock.start();

    }
}
