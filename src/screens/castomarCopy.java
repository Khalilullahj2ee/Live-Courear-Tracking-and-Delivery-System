/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import com.homePage.HomePage;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.util.DatabaceConnector;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khalil
 */
public class castomarCopy extends javax.swing.JFrame {

    /**
     * Creates new form castomarCopy
     */
    public castomarCopy() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lfOrderId = new javax.swing.JLabel();
        lfDocType = new javax.swing.JLabel();
        lfFrName = new javax.swing.JLabel();
        forAdrees = new javax.swing.JLabel();
        FroPhone = new javax.swing.JLabel();
        lfQty = new javax.swing.JLabel();
        lfDaTE = new javax.swing.JLabel();
        toName = new javax.swing.JLabel();
        toAdress = new javax.swing.JLabel();
        toPhone = new javax.swing.JLabel();
        lfamount = new javax.swing.JLabel();
        lfConENT = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        tfSarchF = new javax.swing.JTextField();
        btnSarch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/homePage/logoE.jpg"))); // NOI18N
        btnHome.setText(" ");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 113, 94));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Express Couriar Service Ltd.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 500, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 143, 0));
        jLabel1.setText("Head Office: 2/2, Mirpur Road, Darussalam, Dhaka-1216, Bangladesh. Phone: 95648572,587854822");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Hot Line: 01558386649, www.express.com, Gmail: express_service247@gmail.com");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, 23));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Order Id:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, 94, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("From:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 216, 94, 26));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Service Type:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, 94, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Phone:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 285, 94, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Address:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, 94, 26));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("To:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 216, 94, 26));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 153));
        jLabel10.setText("Address:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 253, 94, 26));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Phone:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 285, 94, 26));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("Content:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 187, 94, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Booking Date:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 155, 121, 26));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 900, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Amount:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 317, 94, 26));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Quantity:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 317, 94, 26));

        lfOrderId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfOrderId.setForeground(new java.awt.Color(0, 153, 153));
        lfOrderId.setText(" ");
        getContentPane().add(lfOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 155, 134, 26));

        lfDocType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfDocType.setForeground(new java.awt.Color(0, 153, 153));
        lfDocType.setText(" ");
        getContentPane().add(lfDocType, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 197, 134, 26));

        lfFrName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfFrName.setForeground(new java.awt.Color(0, 153, 153));
        lfFrName.setText(" ");
        getContentPane().add(lfFrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 226, 134, 26));

        forAdrees.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        forAdrees.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(forAdrees, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 263, 134, 26));

        FroPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FroPhone.setForeground(new java.awt.Color(0, 153, 153));
        FroPhone.setText(" ");
        getContentPane().add(FroPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 295, 134, 26));

        lfQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfQty.setForeground(new java.awt.Color(0, 153, 153));
        lfQty.setText(" ");
        getContentPane().add(lfQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 327, 134, 26));

        lfDaTE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfDaTE.setForeground(new java.awt.Color(0, 153, 153));
        lfDaTE.setText(" ");
        getContentPane().add(lfDaTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 155, 122, 26));

        toName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toName.setForeground(new java.awt.Color(0, 153, 153));
        toName.setText(" ");
        getContentPane().add(toName, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 219, 142, 26));

        toAdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toAdress.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(toAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 256, 142, 26));

        toPhone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toPhone.setForeground(new java.awt.Color(0, 153, 153));
        toPhone.setText(" ");
        getContentPane().add(toPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 288, 142, 26));

        lfamount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfamount.setForeground(new java.awt.Color(0, 153, 153));
        lfamount.setText(" ");
        getContentPane().add(lfamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 320, 142, 26));

        lfConENT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lfConENT.setForeground(new java.awt.Color(0, 153, 153));
        lfConENT.setText(" ");
        getContentPane().add(lfConENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 187, 132, 26));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(228, 157, 0));
        jLabel28.setText("Booking Officer");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 117, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(219, 175, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 153, 0));
        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 156, 46));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 153, 0));
        jLabel29.setText("Delivery ID");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 82, 32));

        tfSarchF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tfSarchF.setForeground(new java.awt.Color(0, 102, 102));
        tfSarchF.setText(" ");
        getContentPane().add(tfSarchF, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, 124, 32));

        btnSarch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSarch.setText("SARCH");
        btnSarch.setToolTipText("");
        btnSarch.setActionCommand("");
        btnSarch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSarchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSarch, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, 33));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Quantity", "Description", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 840, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSarchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSarchActionPerformed
        String id = tfSarchF.getText();

        Connection conn = DatabaceConnector.dataConnect();
        String sql = "select * from informetion where ID = '" + id + "'";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery();
          if (rs.next()) {
                lfOrderId.setText(rs.getString(1));
                lfDocType.setText(rs.getString(7));
                lfFrName.setText(rs.getString(3));
                forAdrees.setText(rs.getString(4));
               // forAdrees.setText(rs.getString(5));
                FroPhone.setText(rs.getString(5));
                lfQty.setText(rs.getString(10));
                lfDaTE.setText(rs.getString(6));
                lfConENT.setText(rs.getString(8));
                toName.setText(rs.getString(12));
                toAdress.setText(rs.getString(13));
                toPhone.setText(rs.getString(14));
                lfamount.setText(rs.getString(11));
                //System.out.println(rs.getString(8));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        int amount = Integer.parseInt(lfamount.getText());
        int qty = Integer.parseInt(lfQty.getText());
        int total = amount*qty;
        String[] row = {String.valueOf(qty),lfConENT.getText(),String.valueOf(total)};
        
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.addRow(row);
        
    }//GEN-LAST:event_btnSarchActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id = lfOrderId.getText();
        String docType = lfDocType.getText();
        String fNamae = lfFrName.getText();
        String fPhone = FroPhone.getText();
        String qty = lfQty.getText();
        String date = lfDaTE.getText();
        String content = lfConENT.getText();
        String tName = toName.getText();
        String fAddress = forAdrees.getText();
        String tPhone = toPhone.getText();
        String tAddress = toAdress.getText();
        String amount = lfamount.getText();
        String path = "F:\\IDB\\JEE\\Advance JAVA\\PROJECT\\Live Courier Tracking And Delivery System";
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+" "+tName+" 1.pdf"));
            doc.open();
            Paragraph paragraph1 = new Paragraph("                                                 Express Courier Service ltd.                                            \n");
            doc.add(paragraph1);
            Paragraph paragraph2 = new Paragraph("                        Head Office: 2/2, Mirpur Road, Darussalam, Dhaka-1216, Bangladesh.                                \n");
            doc.add(paragraph2);
            Paragraph paragraph3 = new Paragraph("                                                                                              Booking Date:"+date+"\n\n");
            doc.add(paragraph3);
            Paragraph paragraph4 = new Paragraph("Order ID :"+id+"                                                                            "+"Content :"+content+"\n");
            doc.add(paragraph4);
