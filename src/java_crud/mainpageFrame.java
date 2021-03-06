/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_crud;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author 2ndyrGroupA
 */
public class mainpageFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainpageFrame
     */
    public mainpageFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        updatePanel = new javax.swing.JPanel();
        updateLabel = new javax.swing.JLabel();
        createPanel = new javax.swing.JPanel();
        createLabel = new javax.swing.JLabel();
        readPanel = new javax.swing.JPanel();
        readLabel = new javax.swing.JLabel();
        deletePanel1 = new javax.swing.JPanel();
        deleteLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(java.awt.Color.black);

        updatePanel.setBackground(java.awt.Color.cyan);

        updateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateLabel.setText("UPDATE");
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        createPanel.setBackground(new java.awt.Color(255, 105, 0));

        createLabel.setBackground(java.awt.Color.white);
        createLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createLabel.setText("CREATE");
        createLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                createLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                createLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        readPanel.setBackground(java.awt.Color.magenta);

        readLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        readLabel.setText("RETRIEVE");
        readLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                readLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                readLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                readLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout readPanelLayout = new javax.swing.GroupLayout(readPanel);
        readPanel.setLayout(readPanelLayout);
        readPanelLayout.setHorizontalGroup(
            readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, readPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(readLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        readPanelLayout.setVerticalGroup(
            readPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(readLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        deletePanel1.setBackground(java.awt.Color.orange);

        deleteLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteLabel1.setText("DELETE");
        deleteLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout deletePanel1Layout = new javax.swing.GroupLayout(deletePanel1);
        deletePanel1.setLayout(deletePanel1Layout);
        deletePanel1Layout.setHorizontalGroup(
            deletePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deletePanel1Layout.setVerticalGroup(
            deletePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deleteLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText(" ALDRIN JAVA SIMPLE CRUD");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(readPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(108, 108, 108))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 216, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseEntered
      setColor(createPanel);
    }//GEN-LAST:event_createLabelMouseEntered

    private void createLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseExited
       resetColor(createPanel);
    }//GEN-LAST:event_createLabelMouseExited

    private void updateLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseEntered
       setColor1(updatePanel);
    }//GEN-LAST:event_updateLabelMouseEntered

    private void updateLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseExited
       resetColor1(updatePanel);
    }//GEN-LAST:event_updateLabelMouseExited

    private void readLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readLabelMouseEntered
       setColor2(readPanel);
    }//GEN-LAST:event_readLabelMouseEntered

    private void readLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readLabelMouseExited
       resetColor2(readPanel);
    }//GEN-LAST:event_readLabelMouseExited

    private void createLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createLabelMouseClicked
     new addFrame().setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_createLabelMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
      new updateFrame().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_updateLabelMouseClicked

    private void readLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_readLabelMouseClicked
      new tableFrame().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_readLabelMouseClicked

    private void deleteLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabel1MouseClicked
       new deleteFrame().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_deleteLabel1MouseClicked

    private void deleteLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLabel1MouseEntered

    private void deleteLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabel1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteLabel1MouseExited

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
   
     public void setColor(JPanel p) {
        p.setBackground(new Color(0, 255, 0));

    }

    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(255, 105, 0));
    }
    
    public void setColor1(JPanel p) {
        p.setBackground(new Color(255, 255, 0));

    }

    public void resetColor1(JPanel p1) {
        p1.setBackground(new Color(0,255,255));
    }
    
    public void setColor2(JPanel p) {
        p.setBackground(new Color(128,0, 255));

    }

    public void resetColor2(JPanel p1) {
        p1.setBackground(new Color(139,0,139));
    }
    
    
    public void setColor3(JPanel p) {
        p.setBackground(new Color(128,139, 255));

    }

    public void resetColor3(JPanel p1) {
        p1.setBackground(new Color(255,255,0));
    }
    
    
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
            java.util.logging.Logger.getLogger(mainpageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel createLabel;
    private javax.swing.JPanel createPanel;
    private javax.swing.JLabel deleteLabel1;
    private javax.swing.JPanel deletePanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel readLabel;
    private javax.swing.JPanel readPanel;
    private javax.swing.JLabel updateLabel;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
}
