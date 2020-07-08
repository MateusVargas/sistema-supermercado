package view;

public class ViewPrincipal extends javax.swing.JFrame {


    public ViewPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnprodutos = new javax.swing.JButton();
        btnfornecedores = new javax.swing.JButton();
        btnclientes = new javax.swing.JButton();
        btnestoque = new javax.swing.JButton();
        btncompras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnsair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        btnprodutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnprodutos.setForeground(new java.awt.Color(204, 0, 0));
        btnprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-produto-24.png"))); // NOI18N
        btnprodutos.setText("PRODUTOS");
        btnprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprodutosActionPerformed(evt);
            }
        });

        btnfornecedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnfornecedores.setForeground(new java.awt.Color(204, 0, 0));
        btnfornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Truck-icon.png"))); // NOI18N
        btnfornecedores.setText("FORNECEDORES");
        btnfornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfornecedoresActionPerformed(evt);
            }
        });

        btnclientes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclientes.setForeground(new java.awt.Color(204, 0, 0));
        btnclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-empresa-cliente-24.png"))); // NOI18N
        btnclientes.setText("CLIENTES");
        btnclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclientesActionPerformed(evt);
            }
        });

        btnestoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnestoque.setForeground(new java.awt.Color(204, 0, 0));
        btnestoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-armazenamento-na-núvem-24.png"))); // NOI18N
        btnestoque.setText("ESTOQUE");
        btnestoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestoqueActionPerformed(evt);
            }
        });

        btncompras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncompras.setForeground(new java.awt.Color(204, 0, 0));
        btncompras.setText("REGISTRO DE COMPRAS");
        btncompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomprasActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-produto-24.png"))); // NOI18N
        jButton1.setText("REGISTRAR VENDA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnprodutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnestoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnfornecedores)
                .addGap(39, 39, 39)
                .addComponent(btncompras, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnprodutos)
                .addGap(46, 46, 46)
                .addComponent(btnclientes)
                .addGap(47, 47, 47)
                .addComponent(btnestoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        btnsair.setBackground(new java.awt.Color(0, 102, 102));
        btnsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-shutdown-24.png"))); // NOI18N
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsair)
                .addGap(0, 52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnsair)
                .addGap(33, 33, 33))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/compraspelaweb.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprodutosActionPerformed
        ViewProdutos vp = new ViewProdutos();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnprodutosActionPerformed

    private void btnfornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfornecedoresActionPerformed
        ViewFornecedores f = new ViewFornecedores();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnfornecedoresActionPerformed

    private void btnclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclientesActionPerformed
        ViewClientes c = new ViewClientes();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnclientesActionPerformed

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        LoginView lv = new LoginView();
        lv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsairActionPerformed

    private void btnestoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestoqueActionPerformed
        ViewEstoque ve = new ViewEstoque();
        ve.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnestoqueActionPerformed

    private void btncomprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomprasActionPerformed
        ViewRegistrarCompra vc = new ViewRegistrarCompra();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncomprasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ViewRegistrarVendas vr = new ViewRegistrarVendas();
        vr.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclientes;
    private javax.swing.JButton btncompras;
    private javax.swing.JButton btnestoque;
    private javax.swing.JButton btnfornecedores;
    private javax.swing.JButton btnprodutos;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