//            Paragraph paragraph5 = new Paragraph("From :"+fNamae+"                                                                           "+"To :"+tName+"\n");
//            doc.add(paragraph5);
//            Paragraph paragraph6 = new Paragraph("Address :"+fAddress+"                                                                           "+"Address :"+tAddress+"\n");
//            doc.add(paragraph6);
//            Paragraph paragraph7 = new Paragraph("Phone No :"+fPhone+"                                                                     "+"Phone No :"+tPhone+"\n");
//            doc.add(paragraph7);
//            Paragraph paragraph8 = new Paragraph("Quantity :"+qty+"                                                                             "+"Amount :"+amount+"\n\n\n\n");
//            doc.add(paragraph8);



            Paragraph paragraph5 = new Paragraph("From\n============================\n");                                                                            
            doc.add(paragraph5);
            Paragraph paragraph6 = new Paragraph("Name : "+fNamae+"\n");   
            doc.add(paragraph6);
            Paragraph paragraph7 = new Paragraph("Address :"+fAddress+"\n");  
            doc.add(paragraph7);
            Paragraph paragraph8 = new Paragraph("Phone No :"+fPhone+"\n\n");   
            doc.add(paragraph8);
            
            Paragraph paragraph9 = new Paragraph("To\n============================\n");   
            doc.add(paragraph9);
            Paragraph paragraph10 = new Paragraph("Name :"+tName+"\n");   
            doc.add(paragraph10);
            Paragraph paragraph11 = new Paragraph("Address :"+tAddress+"\n");   
            doc.add(paragraph11);
            Paragraph paragraph12 = new Paragraph("Phone No :"+tPhone+"\n\n\n\n");   
            doc.add(paragraph12); 
            
            
            
            
            
            PdfPTable ptbl = new PdfPTable(3);
            ptbl.addCell("Quantity");
            ptbl.addCell("Description");
            ptbl.addCell("Amount");
            
            for (int i = 0; i < tbl.getRowCount(); i++) {
                String q = tbl.getValueAt(i, 0).toString();
                String d = tbl.getValueAt(i, 1).toString();
                String a = tbl.getValueAt(i, 2).toString();
                ptbl.addCell(q);
                ptbl.addCell(d);
                ptbl.addCell(a);
                
            }
            doc.add(ptbl);
            Paragraph paragraph13 = new Paragraph("\n\n\n\nBooking Officer :"+"                                                                        "+"Customer : ");
            doc.add(paragraph13);
            JOptionPane.showMessageDialog(null,"Saved Successfully");
            
       
            
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (DocumentException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        doc.close();
                
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(castomarCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(castomarCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(castomarCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(castomarCopy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new castomarCopy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FroPhone;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSarch;
    private javax.swing.JLabel forAdrees;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lfConENT;
    private javax.swing.JLabel lfDaTE;
    private javax.swing.JLabel lfDocType;
    private javax.swing.JLabel lfFrName;
    private javax.swing.JLabel lfOrderId;
    private javax.swing.JLabel lfQty;
    private javax.swing.JLabel lfamount;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField tfSarchF;
    private javax.swing.JLabel toAdress;
    private javax.swing.JLabel toName;
    private javax.swing.JLabel toPhone;
    // End of variables declaration//GEN-END:variables
}
