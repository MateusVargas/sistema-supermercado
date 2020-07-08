package view;

import controller.ClientesController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import model.bean.Clientes;
import regex.validaCampos;
import tablemodel.ClientesTableModel;

public class ViewClientes extends javax.swing.JFrame {

    private MaskFormatter data,cep,cpf,fone;
    ClientesController c = new ClientesController();
    ClientesTableModel ct;
    
    public ViewClientes() {
        try{
            data = new MaskFormatter("##/##/####");
            cep = new MaskFormatter("######-###");
            cpf = new MaskFormatter("###.###.###-##");
            fone = new MaskFormatter("(##) #####-####");
            
        }catch(Exception e){
            e.getMessage();
        }
        initComponents();
        
        populaTabela();
        btnAtualizarSelecionado.setEnabled(false);
        btnAtualizarCliente.setEnabled(false);
        
   
    }
    
    
    public void apagaTudo(){
        txtNomeCliente.setText("");
        jRadioButtonFem.setSelected(false);
        jRadioButtonMasc.setSelected(false);
        jFormattedTextDataNasc.setText("");
        txtCelularCliente.setText("");
        txtcpf.setText("");
        txtCepCliente.setText("");
        txtEnderecoCliente.setText("");
        txtEmailCliente.setText("");
        txtCidadeCliente.setText("");
    }

