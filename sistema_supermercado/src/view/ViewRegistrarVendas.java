package view;

import conexao.ConnectionFactory;
import controller.ClientesController;
import controller.EstoqueController;
import controller.ItensVendaController;
import controller.VendaController;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Clientes;
import model.bean.Estoque;
import model.bean.ItensVenda;
import model.bean.Venda;
import model.dao.EstoqueDAO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;
import regex.validaCampos;

import tablemodel.ItensVendaTableModel;



public class ViewRegistrarVendas extends javax.swing.JFrame {

    EstoqueController ec = new EstoqueController();
    EstoqueDAO ed = new EstoqueDAO();
    VendaController vc = new VendaController();
    ItensVendaController ivc = new ItensVendaController();
    int idvenda = 0;
    ItensVendaTableModel it;
    
    public ViewRegistrarVendas(){
        initComponents();
        
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("dd/MM/yyyy");
        txtdata.setText(formatarDate.format(data));
        
        populaCombobox();
        populaCombobox2();
        populaTabela();

        btnfinalizarvenda.setEnabled(false);
        btnadicionar.setEnabled(false);
        btnremover.setEnabled(false);
        btncancelar.setEnabled(false);
    }

    public void populaCombobox(){
        ClientesController c = new ClientesController();
        for(Clientes cli : c.read()){
            jComboBoxCliente.addItem(cli);
        }
    }
    
    public void populaCombobox2(){
        EstoqueController ec = new EstoqueController();
        for(Estoque e : ec.read()){
            jComboBoxProduto.addItem(e);
        }
    }
    
