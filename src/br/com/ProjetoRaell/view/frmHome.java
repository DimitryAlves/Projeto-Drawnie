/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ProjetoRaell.view;

/**
 *
 * @author silva
 */
public class frmHome extends javax.swing.JFrame {

    /**
     * Creates new form frmHome
     */
    public frmHome() {
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

        btCompras = new javax.swing.JButton();
        btBdCompras = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        btBdClientes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1406, 735));
        setResizable(false);
        getContentPane().setLayout(null);

        btCompras.setBackground(new java.awt.Color(255, 137, 196));
        btCompras.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        btCompras.setForeground(new java.awt.Color(255, 255, 255));
        btCompras.setText("Compras");
        btCompras.setBorder(null);
        btCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btComprasMouseClicked(evt);
            }
        });
        getContentPane().add(btCompras);
        btCompras.setBounds(229, 278, 440, 130);

        btBdCompras.setBackground(new java.awt.Color(255, 137, 196));
        btBdCompras.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        btBdCompras.setForeground(new java.awt.Color(255, 255, 255));
        btBdCompras.setText("BD Compras");
        btBdCompras.setBorder(null);
        btBdCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBdComprasMouseClicked(evt);
            }
        });
        getContentPane().add(btBdCompras);
        btBdCompras.setBounds(229, 465, 440, 130);

        btClientes.setBackground(new java.awt.Color(255, 137, 196));
        btClientes.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        btClientes.setForeground(new java.awt.Color(255, 255, 255));
        btClientes.setText("Clientes");
        btClientes.setBorder(null);
        btClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btClientesMouseClicked(evt);
            }
        });
        getContentPane().add(btClientes);
        btClientes.setBounds(725, 278, 440, 130);

        btBdClientes.setBackground(new java.awt.Color(255, 137, 196));
        btBdClientes.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        btBdClientes.setForeground(new java.awt.Color(255, 255, 255));
        btBdClientes.setText("BD Clientes");
        btBdClientes.setBorder(null);
        btBdClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBdClientesMouseClicked(evt);
            }
        });
        getContentPane().add(btBdClientes);
        btBdClientes.setBounds(725, 465, 440, 130);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\silva\\OneDrive\\Documentos\\NetBeansProjects\\ProjetoRaell\\src\\br\\com\\ProjetoRaell\\imagens\\home.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-4, 0, 1480, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btComprasMouseClicked
        // TODO add your handling code here:
        frmCompra comp = new frmCompra();
        comp.setVisible(true);
    }//GEN-LAST:event_btComprasMouseClicked

    private void btBdComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBdComprasMouseClicked
        // TODO add your handling code here:
         frmBancoCompra comp = new frmBancoCompra();
         comp.setVisible(true);
    }//GEN-LAST:event_btBdComprasMouseClicked

    private void btClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btClientesMouseClicked
        // TODO add your handling code here:
         frmCliente cli = new frmCliente();
         cli.setVisible(true);
    }//GEN-LAST:event_btClientesMouseClicked

    private void btBdClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBdClientesMouseClicked
        // TODO add your handling code here:
        frmBancoCliente cli = new frmBancoCliente();
        cli.setVisible(true);
    }//GEN-LAST:event_btBdClientesMouseClicked

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
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBdClientes;
    private javax.swing.JButton btBdCompras;
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btCompras;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
