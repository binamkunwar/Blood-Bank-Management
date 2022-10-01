/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bbms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class DonationDate extends javax.swing.JFrame {

    /**
     * Creates new form DonationDate
     */
    public DonationDate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        nmae = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        BloodGrp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bloodtxt = new javax.swing.JTextField();
        mobiletxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(370, 200));
        setMaximumSize(new java.awt.Dimension(800, 602));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setText("DonationDate");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 20, 350, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 74, 848, 16));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 426, 848, -1));

        nmae.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nmae.setText("Name");
        getContentPane().add(nmae, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        nametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 143, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 47, -1));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 327, 143, 30));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Title");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 61, -1));

        title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 376, 143, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 37, -1));

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, 30));

        Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 102, 119, -1));

        BloodGrp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BloodGrp.setText("BloodGroup");
        getContentPane().add(BloodGrp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Mobile");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 72, 34));
        getContentPane().add(bloodtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 143, 30));

        mobiletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiletxtActionPerformed(evt);
            }
        });
        getContentPane().add(mobiletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 143, 32));

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.png"))); // NOI18N
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(idText.getText().length()==0){
            JOptionPane.showMessageDialog(this, "Please enter the Id");
        }
        else if(nametxt.getText().length()==0){
               JOptionPane.showMessageDialog(this, "Please enter the Full name");
           }
          else if(bloodtxt.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
          else if(mobiletxt.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         
         else if(title.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
          else{
        String n = nametxt.getText();
        String b = bloodtxt.getText();
        String m = mobiletxt.getText();
        LocalDate dfor = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        String d = dfor.format(format).toString();
        String t = title.getText();
        try{
     
            Connection con=dbConnection.getCon();
             Statement stmt=con.createStatement();
           
             stmt.executeUpdate("insert into bloodbankmanagement.donationdate(Name,BloodGroup,Mobile,Date,Title)values('"+n+"','"+b+"','"+m+"','"+d+"','"+t+"')");
             JOptionPane.showMessageDialog(null, "Data added sucessfully");
             new DonationDate().setVisible(true);
        }
        catch(Exception e){
            
        }
          }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
         String id=idText.getText();
        try{
            Connection con=dbConnection.getCon();
            Statement stmt = con.createStatement();
//            JOptionPane.showMessageDialog(null, "Connected");
            ResultSet rs=stmt.executeQuery("Select * from adddonar where id='"+id+"'");
           

            if(rs.next()){
                 JOptionPane.showMessageDialog(null, "id found");
                idText.setEditable(false);
                idText.setVisible(true);
                nametxt.setText(rs.getString(2));
                bloodtxt.setText(rs.getString(9));
                mobiletxt.setText(rs.getString(6));

            }
            else{
                JOptionPane.showMessageDialog(null, "id does not exit");
                new DonationDate().setVisible(true);

            }

        }
        catch(Exception e){

        }
    }//GEN-LAST:event_SearchActionPerformed

    private void mobiletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobiletxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new HomePagenew().setVisible(true);
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
            java.util.logging.Logger.getLogger(DonationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodGrp;
    private javax.swing.JButton Search;
    private javax.swing.JTextField bloodtxt;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField idText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField mobiletxt;
    private javax.swing.JTextField nametxt;
    private javax.swing.JLabel nmae;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}