    public void populaTabela(){
        tabelaVenda.removeAll();
        it = new ItensVendaTableModel(ivc.read(this.idvenda));
        tabelaVenda.setModel(it);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtdata = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnaddprodutos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnotafiscal = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        txtvalorunitario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnadicionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnremover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        btncancelar = new javax.swing.JButton();
        btnfinalizarvenda = new javax.swing.JButton();
        jComboBoxProduto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Vendas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        try {
            txtdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("DATA:");

        btnaddprodutos.setBackground(new java.awt.Color(0, 102, 102));
        btnaddprodutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnaddprodutos.setForeground(new java.awt.Color(255, 255, 255));
        btnaddprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnaddprodutos.setText("ADICIONAR PRODUTOS");
        btnaddprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddprodutosActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("REGISTRAR UMA VENDA");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("NOTA FISCAL:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/shop-cart-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel7)
                .addGap(130, 130, 130)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnaddprodutos)
                        .addGap(164, 164, 164)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnotafiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnotafiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnaddprodutos))
                .addGap(108, 108, 108))
        );

        jTabbedPane1.addTab("Registrar Venda", jPanel1);

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Informado" }));

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
                .addGap(96, 96, 96)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtvalorunitario.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("PRODUTO:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("CLIENTE:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("QUANTIDADE:");

        txttotal.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("VALOR UNITÁRIO:");

        btnadicionar.setBackground(new java.awt.Color(0, 102, 102));
        btnadicionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnadicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnadicionar.setText("ADICIONAR");
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("TOTAL A PAGAR:");

        btnremover.setBackground(new java.awt.Color(204, 0, 0));
        btnremover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnremover.setForeground(new java.awt.Color(255, 255, 255));
        btnremover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/delete-file-icon.png"))); // NOI18N
        btnremover.setText("REMOVER");
        btnremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoverActionPerformed(evt);
            }
        });

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVenda);

        btncancelar.setBackground(new java.awt.Color(204, 0, 0));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnfinalizarvenda.setBackground(new java.awt.Color(0, 102, 102));
        btnfinalizarvenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnfinalizarvenda.setForeground(new java.awt.Color(255, 255, 255));
        btnfinalizarvenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnfinalizarvenda.setText("FINALIZAR VENDA");
        btnfinalizarvenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinalizarvendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnadicionar)
                                .addGap(154, 154, 154)
                                .addComponent(btnremover)
                                .addGap(141, 141, 141)
                                .addComponent(btncancelar))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(362, 362, 362)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBoxProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxCliente, 0, 758, Short.MAX_VALUE)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnfinalizarvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(jLabel5)
                .addGap(30, 30, 30)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtvalorunitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremover, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnfinalizarvenda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Itens", jPanel2);

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

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        if (validaCampos()) {
            if (Integer.parseInt(txtqtd.getText()) <= 0 && this.idvenda == 0 && jComboBoxProduto.getItemCount() <= 0) {
                JOptionPane.showMessageDialog(this, "não foi possível registrar a venda", "Atenção!", JOptionPane.WARNING_MESSAGE);
            } else {

                Estoque est = (Estoque) jComboBoxProduto.getSelectedItem();

                if (Integer.parseInt(txtqtd.getText()) > est.getQtd()) {
                    JOptionPane.showMessageDialog(this, "quantidade maior que a disponível em estoque", "Atenção!", JOptionPane.ERROR_MESSAGE);
                } else {
                    double qtd = est.getQtd() - Integer.parseInt(txtqtd.getText());
                    ec.updateQtd(qtd, est);

                    double z = Double.parseDouble(txtqtd.getText());
                    double y = est.getProduto().getPrecoVenda();
                    double t = z * y;

                    double valorTotal = 0;
                    if (!txttotal.getText().equals("")) {
                        valorTotal = Double.parseDouble(txttotal.getText());
                    }
                    valorTotal += z * y;

                    txttotal.setText(String.valueOf(valorTotal));

                    try {
                        ivc.insert(est.getProduto().getId(), this.idvenda,
                                Integer.parseInt(txtqtd.getText()), est.getProduto().getPrecoVenda());
                        populaTabela();
                        txtvalorunitario.setText(String.valueOf(est.getProduto().getPrecoVenda()));
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewRegistrarVendas.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    txtqtd.setText("");
                }

            }
        }
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void btnremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoverActionPerformed
        if(tabelaVenda.getSelectedRow()>=0){
            
            ItensVenda iv = it.getItensVenda(tabelaVenda.getSelectedRow());
            Estoque est = (Estoque) jComboBoxProduto.getSelectedItem();
            
            double valorExcluido = iv.getProduto().getPrecoVenda() * iv.getQtd();
            
            int qtdRemovida = iv.getQtd();
            int qtdAtual = ed.read(iv.getProduto().getId());
            int qtdAtualizada = qtdRemovida + qtdAtual;
            
            ec.updateQtd(qtdAtualizada, est);
            
            double diminui=Double.parseDouble(txttotal.getText());
            diminui=diminui-valorExcluido;
            txttotal.setText(String.valueOf(diminui));
            txtvalorunitario.setText(String.valueOf(diminui));
           
            ivc.delete(iv.getProduto().getId(), idvenda);
            populaTabela();
            btnremover.setEnabled(false);
        }
    }//GEN-LAST:event_btnremoverActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        ViewPrincipal vp = new ViewPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnfinalizarvendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinalizarvendaActionPerformed
        if (tabelaVenda.getRowCount() == 0 && this.idvenda == 0) {
            JOptionPane.showMessageDialog(this, "não foi possível salvar", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } else if (jComboBoxProduto.getItemCount() < 0) {
            JOptionPane.showMessageDialog(this, "não existem produtos cadastrados", "Atenção!", JOptionPane.WARNING_MESSAGE);
        } else {
            
            Venda v = new Venda();
            v.setData(txtdata.getText());
            v.setValorTotal(Double.parseDouble(txttotal.getText()));

            Connection con = ConnectionFactory.getConnection();
            String src = "src/reports/venda.jasper";

            JasperPrint jp = null;
            Map m = new HashMap();
            m.put("id", this.idvenda);

            try {
                jp = JasperFillManager.fillReport(src, m, con);

            } catch (JRException ex) {
                System.out.println("erro ao gerar relatório da venda" + ex);
            }

            JasperViewer view = new JasperViewer(jp, false);
            view.setVisible(true);

            /////////////////ENVIANDO E-MAIL////////////////////////
            
            if (!jComboBoxCliente.getSelectedItem().equals("Não Informado")) {
                Clientes c = (Clientes) jComboBoxCliente.getSelectedItem();

                String meuEmail = "sistematopicos@gmail.com";
                String senha = "sistematopicos2019";

                SimpleEmail sm = new SimpleEmail();
                sm.setHostName("smtp.gmail.com");
                sm.setSmtpPort(465);
                sm.setAuthenticator(new DefaultAuthenticator(meuEmail, senha));
                sm.setSSLOnConnect(true);

                try {
                    sm.setFrom("sistematopicos@gmail.com");

                    sm.setSubject("Comprovante da Compra Realizada: ");
                    sm.setMsg("Data da Venda: " + v.getData() + "\nTotal da compra: R$ " + v.getValorTotal());

                    sm.addTo(c.getEmail());
                    sm.send();

                    JOptionPane.showMessageDialog(this, "comprovante enviado para o cliente com sucesso");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "não foi possível enviar o e-mail para o cliente");
                }
            }
                jTabbedPane1.setSelectedIndex(0);
        }

    }//GEN-LAST:event_btnfinalizarvendaActionPerformed

    private void btnaddprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddprodutosActionPerformed
        if(!txtdata.getText().equals("  /  /    ") && !txtnotafiscal.getText().isEmpty()){
            try {
                vc.insert(txtdata.getText(),txtnotafiscal.getText(), 0);
                
                btnfinalizarvenda.setEnabled(true);
                btnadicionar.setEnabled(true);
                btnremover.setEnabled(true);
                btncancelar.setEnabled(true);
        
            } catch (SQLException ex) {
                Logger.getLogger(ViewRegistrarVendas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.idvenda = vc.read();
            jTabbedPane1.setSelectedIndex(1);
        }
    }//GEN-LAST:event_btnaddprodutosActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ViewPrincipal vp = new ViewPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ViewPrincipal vp = new ViewPrincipal();
        vp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendaMouseClicked
        if(tabelaVenda.getRowCount()>0){
            btnremover.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaVendaMouseClicked

    public boolean validaCampos(){
        if(!validaCampos.validaQuantidade(txtqtd.getText())){
            JOptionPane.showMessageDialog(null, "quantidade inválida", "", JOptionPane.ERROR_MESSAGE);
            txtqtd.setText("");
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
            java.util.logging.Logger.getLogger(ViewRegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRegistrarVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegistrarVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddprodutos;
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnfinalizarvenda;
    private javax.swing.JButton btnremover;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<Object> jComboBoxCliente;
    private javax.swing.JComboBox<Object> jComboBoxProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JFormattedTextField txtdata;
    private javax.swing.JTextField txtnotafiscal;
    private javax.swing.JTextField txtqtd;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtvalorunitario;
    // End of variables declaration//GEN-END:variables
}
