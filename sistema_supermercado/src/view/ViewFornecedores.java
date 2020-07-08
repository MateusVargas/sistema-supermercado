package view;

import conexao.ConnectionFactory;
import controller.FornecedoresController;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.MaskFormatter;
import model.bean.Fornecedores;
import regex.validaCampos;
import tablemodel.FornecedoresTableModel;

public class ViewFornecedores extends javax.swing.JFrame {

    FornecedoresController fc = new FornecedoresController();
    MaskFormatter f1,f2;
    FornecedoresTableModel ft;

    public ViewFornecedores() {
        try{
            f1 = new MaskFormatter("##.###.###/####-##");
            f2 = new MaskFormatter("(##) #####-####");            
        }catch(Exception ex){
            ex.getMessage();
        }
        
        initComponents();
        btnAtualizarSelecionado.setEnabled(false);
        btnAtualizar.setEnabled(false);
        populaTabela();
    }

    public void varretudo(){
        txtRazaoSocial.setText("");
        txtcnpj.setText("");
        txtemailFornecedores.setText("");
        txtenderecoFornecedor.setText("");
        txtsite.setText("");
        txtTelefoneFornecedor.setText("");
    }

    public void populaTabela(){
        tabelaFornecedores.removeAll();
        ft = new FornecedoresTableModel(fc.read());
        tabelaFornecedores.setModel(ft);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxEstadoFornecedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsite = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        txtemailFornecedores = new javax.swing.JTextField();
        txtenderecoFornecedor = new javax.swing.JTextField();
        btnCadastrarFornecedor = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtTelefoneFornecedor = new javax.swing.JFormattedTextField(f2);
        btnAtualizar = new javax.swing.JButton();
        txtcnpj = new javax.swing.JFormattedTextField(f1);
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxCatFornecedor = new javax.swing.JComboBox<>();
        txtBuscaFornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFornecedores = new javax.swing.JTable();
        btnapagar = new javax.swing.JButton();
        btncancelar2 = new javax.swing.JButton();
        btnAtualizarSelecionado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fornecedores");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("RAZÃO SOCIAL:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("TELEFONE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("UF:");

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CNPJ:");

        jComboBoxEstadoFornecedor.setBackground(new java.awt.Color(0, 102, 102));
        jComboBoxEstadoFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxEstadoFornecedor.setForeground(new java.awt.Color(0, 102, 102));
        jComboBoxEstadoFornecedor.setMaximumRowCount(6);
        jComboBoxEstadoFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rôndonia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboBoxEstadoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEstadoFornecedorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("ENDEREÇO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("SITE:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("E-MAIL:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("CIDADE:");

        btnCadastrarFornecedor.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnCadastrarFornecedor.setText("CADASTRAR");
        btnCadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFornecedorActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/delete-file-icon.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(204, 0, 0));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jComboBoxCidade.setBackground(new java.awt.Color(204, 0, 0));
        jComboBoxCidade.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(txtemailFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtenderecoFornecedor)
                            .addComponent(txtRazaoSocial)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsite, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxEstadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnCadastrarFornecedor)
                        .addGap(156, 156, 156)
                        .addComponent(btnAtualizar)
                        .addGap(139, 139, 139)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemailFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtenderecoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxEstadoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarFornecedor)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCancelar))
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(955, 551));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Buscar:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Ordenar por:");

        jComboBoxCatFornecedor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCatFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Não Selecionado -", "Razão Social", "UF", "Cidade" }));
        jComboBoxCatFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCatFornecedorActionPerformed(evt);
            }
        });

        txtBuscaFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaFornecedorKeyTyped(evt);
            }
        });

        tabelaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFornecedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFornecedores);

        btnapagar.setBackground(new java.awt.Color(204, 0, 0));
        btnapagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnapagar.setForeground(new java.awt.Color(255, 255, 255));
        btnapagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        btnapagar.setText("EXCLUIR");
        btnapagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnapagarActionPerformed(evt);
            }
        });

        btncancelar2.setBackground(new java.awt.Color(204, 0, 0));
        btncancelar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar2.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/delete-file-icon.png"))); // NOI18N
        btncancelar2.setText("CANCELAR");
        btncancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelar2ActionPerformed(evt);
            }
        });

        btnAtualizarSelecionado.setBackground(new java.awt.Color(0, 102, 102));
        btnAtualizarSelecionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizarSelecionado.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarSelecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnAtualizarSelecionado.setText("ATUALIZAR");
        btnAtualizarSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSelecionadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnAtualizarSelecionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnapagar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addComponent(btncancelar2)
                .addGap(126, 126, 126))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(34, 34, 34)
                        .addComponent(txtBuscaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCatFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBuscaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxCatFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar2)
                    .addComponent(btnAtualizarSelecionado)
                    .addComponent(btnapagar))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (validaCamposFornecedores()) {
            if (tabelaFornecedores.getSelectedRow() >= 0) {

                Fornecedores f = ft.getFornecedores(tabelaFornecedores.getSelectedRow());
                fc.update(f.getId(), txtRazaoSocial.getText(), txtcnpj.getText(),
                         txtemailFornecedores.getText(), txtenderecoFornecedor.getText(), jComboBoxEstadoFornecedor.getSelectedItem().toString(),
                         jComboBoxCidade.getSelectedItem().toString(), txtsite.getText(), txtTelefoneFornecedor.getText());
                populaTabela();
                varretudo();
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnAtualizarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSelecionadoActionPerformed
          jTabbedPane1.setSelectedIndex(0);
          btnAtualizarSelecionado.setEnabled(false);
     //   jTabbedPane1.setSelectedComponent(jPanel1); outra alternativa
    }//GEN-LAST:event_btnAtualizarSelecionadoActionPerformed

    private void btnCadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFornecedorActionPerformed
        if (validaCamposFornecedores()) {
            if (!txtRazaoSocial.getText().isEmpty() && jComboBoxCidade.getItemCount() > 0) {
                if (fc.create(txtRazaoSocial.getText(), txtcnpj.getText(), txtemailFornecedores.getText(),
                         txtenderecoFornecedor.getText(), jComboBoxEstadoFornecedor.getSelectedItem().toString(),
                         jComboBoxCidade.getSelectedItem().toString(), txtsite.getText(), txtTelefoneFornecedor.getText()) == true) {
                    varretudo();
                    populaTabela();
                } else {
                    JOptionPane.showMessageDialog(this, "erro ao salvar no banco de dados", "", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "O Campo Razão Social é obrigatório", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarFornecedorActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tabelaFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFornecedoresMouseClicked
        if(tabelaFornecedores.getSelectedRow()>=0){
            btnAtualizarSelecionado.setEnabled(true);
            btnAtualizar.setEnabled(true);
            
            txtRazaoSocial.setText((String) tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),0));
            txtcnpj.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),1).toString());
            txtenderecoFornecedor.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),2).toString());
            txtTelefoneFornecedor.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),3).toString());
            txtsite.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),4).toString());
            txtemailFornecedores.setText(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),5).toString());
            jComboBoxEstadoFornecedor.setSelectedItem(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),6));
            jComboBoxCidade.setSelectedItem(tabelaFornecedores.getValueAt(tabelaFornecedores.getSelectedRow(),7).toString());
        }
    }//GEN-LAST:event_tabelaFornecedoresMouseClicked

    private void btnapagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnapagarActionPerformed
        if(tabelaFornecedores.getSelectedRow()>=0){
            
            Fornecedores f = ft.getFornecedores(tabelaFornecedores.getSelectedRow());
            fc.delete(f);
            populaTabela();
            varretudo();
            btnAtualizarSelecionado.setEnabled(false);
        }
    }//GEN-LAST:event_btnapagarActionPerformed

    private void jComboBoxEstadoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEstadoFornecedorActionPerformed
        jComboBoxCidade.removeAllItems();
      String c = (String) jComboBoxEstadoFornecedor.getSelectedItem();
  //   d.read(c);
   Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;

       // ArrayList<Cidade> listaProdutos = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("SELECT cidades.nome as name FROM cidades INNER JOIN estados ON (cidades.estado_id=estados.id) WHERE estados.nome = ?");
            stat.setString(1, c);
            rs = stat.executeQuery();
            
            while(rs.next()){
             Fornecedores f = new Fornecedores();
             f.setCidade(rs.getString("name"));
                
             
                jComboBoxCidade.addItem(f.getCidade());
               // listaProdutos.add(ci);
                
            }
        }catch(SQLException E){
            JOptionPane.showMessageDialog(null, "erro ao ler as cidades", "", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jComboBoxEstadoFornecedorActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxCatFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCatFornecedorActionPerformed
        if(jComboBoxCatFornecedor.getSelectedItem().equals("- Não Selecionado -")){
            populaTabela();
        }       
        else if(jComboBoxCatFornecedor.getSelectedItem().equals("Razão Social")){
            tabelaFornecedores.removeAll();
            ft = new FornecedoresTableModel(fc.ordenarRazaoSocial());
            tabelaFornecedores.setModel(ft);
        }
        else if(jComboBoxCatFornecedor.getSelectedItem().equals("UF")){
            tabelaFornecedores.removeAll();
            ft = new FornecedoresTableModel(fc.ordenarPorEstado());
            tabelaFornecedores.setModel(ft);
        }
        else if(jComboBoxCatFornecedor.getSelectedItem().equals("Cidade")){
            tabelaFornecedores.removeAll();
            ft = new FornecedoresTableModel(fc.ordenarPorCidade());
            tabelaFornecedores.setModel(ft);
        }
    }//GEN-LAST:event_jComboBoxCatFornecedorActionPerformed

    private void txtBuscaFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaFornecedorKeyTyped
        String chave = txtBuscaFornecedor.getText();
        if (evt.getKeyChar() != '\b') {
            chave = chave + evt.getKeyChar();
        }
        ft = new FornecedoresTableModel(fc.getForn(chave));
        tabelaFornecedores.setModel(ft);
    }//GEN-LAST:event_txtBuscaFornecedorKeyTyped

    private void btncancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelar2ActionPerformed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelar2ActionPerformed

    private boolean validaCamposFornecedores(){
        if(!validaCampos.validaDescricao(txtRazaoSocial.getText())){
            JOptionPane.showMessageDialog(this, "razão social inválida","",JOptionPane.ERROR_MESSAGE);
            txtRazaoSocial.setText("");
            return false;
        }
        
        if(!validaCampos.validaCnpj(txtcnpj.getText())){
            JOptionPane.showMessageDialog(this, "CNPJ inválido","",JOptionPane.ERROR_MESSAGE);
            txtcnpj.setText("");
            return false;
        }
        
        if(!validaCampos.validaFone(txtTelefoneFornecedor.getText())){
            JOptionPane.showMessageDialog(this, "telefone inválido","",JOptionPane.ERROR_MESSAGE);
            txtTelefoneFornecedor.setText("");
            return false;
        }
        
        if(!validaCampos.validaEndereco(txtenderecoFornecedor.getText())){
            JOptionPane.showMessageDialog(this, "endereço inválido","",JOptionPane.ERROR_MESSAGE);
            txtenderecoFornecedor.setText("");
            return false;
        }
        
        if(!validaCampos.validaEmail(txtemailFornecedores.getText())){
            JOptionPane.showMessageDialog(this, "e-mail inválido","",JOptionPane.ERROR_MESSAGE);
            txtemailFornecedores.setText("");
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
            java.util.logging.Logger.getLogger(ViewFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFornecedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFornecedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarSelecionado;
    private javax.swing.JButton btnCadastrarFornecedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnapagar;
    private javax.swing.JButton btncancelar2;
    private javax.swing.JComboBox<String> jComboBoxCatFornecedor;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JComboBox<String> jComboBoxEstadoFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaFornecedores;
    private javax.swing.JTextField txtBuscaFornecedor;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefoneFornecedor;
    private javax.swing.JFormattedTextField txtcnpj;
    private javax.swing.JTextField txtemailFornecedores;
    private javax.swing.JTextField txtenderecoFornecedor;
    private javax.swing.JTextField txtsite;
    // End of variables declaration//GEN-END:variables
}
