package view;

import controller.EstoqueController;
import controller.ProdutosController;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Estoque;
import model.bean.Produtos;
import regex.validaCampos;
import tablemodel.EstoqueTableModel;


public class ViewEstoque extends javax.swing.JFrame {

    EstoqueController ec = new EstoqueController();
    EstoqueTableModel etc;
    
    public ViewEstoque() {
        initComponents();
        
        btnatualizar.setEnabled(false);
        btnatualizarselecionado.setEnabled(false);
        btnexcluir.setEnabled(false);
        
        listaProdutosCombobox();
        populaTabela();
    }
    
    public void listaProdutosCombobox(){
        ProdutosController p = new ProdutosController();
        for (Produtos prod : p.read()) {
            ComboBoxEstoque.addItem(prod);
            }
    }
    
    public void populaTabela(){
        tabelaEstoque.removeAll();
        etc = new EstoqueTableModel(ec.read());
        tabelaEstoque.setModel(etc); 
    }
    
    public void limpar(){
        txtquant.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ComboBoxEstoque = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtquant = new javax.swing.JTextField();
        btncadastrar = new javax.swing.JButton();
        btnatualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEstoque = new javax.swing.JTable();
        btnexcluir = new javax.swing.JButton();
        btnatualizarselecionado = new javax.swing.JButton();
        btnexport = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxOrdenarEstoque = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("PRODUTO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("QUANTIDADE:");

        btncadastrar.setBackground(new java.awt.Color(0, 102, 102));
        btncadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btncadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btncadastrar.setText("CADASTRAR");
        btncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncadastrarActionPerformed(evt);
            }
        });

        btnatualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnatualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnatualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnatualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnatualizar.setText("ATUALIZAR");
        btnatualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(204, 0, 0));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/delete-file-icon.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btncadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnatualizar)
                .addGap(131, 131, 131)
                .addComponent(btncancelar)
                .addGap(117, 117, 117))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnatualizar)
                    .addComponent(btncancelar)
                    .addComponent(btncadastrar))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar no Estoque", jPanel1);

        tabelaEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEstoque);

        btnexcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnexcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnexcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        btnexcluir.setText("EXCLUIR");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnatualizarselecionado.setBackground(new java.awt.Color(0, 102, 102));
        btnatualizarselecionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnatualizarselecionado.setForeground(new java.awt.Color(255, 255, 255));
        btnatualizarselecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnatualizarselecionado.setText("ATUALIZAR");
        btnatualizarselecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatualizarselecionadoActionPerformed(evt);
            }
        });

        btnexport.setBackground(new java.awt.Color(0, 102, 102));
        btnexport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnexport.setForeground(new java.awt.Color(255, 255, 255));
        btnexport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Microsoft-Excel-2013-icon.png"))); // NOI18N
        btnexport.setText("ESPORTAR PRO EXCEL");
        btnexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("PROCURAR:");

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtbuscarKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("ORDENAR POR:");

        jComboBoxOrdenarEstoque.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxOrdenarEstoque.setForeground(new java.awt.Color(204, 0, 0));
        jComboBoxOrdenarEstoque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Produto", "Quantidade" }));
        jComboBoxOrdenarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenarEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnatualizarselecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(btnexport)
                .addGap(76, 76, 76))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxOrdenarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxOrdenarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexport)
                    .addComponent(btnexcluir)
                    .addComponent(btnatualizarselecionado))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Visualizar Estoque", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        ViewPrincipal vp = new ViewPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ViewPrincipal vp = new ViewPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void btncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncadastrarActionPerformed
        if (validaCampos()) {
             if (!txtquant.getText().isEmpty()) {
                Produtos prod = (Produtos) ComboBoxEstoque.getSelectedItem();
                try {
                    if (ec.create(prod, Integer.parseInt(txtquant.getText()))) {
                        populaTabela();
                        limpar();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ViewEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "digite a quantidade", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btncadastrarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
        if(tabelaEstoque.getSelectedRow() >= 0){
            
            Estoque est = etc.getEstoque(tabelaEstoque.getSelectedRow());
            
            try {
                ec.delete(est.getProduto().getId());
                JOptionPane.showMessageDialog(null, "apagado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                populaTabela();
                btnatualizarselecionado.setEnabled(false);
                
            } catch (SQLException ex) {
                Logger.getLogger(ViewEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnatualizarselecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarselecionadoActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        btnatualizar.setEnabled(true);
        ComboBoxEstoque.setEnabled(false);
    }//GEN-LAST:event_btnatualizarselecionadoActionPerformed

    private void tabelaEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEstoqueMouseClicked
        if(tabelaEstoque.getSelectedRow()>=0){
            btnatualizarselecionado.setEnabled(true);
            btnexcluir.setEnabled(true);
            
            txtquant.setText(tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(), 1).toString());
            
            String item = (String) tabelaEstoque.getValueAt(tabelaEstoque.getSelectedRow(),0);
            for(int i=0; i<ComboBoxEstoque.getItemCount();i++){
                Produtos est = (Produtos) ComboBoxEstoque.getItemAt(i);
                if(est.getDescricao().equals(item)){
                    ComboBoxEstoque.setSelectedIndex(i);
                }
            }
            
        }
    }//GEN-LAST:event_tabelaEstoqueMouseClicked

    private void btnatualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatualizarActionPerformed
        if (validaCampos()) {
            if (!txtquant.getText().isEmpty()) {
                Produtos prod = (Produtos) ComboBoxEstoque.getSelectedItem();

                try {
                    if (ec.update(prod, Integer.parseInt(txtquant.getText()))) {
                        populaTabela();
                        limpar();
                        ComboBoxEstoque.setEnabled(true);
                        btnatualizar.setEnabled(false);
                        btnatualizarselecionado.setEnabled(false);
                        btnexcluir.setEnabled(false);
                        jTabbedPane1.setSelectedIndex(1);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ViewEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "preencha a quantidade", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnatualizarActionPerformed

    private void txtbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyTyped
        String chave = txtbuscar.getText();
        if(evt.getKeyChar() != '\b'){
            chave = chave + evt.getKeyChar();
        }
        etc = new EstoqueTableModel(ec.getProdutos(chave));
        tabelaEstoque.setModel(etc);
    }//GEN-LAST:event_txtbuscarKeyTyped

    private void jComboBoxOrdenarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenarEstoqueActionPerformed
        if(jComboBoxOrdenarEstoque.getSelectedItem().equals("Nenhum")){
            populaTabela();
        }       
        else if(jComboBoxOrdenarEstoque.getSelectedItem().equals("Produto")){
            tabelaEstoque.removeAll();
            etc = new EstoqueTableModel(ec.ordenarProdutos());
            tabelaEstoque.setModel(etc);
        }
        else if(jComboBoxOrdenarEstoque.getSelectedItem().equals("Quantidade")){
            tabelaEstoque.removeAll();
           etc = new EstoqueTableModel(ec.ordenarPorQtd());
            tabelaEstoque.setModel(etc);
        }
    }//GEN-LAST:event_jComboBoxOrdenarEstoqueActionPerformed

    private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportActionPerformed
        /* try {
            FileWriter out = new FileWriter("Estoque.xls", false);
            BufferedWriter bw = new BufferedWriter(out);
            for (int i = 0; i < etc.getColumnCount(); i++) {
                bw.write(etc.getColumnName(i) + "\t");
            }
            bw.write("\n");
            for (int i = 0; i < etc.getColumnCount(); i++) {
                for (int j = 0; j < etc.getColumnCount(); j++) {
                    bw.write(etc.getValueAt(i, j) + "\t");

                }
                bw.write("\n");
            }
            bw.close();
            JOptionPane.showMessageDialog(this, "tabela exportada com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(ViewEstoque.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "não foi possível exportar");
        }*/
        try {
            FileWriter out = new FileWriter("Estoque.xls", false);
            BufferedWriter bw = new BufferedWriter(out);
            for (int i = 0; i < etc.getColumnCount(); i++) {
                bw.write(etc.getColumnName(i) + "\t");
            }
            bw.write("\n");

                for (int j = 0; j < etc.getRowCount(); j++) {
                    Estoque eq = etc.getEstoque(j);
                    
                    bw.write(eq.getProduto().getDescricao() + "\t");
                    bw.write(eq.getQtd() + "\t");
                    bw.write(eq.getProduto().getPrecoVenda() + "\t");
                    
                    bw.write("\n");
            }
            bw.close();
            
            JOptionPane.showMessageDialog(this, "tabela exportada com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(ViewProdutos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "não foi possível exportar");
        }
    }//GEN-LAST:event_btnexportActionPerformed

    public boolean validaCampos(){
        if(!validaCampos.validaQuantidade(txtquant.getText())){
            JOptionPane.showMessageDialog(null, "quantidade inválida", "", JOptionPane.ERROR_MESSAGE);
            txtquant.setText("");
            return false;
        }
        return true;
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
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Object> ComboBoxEstoque;
    private javax.swing.JButton btnatualizar;
    private javax.swing.JButton btnatualizarselecionado;
    private javax.swing.JButton btncadastrar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnexport;
    private javax.swing.JComboBox<String> jComboBoxOrdenarEstoque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaEstoque;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtquant;
    // End of variables declaration//GEN-END:variables
}
