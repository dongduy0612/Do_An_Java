/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import model.SetImage;
import model.hoTro;

/**
 *
 * @author HP
 */
public class quanly extends javax.swing.JFrame {

    /**
     * Creates new form quanly
     */
    public quanly(String tentk) {
        
        initComponents();
        hoTro.clock(lbTime);
        setLocationRelativeTo(null);
        btnThemMon.setSize(190, 190);
        SetImage.setImageButton(btnThemMon, "src//img//themmon.jpg");
        btnQuanLyDoanhThu.setSize(190, 190);
        SetImage.setImageButton(btnQuanLyDoanhThu, "src//img//quanlydoanhthu.jpg");
         btnQuanLyNV.setSize(190, 190);
        SetImage.setImageButton(btnQuanLyNV, "src//img//quanlynhanvien.jpg");
        btnQuanLyLoaiKhach.setSize(190, 190);
        SetImage.setImageButton(btnQuanLyLoaiKhach, "src//img//quanlyloaikhachhang.png");
          btnQuanLyHoaDon.setSize(190, 190);
        SetImage.setImageButton(btnQuanLyHoaDon, "src//img//quanlyhoadon.png");
         btnLichSu.setSize(190, 190);
        SetImage.setImageButton(btnLichSu, "src//img//lichsubanhang.png");
        lbHello.setText(lbHello.getText()+tentk);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src//img//nenquanly.jpg");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        jButton1 = new javax.swing.JButton();
        btnThemMon = new javax.swing.JButton();
        btnQuanLyDoanhThu = new javax.swing.JButton();
        btnQuanLyNV = new javax.swing.JButton();
        btnQuanLyLoaiKhach = new javax.swing.JButton();
        btnQuanLyHoaDon = new javax.swing.JButton();
        btnLichSu = new javax.swing.JButton();
        lbHello = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admin");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jButton1.setText("????NG XU???T");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnThemMon.setForeground(new java.awt.Color(51, 51, 51));
        btnThemMon.setToolTipText("Th??m m??n");
        btnThemMon.setBorder(null);
        btnThemMon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnQuanLyDoanhThu.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLyDoanhThu.setToolTipText("Qu???n l?? doanh thu");
        btnQuanLyDoanhThu.setBorder(null);
        btnQuanLyDoanhThu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnQuanLyNV.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLyNV.setToolTipText("Qu???n l?? nh??n vi??n");
        btnQuanLyNV.setBorder(null);
        btnQuanLyNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnQuanLyLoaiKhach.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLyLoaiKhach.setToolTipText("Qu???n l?? ch????ng tr??nh gi???m gi?? kh??ch h??ng");
        btnQuanLyLoaiKhach.setBorder(null);
        btnQuanLyLoaiKhach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnQuanLyHoaDon.setForeground(new java.awt.Color(51, 51, 51));
        btnQuanLyHoaDon.setToolTipText("Qu???n l?? ho?? ????n");
        btnQuanLyHoaDon.setBorder(null);
        btnQuanLyHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnLichSu.setForeground(new java.awt.Color(51, 51, 51));
        btnLichSu.setToolTipText("L???ch s??? b??n h??ng");
        btnLichSu.setBorder(null);
        btnLichSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbHello.setBackground(new java.awt.Color(255, 255, 255));
        lbHello.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbHello.setForeground(new java.awt.Color(255, 255, 255));
        lbHello.setText("Xin ch??o, ");

        lbTime.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbTime.setForeground(new java.awt.Color(255, 0, 204));
        lbTime.setText("hihihi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnQuanLyNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnQuanLyLoaiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnQuanLyDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHello)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbTime))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(lbHello))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThemMon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyLoaiKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQuanLyDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(lbTime))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnQuanLyDoanhThu;
    private javax.swing.JButton btnQuanLyHoaDon;
    private javax.swing.JButton btnQuanLyLoaiKhach;
    private javax.swing.JButton btnQuanLyNV;
    private javax.swing.JButton btnThemMon;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbHello;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