    public void populaTabela(){
        tabelaClientes.removeAll();
        ct = new ClientesTableModel(c.read());
        tabelaClientes.setModel(ct);        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEmailCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JFormattedTextField(cpf);
        txtCelularCliente = new javax.swing.JFormattedTextField(fone);
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtEnderecoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCepCliente = new javax.swing.JFormattedTextField(cep);
        jLabel3 = new javax.swing.JLabel();
        jFormattedTextDataNasc = new javax.swing.JFormattedTextField(data);
        jLabel4 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAtualizarCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRadioButtonFem = new javax.swing.JRadioButton();
        jRadioButtonMasc = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnAtualizarSelecionado = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("E-MAIL:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("ENDEREÇO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("CEP:");

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnCadastrarCliente.setText("CADASTRAR");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("NOME:");

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CPF:");

        try {
            txtCepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("TELEFONE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("DATA DE NASCIMENTO:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("CIDADE/UF:");

        btnAtualizarCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizarCliente.setForeground(new java.awt.Color(204, 0, 0));
        btnAtualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnAtualizarCliente.setText("ATUALIZAR");
        btnAtualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarClienteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("SEXO:");

        jRadioButtonFem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonFem);
        jRadioButtonFem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonFem.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButtonFem.setText("Feminino");

        jRadioButtonMasc.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButtonMasc);
        jRadioButtonMasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButtonMasc.setForeground(new java.awt.Color(204, 0, 0));
        jRadioButtonMasc.setText("Masculino");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonMasc)
                        .addGap(114, 114, 114)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28)
                        .addComponent(jFormattedTextDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnCadastrarCliente)
                        .addGap(148, 148, 148)
                        .addComponent(btnAtualizarCliente)
                        .addGap(137, 137, 137)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(93, 93, 93)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jRadioButtonFem)
                                        .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButtonFem)
                    .addComponent(jRadioButtonMasc)
                    .addComponent(jLabel4)
                    .addComponent(jFormattedTextDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente)
                    .addComponent(btnAtualizarCliente)
                    .addComponent(btnCancelar))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaClientes.setGridColor(new java.awt.Color(153, 153, 153));
        tabelaClientes.setRowHeight(18);
        tabelaClientes.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

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

        btnApagar.setBackground(new java.awt.Color(204, 0, 0));
        btnApagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnApagar.setForeground(new java.awt.Color(255, 255, 255));
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        btnApagar.setText("EXCLUIR");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnAtualizarSelecionado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(btncancelar)
                .addGap(109, 109, 109))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnApagar)
                    .addComponent(btnAtualizarSelecionado))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Visualizar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarClienteActionPerformed
        if (validaCamposClientes()) {
            if (!txtNomeCliente.getText().isEmpty()) {

                Clientes cli = ct.getClientes(tabelaClientes.getSelectedRow());

                String sexo = null;
                if (jRadioButtonFem.isSelected()) {
                    sexo = "Feminino";
                } else if (jRadioButtonMasc.isSelected()) {
                    sexo = "Masculino";
                }
                c.update(cli.getId(), txtNomeCliente.getText(), sexo, jFormattedTextDataNasc.getText(), txtcpf.getText(),
                        txtCelularCliente.getText(), txtCepCliente.getText(), txtCidadeCliente.getText(),
                        txtEnderecoCliente.getText(), txtEmailCliente.getText());

                populaTabela();
                apagaTudo();
            }
        }
    }//GEN-LAST:event_btnAtualizarClienteActionPerformed

    private void btnAtualizarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSelecionadoActionPerformed
        btnAtualizarCliente.setEnabled(true);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_btnAtualizarSelecionadoActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        if (validaCamposClientes()) {
            if (!txtNomeCliente.getText().isEmpty()) {
                String sexo = null;
                if (jRadioButtonFem.isSelected()) {
                    sexo = "Feminino";
                } else if (jRadioButtonMasc.isSelected()) {
                    sexo = "Masculino";
                }

                if (c.create(txtNomeCliente.getText(), sexo, jFormattedTextDataNasc.getText(), txtcpf.getText(),
                        txtCelularCliente.getText(), txtCepCliente.getText(), txtCidadeCliente.getText(),
                        txtEnderecoCliente.getText(), txtEmailCliente.getText())) {
                    populaTabela();
                    apagaTudo();
                }
            }
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        if(tabelaClientes.getSelectedRow()>=0){
        btnAtualizarSelecionado.setEnabled(true);
        
        txtNomeCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0).toString());
        txtcpf.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 2).toString());
        
        if(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1).equals("Feminino")){
            jRadioButtonFem.setSelected(true);
        }else if(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1).equals("Masculino")){
            jRadioButtonMasc.setSelected(true);
        }else{
            jRadioButtonFem.setSelected(false);
            jRadioButtonMasc.setSelected(false);
        }
        
        txtEnderecoCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 3).toString());
        txtCelularCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 4).toString());
        txtCepCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 5).toString());
        jFormattedTextDataNasc.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 6).toString());
        txtCidadeCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 7).toString());
        txtEmailCliente.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 8).toString());
        }
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        if(tabelaClientes.getSelectedRow()>=0){
            Clientes cli = ct.getClientes(tabelaClientes.getSelectedRow());
            c.delete(cli.getId());
            populaTabela();
            apagaTudo();
            btnAtualizarSelecionado.setEnabled(false);
        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       // apagaTudo();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    
    private boolean validaCamposClientes(){
        if(!validaCampos.validaNome(txtNomeCliente.getText())){
            JOptionPane.showMessageDialog(this, "nome inválido","",JOptionPane.ERROR_MESSAGE);
            txtNomeCliente.setText("");
            return false;
        }
        
        if(!validaCampos.validaData(jFormattedTextDataNasc.getText())){
            JOptionPane.showMessageDialog(this, "data inválida","",JOptionPane.ERROR_MESSAGE);
            jFormattedTextDataNasc.setText("");
            return false;
        }
        
        if(!validaCampos.validaCpf(txtcpf.getText())){
            JOptionPane.showMessageDialog(this, "cpf inválido","",JOptionPane.ERROR_MESSAGE);
            txtcpf.setText("");
            return false;
        }
        
        if(!validaCampos.validaFone(txtCelularCliente.getText())){
            JOptionPane.showMessageDialog(this, "telefone inválido","",JOptionPane.ERROR_MESSAGE);
            txtCelularCliente.setText("");
            return false;
        }
        
        if(!validaCampos.validaCep(txtCepCliente.getText())){
            JOptionPane.showMessageDialog(this, "cep inválido","",JOptionPane.ERROR_MESSAGE);
            txtCepCliente.setText("");
            return false;
        }
        
        if(!validaCampos.validaCidade(txtCidadeCliente.getText())){
            JOptionPane.showMessageDialog(this, "cidade inválida","",JOptionPane.ERROR_MESSAGE);
            txtCidadeCliente.setText("");
            return false;
        }
        
        if(!validaCampos.validaEndereco(txtEnderecoCliente.getText())){
            JOptionPane.showMessageDialog(this, "endereço inválido","",JOptionPane.ERROR_MESSAGE);
            txtEnderecoCliente.setText("");
            return false;
        }
        
        if(!validaCampos.validaEmail(txtEmailCliente.getText())){
            JOptionPane.showMessageDialog(this, "e-mail inválido","",JOptionPane.ERROR_MESSAGE);
            txtEmailCliente.setText("");
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
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizarCliente;
    private javax.swing.JButton btnAtualizarSelecionado;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btncancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField jFormattedTextDataNasc;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonFem;
    private javax.swing.JRadioButton jRadioButtonMasc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JFormattedTextField txtCelularCliente;
    private javax.swing.JFormattedTextField txtCepCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JFormattedTextField txtcpf;
    // End of variables declaration//GEN-END:variables
}
