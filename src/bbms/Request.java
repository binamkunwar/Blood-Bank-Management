/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bbms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Request extends javax.swing.JFrame {

    /**
     * Creates new form Request
     */
    public Request() {
        initComponents();
        stock();
       // recommend();
    }
    
public void stock(){
   // recommend();
      DefaultTableModel dtm=(DefaultTableModel)Information.getModel();
        dtm.setRowCount(0);
        
       
        try{
            Connection con=dbConnection.getCon();
            Statement stmt = con.createStatement();
            
           ResultSet rt=stmt.executeQuery("select * from stocks where units<=10");
           
           while(rt.next()){
               String bloodgroup = rt.getString("bloodgrp");
               //System.out.println(bloodgroup);
               dtm.addRow(new Object[]{rt.getString(2),rt.getString(3)});
               recommend(bloodgroup);
           }
           
        }
        catch(Exception e){
        }
    }
    
    public void recommend(String bloodgroup1){
       // System.out.println(bloodgroup1);

        try{
            Connection con=dbConnection.getCon();
            Statement stmt=con.createStatement();
            String b = bloodgroup1;
            LocalDate today = LocalDate.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-dd-MM");
            String d = today.format(format).toString();            
            System.out.println(d);
            ResultSet rs=stmt.executeQuery("select * from donationdate where bloodgroup = '"+b+"'");
//            && date=date BETWEEN curdate() - INTERVAL 3 MONTHS AND curdate()
//ResultSet rs=stmt.executeQuery(" SELECT * FROM donationdate WHERE date>=DATEADD(MONTH,-3,GETDATE()");
//ResultSet rs=stmt.executeQuery(" SELECT * FROM   donationdate WHERE  DATEDIFF(DAY,date, GETDATE()-90 AND bloodgroup = '"+b+"'");
            
            notify.setText(notify.getText()+"\n"+b);
           while(rs.next()){
//              System.out.println(rs.getString(""));
               System.out.println(rs.getString("bloodgroup"));
//                 System.out.println(rs.getString("date"));
//               System.out.println(rs.getString("mobile"));
               String donernum = rs.getString("mobile");
//               String datenum = rs.getString("date");
//               int dateNow = Integer.parseInt(datenum);
//               System.out.println(dateNow);
//               System.out.println(dateNow - 3);
//               if(dateNow )
               notify.setText(notify.getText()+"\n"+donernum);
           }
//
//            ResultSet rs = stmt.executeQuery("select * from donationdate where date >= 'May-27-2019'"); 
//           while(rs.next()){
//               System.out.println("Name"+rs.getString("Name"));
//           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null ,"Error");
             System.out.println(e);
        }
    }
//                ResultSet rs=stmt.executeQuery("select * from stocks where units<10");
//            JOptionPane.showMessageDialog(null ,"Found");
    
public void display(){
    DefaultTableModel dtm=(DefaultTableModel)Information.getModel();
        dtm.setRowCount(0);
        try{
            Connection con=dbConnection.getCon();
            Statement stmt=con.createStatement();

ResultSet rt=stmt.executeQuery("select * from donationdate  ");
           while(rt.next()){
               dtm.addRow(new Object[]{rt.getString(2),rt.getString(3)});
           }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null ,"Error");
        }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Information = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        notify = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        information = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(370, 200));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 602));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Information.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "BloodGroup", "Units"
            }
        ));
        jScrollPane1.setViewportView(Information);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 340, 150));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 119, 841, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REQUEST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 470, -1));

        notify.setColumns(20);
        notify.setRows(5);
        getContentPane().add(notify, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 260, 330));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.png"))); // NOI18N
        jButton1.setText("CLOSE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 370, 460));

        information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg_1.jpg"))); // NOI18N
        information.setText("jLabel2");
        getContentPane().add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 1, 860, 4810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
//          new HomePagenew().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Information;
    private javax.swing.JLabel information;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea notify;
    // End of variables declaration//GEN-END:variables
}