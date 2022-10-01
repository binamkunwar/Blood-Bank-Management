/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bbms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class UpdateDetails extends javax.swing.JFrame {

    /**
     * Creates new form UpdateDetails
     */
    public UpdateDetails() {
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

        Heading = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        idL = new javax.swing.JLabel();
        FullName = new javax.swing.JLabel();
        FatherName = new javax.swing.JLabel();
        MotherName = new javax.swing.JLabel();
        Age = new javax.swing.JLabel();
        MobileNumber = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Province = new javax.swing.JLabel();
        BloodGroup = new javax.swing.JLabel();
        CompleteAddress = new javax.swing.JLabel();
        FText = new javax.swing.JTextField();
        FaText = new javax.swing.JTextField();
        MoText = new javax.swing.JTextField();
        AgeText = new javax.swing.JTextField();
        MpText = new javax.swing.JTextField();
        EText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CoText = new javax.swing.JTextArea();
        MBtn = new javax.swing.JRadioButton();
        FBtn = new javax.swing.JRadioButton();
        OBtn = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        SaveBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BText = new javax.swing.JTextField();
        PText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(370, 200));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Heading.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        Heading.setText("Update Donar Details");
        getContentPane().add(Heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 6, 587, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 788, 10));

        idL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        idL.setText("Donar Id");
        getContentPane().add(idL, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, -1));

        FullName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FullName.setText("FullName");
        getContentPane().add(FullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 153, 82, -1));

        FatherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FatherName.setText("FatherName");
        getContentPane().add(FatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 203, -1, -1));

        MotherName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MotherName.setText("MotherName");
        getContentPane().add(MotherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 247, 98, -1));

        Age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Age.setText("Age");
        getContentPane().add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 304, 37, -1));

        MobileNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MobileNumber.setText("MobileNumber");
        getContentPane().add(MobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 357, 115, -1));

        Gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gender.setText("Gender");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 406, 75, -1));

        Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Email.setText("Email");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 136, -1, -1));

        Province.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Province.setText("Province");
        getContentPane().add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 221, 78, -1));

        BloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BloodGroup.setText("BloodGroup");
        getContentPane().add(BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 177, 93, -1));

        CompleteAddress.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CompleteAddress.setText("Complete Address");
        getContentPane().add(CompleteAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 275, 133, -1));

        FText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(FText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 150, 139, -1));

        FaText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(FaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 139, -1));

        MoText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(MoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 244, 139, -1));

        AgeText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(AgeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 301, 139, -1));

        MpText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(MpText, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 354, 139, -1));

        EText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(EText, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 130, 143, -1));

        CoText.setColumns(20);
        CoText.setRows(5);
        jScrollPane1.setViewportView(CoText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 301, -1, -1));

        MBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MBtn.setText("Male");
        getContentPane().add(MBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 416, 98, -1));

        FBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FBtn.setText("Female");
        getContentPane().add(FBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 416, 98, -1));

        OBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OBtn.setText("Others");
        getContentPane().add(OBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 416, 98, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 458, 788, -1));

        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SaveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.png"))); // NOI18N
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 506, -1, -1));

        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ResetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/reset.png"))); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 506, -1, -1));

        ExitBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 6, -1, -1));

        SearchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/search (1).png"))); // NOI18N
        SearchBtn.setText("SEARCH");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        idText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(idText, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 78, 71, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 76, 37, 114));

        BText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(BText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 140, -1));

        PText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PTextActionPerformed(evt);
            }
        });
        getContentPane().add(PText, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        // TODO add your handling code here:
        if(FText.getText().length()==0){
               JOptionPane.showMessageDialog(this, "Please enter the Full name");
           }
         else if(FaText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(MoText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(AgeText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(MpText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(Gender.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(EText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else if(CoText.getText().length()==0)
                  {
        JOptionPane.showMessageDialog(this, "Please enter the Blood group");
    }
         else{
        String id=idText.getText();
        String fullName=FText.getText();
        String fatherName=FaText.getText();
        String motherName=MoText.getText();
        String age=AgeText.getText();

        String number=MpText.getText();
        String Gender = null ;
        if(MBtn.isSelected()){
            Gender="male";
        }
        else if(FBtn.isSelected()){
            Gender="female";
        }
        else if(OBtn.isSelected()){
            Gender="other";
        }
        String email=EText.getText();
        String bloodgrp=(String)BText.getSelectedText();
        String province=(String)PText.getSelectedText();
        String coAddr=CoText.getText();
        
        try{

            Connection con=dbConnection.getCon();
             Statement stmt=con.createStatement();
            
stmt.executeUpdate("UPDATE  bloodbankmanagement.adddonar set FullName='"+fullName+"',FatherName='"+fatherName+"',MotherName='"+motherName+"',Age='"+age+"',Mobile='"+number+"',"
        + "Gender='"+Gender+"',Email='"+email+"',BloodGroup='"+bloodgrp+"',Province='"+province+"',Address='"+coAddr+"'where id='"+id+"'" );

JOptionPane.showMessageDialog(null, "Updated sucessfully");
setVisible(false);
                 new UpdateDetails().setVisible(true);
        }
        catch(Exception ex){
           System.out.println(ex);
                        JOptionPane.showMessageDialog(null, "Error Updating donar");
                }
         }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        idText.setText(null);
FaText.setText(null);
MoText.setText(null);
AgeText.setText(null);
MpText.setText(null);
Gender.setText(null);
EText.setText(null);
CoText.setText(null);
 FText.setText(null);
FaText.setText(null);
MoText.setText(null);
AgeText.setText(null);
MpText.setText(null);
Gender.setText(null);
EText.setText(null);
CoText.setText(null);
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        String id=idText.getText();
        
        try{
        Connection con=dbConnection.getCon();
        Statement stmt = con.createStatement();
        JOptionPane.showMessageDialog(null, "Connected");
        ResultSet rs=stmt.executeQuery("Select * from adddonar where id='"+id+"'");
        JOptionPane.showMessageDialog(null, "id found");
        
    if(rs.next()){
        idText.setEditable(false);
   idText.setVisible(true);
   FText.setText(rs.getString(2));
   FaText.setText(rs.getString(3));
   MoText.setText(rs.getString(4));
   AgeText.setText(rs.getString(5));
   MpText.setText(rs.getString(6));
   EText.setText(rs.getString(8));
   BText.setText(rs.getString(9));
   PText.setText(rs.getString(10)); 
   CoText.setText(rs.getString(11));
   
}
else{
            JOptionPane.showMessageDialog(null, "id does not exit");
            
}

}
    catch(Exception e){
        
    } 
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void PTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PTextActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JTextField AgeText;
    private javax.swing.JTextField BText;
    private javax.swing.JLabel BloodGroup;
    private javax.swing.JTextArea CoText;
    private javax.swing.JLabel CompleteAddress;
    private javax.swing.JTextField EText;
    private javax.swing.JLabel Email;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JRadioButton FBtn;
    private javax.swing.JTextField FText;
    private javax.swing.JTextField FaText;
    private javax.swing.JLabel FatherName;
    private javax.swing.JLabel FullName;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Heading;
    private javax.swing.JRadioButton MBtn;
    private javax.swing.JTextField MoText;
    private javax.swing.JLabel MobileNumber;
    private javax.swing.JLabel MotherName;
    private javax.swing.JTextField MpText;
    private javax.swing.JRadioButton OBtn;
    private javax.swing.JTextField PText;
    private javax.swing.JLabel Province;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JLabel idL;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
