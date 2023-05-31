
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.util.Vector;
import java.sql.ResultSetMetaData;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class group2 extends javax.swing.JFrame {

    private String category;

    /**
     * Creates new form group2
     */
    public group2() {
        initComponents();
        table_update();
    }
    
    Connection con1;
    PreparedStatement pst;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Category = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcat = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textcat = new javax.swing.JTextField();
        textstatus = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        Category.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Category.setForeground(new java.awt.Color(255, 255, 255));
        Category.setText("Category");

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Category))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(Category)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(29, 29, 29))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Category");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("GOUNI BOOKSHOP");

        txtcat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel3.setText("Category");

        jLabel4.setText("Status");

        textstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "DeActive" }));
        textstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textstatusActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout txtcatLayout = new javax.swing.GroupLayout(txtcat);
        txtcat.setLayout(txtcatLayout);
        txtcatLayout.setHorizontalGroup(
            txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtcatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(txtcatLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(txtcatLayout.createSequentialGroup()
                        .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcat, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        txtcatLayout.setVerticalGroup(
            txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtcatLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(txtcatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(delete)
                    .addComponent(edit))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Category", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel2)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtcat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void table_update()
    {
        try {
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                 con1 = DriverManager.getConnection("jdbc:mysql://localhost/group","root","dinmah28");
                 pst = con1.prepareStatement("select * from category");
                 java.sql.ResultSet rs = pst.executeQuery();
                 
                 java.sql.ResultSetMetaData rsd = rs.getMetaData();
                 c = rsd.getColumnCount();
                 
                 DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                 d.setRowCount(0);
                 
                 while(rs.next())
                 {
                     Vector v2 = new Vector();
                     
                     for(int i = 1; i<=c; i++)
                     {
                         v2.add(rs.getString("id"));
                         v2.add(rs.getString("category"));
                         v2.add(rs.getString("status"));
                          v2.add(rs.getString(i));
                     }
                     d.addRow(v2.toArray());

                 }
                 
                 
                 
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
            }
            // TODO add your handling code here:
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String name = textcat.getText();
        String status = textstatus.getSelectedItem().toString();
           
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // TODO add your handling code here:
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/group","root","dinmah28");
            pst = con1.prepareStatement("insert into category(category,status)values(?,?)");
         
            pst.setString(1, name);
            pst.setString(2,status);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Category Added");
            table_update();
            textcat.setText("");
            textstatus.setSelectedIndex(0);
            textcat.requestFocus();
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
          DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
     
       int id = Integer.parseInt(d1.getValueAt(selectIndex,0). toString());
       
       int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the Record","Warning",JOptionPane.YES_NO_OPTION);
       
       if(dialogResult ==JOptionPane.YES_OPTION)
       {
              try {
                  try {
                      Class.forName("com.mysql.cj.jdbc.Driver");
                  } catch (ClassNotFoundException ex) {
                      Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  con1 = DriverManager.getConnection("jdbc:mysql://localhost/group","root","dinmah28");
                  pst = con1.prepareStatement("delete from category where id=?");
                  
                  pst.setInt(1, id);
                  pst.executeUpdate();
                  JOptionPane.showMessageDialog(null,"Category ");
                  table_update();
                  textcat.setText("");
                  textstatus.setSelectedIndex(-1);
                  textcat.requestFocus();
              } catch (SQLException ex) {
                  Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
              }
       }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void textstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textstatusActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        
        textcat.setText(d1.getValueAt(selectIndex,1).toString());
        textstatus.setSelectedItem(d1.getValueAt(selectIndex,2).toString());
        
       int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        int selectIndexColumn = 0;

        int id = Integer.parseInt(d1.getValueAt(selectIndex,selectIndexColumn). toString());
        //        System.out.println(d1.getValueAt(selectIndex, selectIndexColumn));

        String name = textcat.getText();
        String status = textstatus.getSelectedItem().toString();

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/group","root","dinmah28");
            pst = con1.prepareStatement("update category set category=?where id = (?,?)");

            pst.setString(1, name);
            pst.setString(2,status);
            pst.setInt(3,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Category updated");
            table_update();
            textcat.setText("");
            textstatus.setSelectedIndex(-1);
            textcat.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(group2.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:

        // TODO add your handling code here:

    }//GEN-LAST:event_editActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(group2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new group2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textcat;
    private javax.swing.JComboBox<String> textstatus;
    private javax.swing.JPanel txtcat;
    // End of variables declaration//GEN-END:variables

    private static class ResultSetMetaData {

        public ResultSetMetaData() {
        }
    }
}
