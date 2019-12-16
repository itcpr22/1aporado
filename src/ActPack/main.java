/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActPack;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lyka
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        refresh();
        // jLabel1.setText("welcome " + fname);
    }
    productClass prod = new productClass();
    conn con = new conn();

    Object id = null;

    

    
    
    void clear() {
        tfPname.setText(null);
        spinQTY.setValue(0);
        ftPrice.setText(null);
        tfPname.requestFocusInWindow();
    }
    
    final void search(String keyword) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection(con.url, con.username, con.password);

            String sql = "Select * from product where id like ? or pName  like ?";
            PreparedStatement pstmt = (PreparedStatement) conn.prepareStatement(sql);

            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");

            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel mod = (DefaultTableModel) ptable.getModel();
            mod.setRowCount(0);
            while (rs.next()) {
                mod.addRow(new Object[]{rs.getString("id"), rs.getString("pName"), rs.getString("quantity"), rs.getString("price")});

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        addProdFrame = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ftPrice = new javax.swing.JFormattedTextField();
        spinQTY = new javax.swing.JSpinner();
        tfPname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAddQTY = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        xst_qty1 = new javax.swing.JLabel();
        xst_qty2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ptable = new javax.swing.JTable();
        btnAddProd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        search_tf = new javax.swing.JTextField();
        btnQTY = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        addProdFrame.setMinimumSize(new java.awt.Dimension(329, 290));
        addProdFrame.setPreferredSize(new java.awt.Dimension(329, 290));

        jLabel3.setText("Quantity:");

        jLabel4.setText("Price:");

        ftPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        ftPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftPriceFocusLost(evt);
            }
        });

        spinQTY.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel2.setText("Product Name:");

        btnAddQTY.setText("Add Quantity");
        btnAddQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddQTYActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addProdFrameLayout = new javax.swing.GroupLayout(addProdFrame.getContentPane());
        addProdFrame.getContentPane().setLayout(addProdFrameLayout);
        addProdFrameLayout.setHorizontalGroup(
            addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProdFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addProdFrameLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel4))
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddQTY, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addGroup(addProdFrameLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProdFrameLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(xst_qty2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfPname)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addProdFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ftPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80))
            .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addProdFrameLayout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(xst_qty1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(115, 115, 115)))
        );
        addProdFrameLayout.setVerticalGroup(
            addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addProdFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(spinQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xst_qty2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnAddQTY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(addProdFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addProdFrameLayout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(xst_qty1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(135, 135, 135)))
        );

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BRANDED T-SHIRTS");

        search_btn.setBackground(new java.awt.Color(153, 255, 255));
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        ptable.setBackground(new java.awt.Color(255, 0, 255));
        ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "product", "qty", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ptable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ptable);

        btnAddProd.setForeground(new java.awt.Color(153, 0, 0));
        btnAddProd.setText("Add Product");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnDelete.setForeground(new java.awt.Color(204, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setForeground(new java.awt.Color(255, 0, 204));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        search_tf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_tfKeyReleased(evt);
            }
        });

        btnQTY.setForeground(new java.awt.Color(0, 0, 255));
        btnQTY.setText("Add Qty");
        btnQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQTYActionPerformed(evt);
            }
        });

        jButton1.setText("POS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(btnQTY, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_btn)
                    .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnQTY)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete)))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        String keyword = search_tf.getText();
        this.search(keyword);
    }//GEN-LAST:event_search_btnActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        // TODO add your handling code here
        addProdFrame.setVisible(true);
        addProdFrame.setLocationRelativeTo(rootPane);
        addProdFrame.setAlwaysOnTop(true);
        btnAdd.setVisible(true);
        btnSave.setVisible(false);
        btnAddQTY.setEnabled(true);

        //this.clearAddProductFields();

    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DELETE_RECORDS();
        refresh();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:

        int table_row = ptable.getSelectedRow();

        if(table_row != -1){
            id = ptable.getValueAt(table_row, 0);
            Object product_name = ptable.getValueAt(table_row, 1);
            Object pro_qty = ptable.getValueAt(table_row, 2);
            Object pro_price = ptable.getValueAt(table_row, 3);

            tfPname.setText((String) product_name);
            spinQTY.setValue(Integer.valueOf((String) pro_qty));
            ftPrice.setValue(Double.valueOf((String) pro_price));

            addProdFrame.setVisible(true);
            addProdFrame.setLocationRelativeTo(rootPane);
            addProdFrame.setAlwaysOnTop(true);
            btnSave.setVisible(true);
            btnQTY.setVisible(false);

            btnAddQTY.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please Select a product", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void search_tfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_tfKeyReleased
        // TODO add your handling code here:
        String keyword = search_tf.getText();
        this.search(keyword);
    }//GEN-LAST:event_search_tfKeyReleased

    private void btnQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQTYActionPerformed
       int row = ptable.getSelectedRow();
        if(row != -1){
            addProdFrame.setVisible(true);
            addProdFrame.setLocationRelativeTo(this);
            addProdFrame.setAlwaysOnTop(true);
            btnSave.setVisible(false);
            //ADDBTN1.setVisible(false);
            btnAddQTY.setVisible(true);

            id = ptable.getValueAt(row, 0);
            Object pn = ptable.getValueAt(row, 1);
            Object qty = ptable.getValueAt(row, 2);
            Object pr = ptable.getValueAt(row, 3);

            tfPname.setEnabled(false);
            ftPrice.setEnabled(false);
            spinQTY.setEnabled(true);

            tfPname.setText(pn.toString());
            xst_qty2.setText(qty.toString());
            ftPrice.setValue(Double.valueOf(pr.toString()));
            spinQTY.setValue(0);
        }else{
            JOptionPane.showMessageDialog(rootPane, "Please Select a product", "Warning", JOptionPane.WARNING_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnQTYActionPerformed

    private void ftPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftPriceFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ftPriceFocusLost

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
         String sPn = tfPname.getText();
        int iqty = (int) spinQTY.getValue();
        Object Opr = ftPrice.getText();

        int x = prod.product(sPn, iqty, Opr);

        if (x == 1) {
            refresh();
            JOptionPane.showMessageDialog(addProdFrame, "successfully added");

            clear();

        } else {

            JOptionPane.showMessageDialog(addProdFrame, "you to fill all fields");

        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String newpn = tfPname.getText();
        Object newpr = ftPrice.getValue();

        int r = prod.editProduct(id, newpn, newpr);
        if (r == 1) {
            refresh();
            JOptionPane.showMessageDialog(addProdFrame, "Product Edit Successfully");
            addProdFrame.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(addProdFrame, "Problem Editing Produc", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddQTYActionPerformed
      
        String pn = tfPname.getText();
        int a = new productClass().product_addQty(Integer.parseInt(id.toString()), spinQTY.getValue());
        refresh() ;
        addProdFrame.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddQTYActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new POS().setVisible(true);         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JFrame addProdFrame;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnAddQTY;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnQTY;
    private javax.swing.JButton btnSave;
    private javax.swing.JFormattedTextField ftPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ptable;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_tf;
    private javax.swing.JSpinner spinQTY;
    private javax.swing.JTextField tfPname;
    private javax.swing.JLabel xst_qty1;
    private javax.swing.JLabel xst_qty2;
    // End of variables declaration                   
 final void refresh() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String conURL = "jdbc:mysql://localhost/1aporado?"
                    + "user=root&password=";
            java.sql.Connection con = DriverManager.getConnection(conURL);

            java.sql.PreparedStatement pstmt = con.prepareStatement("SELECT * FROM product ORDER BY id DESC");
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tblmodel = (DefaultTableModel)
                    ptable.getModel();
            tblmodel.setRowCount(0);

            while (rs.next()) {
                tblmodel.addRow(new Object[]{rs.getString("id"),
                    rs.getString("pName"),
                    rs.getString("quantity"),
                    rs.getString("price")});
            }

            //TFrCode.requestFocus();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void DELETE_RECORDS() {
        int selRow = ptable.getSelectedRow();
        if (selRow != -1) {
            int column = 0;
            String id = ptable
                    .getValueAt(selRow, column).toString();
            int blabla = JOptionPane.showConfirmDialog(rootPane,
                    "Are you sure you want to delete this Records?",
                    "Delete Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if (blabla == JOptionPane.YES_OPTION) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String conURL = "jdbc:mysql://localhost/1aporado?"
                            + "user=root&password=";
                    java.sql.Connection con = DriverManager.getConnection(conURL);
                    PreparedStatement pstmt = con.prepareStatement("DELETE FROM product WHERE id = ? ");
                    pstmt.setString(1, id);
                    pstmt.executeUpdate();

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(productClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else { // meaning if the row is invalid ( -1 )
            JOptionPane.showMessageDialog(rootPane, "Please select a row to be deleted",
                    "No record selected",
                    JOptionPane.WARNING_MESSAGE);
        }       // TODO add your handling code here:
    }
    
}
