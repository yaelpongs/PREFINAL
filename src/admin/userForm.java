/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import loginForm.loginForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author wendy
 */
public class userForm extends javax.swing.JFrame {

    /**
     * Creates new form userForm
     */
    public userForm() {
        initComponents();
        displayData();
              
    }
    
    
     Color navcolor = new Color(155,48,69);
        Color hovercolor = new Color(53,30,75);
    
      public void displayData(){
        
          try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT  u_id, u_fname, u_lname, u_email, u_status FROM tbl_user");
            userTable.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
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

        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        p_addd = new javax.swing.JButton();
        p_edit = new javax.swing.JButton();
        p_edit1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        jButton3.setBackground(new java.awt.Color(249, 118, 31));
        jButton3.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ADD USER");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-64.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 134, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 30, 75));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER FORM");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BACK");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 890, 90));

        jPanel3.setBackground(new java.awt.Color(155, 48, 69));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-male-user-64.png"))); // NOI18N

        acc_name.setBackground(new java.awt.Color(255, 255, 255));
        acc_name.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 24)); // NOI18N
        acc_name.setForeground(new java.awt.Color(255, 255, 255));
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("NAME");

        p_addd.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        p_addd.setText("ADD");
        p_addd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_adddActionPerformed(evt);
            }
        });

        p_edit.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        p_edit.setText("EDIT");
        p_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_editActionPerformed(evt);
            }
        });

        p_edit1.setFont(new java.awt.Font("Gill Sans MT Condensed", 0, 24)); // NOI18N
        p_edit1.setText("PRINT");
        p_edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_edit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acc_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_addd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p_edit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(acc_name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(p_addd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 610));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 710, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        adminDashboard ds = new adminDashboard();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked

    }//GEN-LAST:event_userTableMouseClicked

    private void p_adddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_adddActionPerformed
       creatUserForm cuf = new creatUserForm();
       cuf.setVisible(true);
       cuf.remove.setEnabled(false);
       cuf.select.setEnabled(true);
       this.dispose();
    }                                  

    private void p_editMouseClicked(java.awt.event.MouseEvent evt) {                                    
       int rowIndex = userTable.getSelectedRow();
       
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null,"Please Select an Item!");           
       }else{
           try{
               dbConnector dbc = new dbConnector();
               TableModel tbl = userTable.getModel();
               ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                   if(rs.next()){  
                       creatUserForm cuf = new creatUserForm();
               cuf.uid.setText(""+rs.getInt("u_id"));
               cuf.fn.setText(""+rs.getString("u_fname"));
               cuf.ln.setText(""+rs.getString("u_lname"));
               cuf.em.setText(""+rs.getString("u_email"));
               cuf.un.setText(""+rs.getString("u_username"));
               cuf.pw.setText(""+rs.getString("u_password"));
               cuf.ut.setSelectedItem(""+rs.getString("u_type"));
               cuf.us.setSelectedItem(""+rs.getString("u_status"));
               cuf.image.setIcon(cuf.ResizeImage(rs.getString("u_image"), null, cuf.image));
               cuf.oldpath = rs.getString("u_image");
               cuf.path = rs.getString("u_image");
               cuf.destination = rs.getString("u_image");
               cuf.add.setEnabled(false);
               cuf.update.setEnabled(true);
               cuf.setVisible(true);
               
               if(rs.getString("u_image").isEmpty()){
                   cuf.select.setEnabled(true);
                   cuf.remove.setEnabled(false);
                   }else{
                cuf.select.setEnabled(false);
                   cuf.remove.setEnabled(true);
               }
               this.dispose();
                   }
           }catch(SQLException ex){
               System.out.println(""+ex);
           }
       }
    }//GEN-LAST:event_p_adddActionPerformed

    private void p_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_editActionPerformed
       int rowIndex = userTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = userTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                    creatUserForm cuf = new creatUserForm();
                    cuf.uid.setText(""+rs.getInt("u_id"));
                    cuf.fn.setText(""+rs.getString("u_fname"));
                    cuf.ln.setText(""+rs.getString("u_lname"));
                    cuf.em.setText(""+rs.getString("u_email"));
                    cuf.un.setText(""+rs.getString("u_username"));
                    cuf.pw.setText(""+rs.getString("u_password"));
                    cuf.ut.setSelectedItem(""+rs.getString("u_type"));
                    cuf.us.setSelectedItem(""+rs.getString("u_status"));
                    cuf.image.setIcon(cuf.ResizeImage(rs.getString("u_image"), null, cuf.image));
                    cuf.oldpath = rs.getString("u_image");
                    cuf.path = rs.getString("u_image");
                    cuf.destination = rs.getString("u_image");
                    cuf.add.setEnabled(false);
                    cuf.update.setEnabled(true);
                    cuf.setVisible(true);

                    if(rs.getString("u_image").isEmpty()){
                        cuf.select.setEnabled(true);
                        cuf.remove.setEnabled(false);
                    }else{
                        cuf.select.setEnabled(false);
                        cuf.remove.setEnabled(true);
                    }
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_p_editActionPerformed

    private void p_edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_edit1ActionPerformed
         int rowIndex = userTable.getSelectedRow();

        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null,"Please Select an Item!");
        }else{
            try{
                dbConnector dbc = new dbConnector();
                TableModel tbl = userTable.getModel();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
                if(rs.next()){
                    IndividualPrinting ipt = new IndividualPrinting();
                    ipt.uid.setText(""+rs.getInt("u_id"));
                    ipt.fn.setText(""+rs.getString("u_fname"));
                    ipt.ln.setText(""+rs.getString("u_lname"));
                    ipt.em.setText(""+rs.getString("u_email"));
                    ipt.un.setText(""+rs.getString("u_username"));
                    ipt.at.setText(""+rs.getString("u_type"));
                    ipt.st.setText(""+rs.getString("u_status"));
                    ipt.image.setIcon(ipt.ResizeImage(rs.getString("u_image"), null, ipt.image));
                    
                    ipt.setVisible(true);
                    this.dispose();
                }
            }catch(SQLException ex){
                System.out.println(""+ex);
            }
        }
    }//GEN-LAST:event_p_edit1ActionPerformed

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
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acc_name;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton p_addd;
    private javax.swing.JButton p_edit;
    private javax.swing.JButton p_edit1;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables
}
