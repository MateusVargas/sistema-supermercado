package view;

import controller.CompraController;
import controller.EstoqueController;
import controller.FornecedoresController;
import controller.ItensCompraController;
import controller.ProdutosController;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Compra;
import model.bean.Estoque;
import model.bean.Fornecedores;
import model.bean.Produtos;
import regex.validaCampos;
import tablemodel.FornecedoresTableModel;
import tablemodel.ProdutoTableModel;

public class ViewProdutos extends javax.swing.JFrame {

    ProdutosController pcon = new ProdutosController();
    CompraController cc = new CompraController();
    EstoqueController ec = new EstoqueController();
    ItensCompraController ic = new ItensCompraController();
    ProdutoTableModel pt;

    public ViewProdutos() {
        initComponents();

        btnAtualizar.setEnabled(false);
        btnAtualizarSelecionado.setEnabled(false);
        btnExcluir.setEnabled(false);

        listaFornecedoresCombobox();
        populaTabela();
    }

    public void listaFornecedoresCombobox() {
        FornecedoresController fc = new FornecedoresController();
        for (Fornecedores f : fc.read()) {
            jComboBoxFornecedorProd.addItem(f);
        }
    }

    /*public void populaTabela(){
        DefaultTableModel listaProdutos = (DefaultTableModel) tabelaProdutos.getModel();
        listaProdutos.setRowCount(0);
        
        for(Produtos prod : pcon.read()){
            listaProdutos.addRow(new Object[]{
            prod.getId(), prod.getCategoria(), prod.getDescricao(), prod.getPrecoCusto(),prod.getMargemLucro(), prod.getPrecoVenda(),
                prod.getFornecedor().getRazaoSocial(), prod.getCodigoBarras(), prod.getMarca()});
        }
        
    }*/
    public void populaTabela() {
        tabelaProdutos.removeAll();
        pt = new ProdutoTableModel(pcon.read());
        tabelaProdutos.setModel(pt);
    }

    public void limpar() {
        txtBuscaProdutos.setText("");
        txtCodeBarras.setText("");
        txtDescricaoProduto.setText("");
        txtMarcaProduto.setText("");
        txtMargemLucro.setText("");
        txtPrecoProduto.setText("");
        txtPrecoVenda.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMargemLucro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMarcaProduto = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        txtPrecoProduto = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jComboBoxCategoriaProduto = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxFornecedorProd = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodeBarras = new javax.swing.JTextField();
        btnAtualizar = new javax.swing.JButton();
        btncalculapreco = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtBuscaProdutos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxOrdenarProdutos = new javax.swing.JComboBox<>();
        btnAtualizarSelecionado = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jTabbedPane1.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("MARGEM DE LUCRO: %");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("PREÇO DE CUSTO: R$");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("PREÇO DE VENDA: R$");

        txtPrecoVenda.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("MARCA:");

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

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jComboBoxCategoriaProduto.setBackground(new java.awt.Color(0, 255, 153));
        jComboBoxCategoriaProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxCategoriaProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bebidas", "Laticínios", "Carnes", "Higiene", "Alimentos", "Limpeza", "Frutas", "Pescado", "Utilidades" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("FORNECEDOR:");

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
                .addContainerGap(161, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jComboBoxFornecedorProd.setBackground(new java.awt.Color(255, 51, 51));
        jComboBoxFornecedorProd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("CÓDIGO/CATEGORIA:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("CÓDIGO DE BARRAS:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("DESCRIÇÃO:");

        btnAtualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnAtualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-update-24.png"))); // NOI18N
        btnAtualizar.setText("ATUALIZAR");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btncalculapreco.setBackground(new java.awt.Color(0, 102, 102));
        btncalculapreco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncalculapreco.setForeground(new java.awt.Color(255, 255, 255));
        btncalculapreco.setText("CALCULAR");
        btncalculapreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculaprecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel6)))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFornecedorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncalculapreco, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(38, 38, 38)
                                .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(158, 158, 158)
                .addComponent(btnAtualizar)
                .addGap(157, 157, 157)
                .addComponent(btnCancelar)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxCategoriaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtMargemLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncalculapreco))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxFornecedorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMarcaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodeBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnCancelar))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jPanel2.setPreferredSize(new java.awt.Dimension(949, 500));

        tabelaProdutos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 51, 102), null, null));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaProdutos.setRowHeight(18);
        tabelaProdutos.setSelectionBackground(new java.awt.Color(204, 0, 0));
        tabelaProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaProdutos.setShowVerticalLines(false);
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProdutos);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("PROCURAR:");

        txtBuscaProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscaProdutosKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("ORDENAR POR:");

        jComboBoxOrdenarProdutos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBoxOrdenarProdutos.setForeground(new java.awt.Color(204, 0, 0));
        jComboBoxOrdenarProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Categoria", "Fornecedor", "Descrição" }));
        jComboBoxOrdenarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrdenarProdutosActionPerformed(evt);
            }
        });

        btnAtualizarSelecionado.setBackground(new java.awt.Color(0, 102, 102));
        btnAtualizarSelecionado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAtualizarSelecionado.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarSelecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/icons8-save-24.png"))); // NOI18N
        btnAtualizarSelecionado.setText("ATUALIZAR");
        btnAtualizarSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarSelecionadoActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(204, 0, 0));
        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Actions-window-close-icon.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(204, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/zaffari-bourbon-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        btnExportar.setBackground(new java.awt.Color(0, 102, 102));
        btnExportar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONES/Microsoft-Excel-2013-icon.png"))); // NOI18N
        btnExportar.setText("EXPORTAR PRO EXCEL");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(26, 26, 26)
                        .addComponent(jComboBoxOrdenarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(btnAtualizarSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(btnExportar)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxOrdenarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscaProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAtualizarSelecionado)
                    .addComponent(btnExportar))
                .addGap(19, 19, 19))
        );

        jTabbedPane1.addTab("Produtos Cadastrados", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (validaCamposProdutos()) {
            Fornecedores forn = (Fornecedores) jComboBoxFornecedorProd.getSelectedItem();

            if (!txtDescricaoProduto.getText().isEmpty() && !txtPrecoProduto.getText().isEmpty()
                    && !txtMargemLucro.getText().isEmpty() && !txtPrecoVenda.getText().isEmpty()) {

                Produtos p = new Produtos();
                p.setCategoria(jComboBoxCategoriaProduto.getSelectedItem().toString());
                p.setCodigoBarras(txtCodeBarras.getText());
                p.setDescricao(txtDescricaoProduto.getText());
                p.setMarca(txtMarcaProduto.getText());
                p.setMargemLucro(Double.parseDouble(txtMargemLucro.getText()));
                p.setPrecoCusto(Double.parseDouble(txtPrecoProduto.getText()));
                p.setPrecoVenda(Double.parseDouble(txtPrecoVenda.getText()));
                p.setFornecedor(forn);

                try {
                    if (pcon.create(/*jComboBoxCategoriaProduto.getSelectedItem().toString(), txtDescricaoProduto.getText(),
                        Double.parseDouble(txtPrecoProduto.getText()), Double.parseDouble(txtMargemLucro.getText())
                        ,Double.parseDouble(txtPrecoVenda.getText()),  txtCodeBarras.getText(),
                        txtMarcaProduto.getText(), forn, txtdata.getText()*/p)) {

                        populaTabela();
                        limpar();
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(ViewProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Os campos descrição, preço e margem de lucro"
                        + " são obrigatórios", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        if (tabelaProdutos.getSelectedRow() >= 0) {
            btnAtualizarSelecionado.setEnabled(true);
            btnExcluir.setEnabled(true);

            jComboBoxCategoriaProduto.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0));
            txtDescricaoProduto.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 1).toString());
            txtPrecoProduto.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 2).toString());
            txtMargemLucro.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 3).toString());
            txtPrecoVenda.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 4).toString());
            //  jComboBoxFornecedorProd.setSelectedItem(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),6));
            txtCodeBarras.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 6).toString());
            txtMarcaProduto.setText(tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 7).toString());

            String item = (String) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 5);
            for (int i = 0; i < jComboBoxFornecedorProd.getItemCount(); i++) {
                Fornecedores f = (Fornecedores) jComboBoxFornecedorProd.getItemAt(i);
                if (f.getRazaoSocial().equals(item)) {
                    jComboBoxFornecedorProd.setSelectedIndex(i);
                }
            }
        }
    }//GEN-LAST:event_tabelaProdutosMouseClicked

    private void btnAtualizarSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarSelecionadoActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        btnAtualizar.setEnabled(true);
    }//GEN-LAST:event_btnAtualizarSelecionadoActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        if (validaCamposProdutos()) {
            if (!txtDescricaoProduto.getText().isEmpty() && !txtPrecoVenda.getText().isEmpty()
                    && !txtPrecoProduto.getText().isEmpty() && !txtMargemLucro.getText().isEmpty()) {

                Produtos p = pt.getProdutos(tabelaProdutos.getSelectedRow());
                Fornecedores f = (Fornecedores) jComboBoxFornecedorProd.getSelectedItem();

                if (pcon.update(p.getId(), jComboBoxCategoriaProduto.getSelectedItem().toString(),
                        txtDescricaoProduto.getText(), Double.parseDouble(txtPrecoProduto.getText()), Double.parseDouble(txtMargemLucro.getText()),
                        Double.parseDouble(txtPrecoVenda.getText()), txtCodeBarras.getText(),
                        txtMarcaProduto.getText(), f)) {
                    populaTabela();
                    limpar();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Os campos descrição e preço"
                        + " são obrigatórios", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabelaProdutos.getSelectedRow() >= 0) {

            Produtos p = pt.getProdutos(tabelaProdutos.getSelectedRow());

            try {
                pcon.delete(p);
                populaTabela();
                btnAtualizarSelecionado.setEnabled(false);
            } catch (SQLException ex) {
                Logger.getLogger(ViewProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                ec.delete((long) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(), 0));
            } catch (SQLException ex) {
                Logger.getLogger(ViewProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btncalculaprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculaprecoActionPerformed
        double custo = Double.parseDouble(txtPrecoProduto.getText());
        double margem = Double.parseDouble(txtMargemLucro.getText());
        double precoVenda = custo + (margem * custo / 100);
        txtPrecoVenda.setText(String.valueOf(precoVenda));
    }//GEN-LAST:event_btncalculaprecoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ViewPrincipal p = new ViewPrincipal();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void jComboBoxOrdenarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrdenarProdutosActionPerformed
        if (jComboBoxOrdenarProdutos.getSelectedItem().equals("Nenhum")) {
            populaTabela();
        } else if (jComboBoxOrdenarProdutos.getSelectedItem().equals("Categoria")) {
            tabelaProdutos.removeAll();
            pt = new ProdutoTableModel(pcon.ordenarCategoria());
            tabelaProdutos.setModel(pt);
        } else if (jComboBoxOrdenarProdutos.getSelectedItem().equals("Fornecedor")) {
            tabelaProdutos.removeAll();
            pt = new ProdutoTableModel(pcon.ordenarPorFornecedor());
            tabelaProdutos.setModel(pt);
        } else if (jComboBoxOrdenarProdutos.getSelectedItem().equals("Descrição")) {
            tabelaProdutos.removeAll();
            pt = new ProdutoTableModel(pcon.ordenarDescricao());
            tabelaProdutos.setModel(pt);
        }
    }//GEN-LAST:event_jComboBoxOrdenarProdutosActionPerformed

    private void txtBuscaProdutosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutosKeyTyped
        String chave = txtBuscaProdutos.getText();
        if (evt.getKeyChar() != '\b') {
            chave = chave + evt.getKeyChar();
        }
        pt = new ProdutoTableModel(pcon.getProdutos(chave));
        tabelaProdutos.setModel(pt);
    }//GEN-LAST:event_txtBuscaProdutosKeyTyped

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            FileWriter out = new FileWriter("Produtos.xls", false);
            BufferedWriter bw = new BufferedWriter(out);
            for (int i = 0; i < pt.getColumnCount(); i++) {
                bw.write(pt.getColumnName(i) + "\t");
            }
            bw.write("\n");

                for (int j = 0; j < pt.getRowCount(); j++) {
                    Produtos paux = pt.getProdutos(j);
                    
                    bw.write(paux.getCategoria() + "\t");
                    bw.write(paux.getDescricao() + "\t");
                    bw.write(paux.getPrecoCusto() + "\t");
                    bw.write(paux.getMargemLucro() + "\t");
                    bw.write(paux.getPrecoVenda() + "\t");
                    bw.write(paux.getFornecedor().getRazaoSocial() + "\t");
                    bw.write(paux.getCodigoBarras() + "\t");
                    bw.write(paux.getMarca() + "\t");
                    
                    bw.write("\n");
            }
            bw.close();
            
            JOptionPane.showMessageDialog(this, "tabela exportada com sucesso");
        } catch (IOException ex) {
            Logger.getLogger(ViewProdutos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "não foi possível exportar");
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private boolean validaCamposProdutos() {
        if (!validaCampos.validaDescricao(txtDescricaoProduto.getText())) {
            JOptionPane.showMessageDialog(this, "descrição inválida", "", JOptionPane.ERROR_MESSAGE);
            txtDescricaoProduto.setText("");
            return false;
        }

        if (!validaCampos.validaPreco(txtPrecoProduto.getText())) {
            JOptionPane.showMessageDialog(this, "preço inválido", "", JOptionPane.ERROR_MESSAGE);
            txtPrecoProduto.setText("");
            return false;
        }

        if (!validaCampos.validaPercentual(txtMargemLucro.getText())) {
            JOptionPane.showMessageDialog(this, "margem de lucro inválida", "", JOptionPane.ERROR_MESSAGE);
            txtMargemLucro.setText("");
            return false;
        }

        if (!validaCampos.validaCodigodebarras(txtCodeBarras.getText())) {
            JOptionPane.showMessageDialog(this, "código de barras inválido", "", JOptionPane.ERROR_MESSAGE);
            txtCodeBarras.setText("");
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
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnAtualizarSelecionado;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btncalculapreco;
    private javax.swing.JComboBox<String> jComboBoxCategoriaProduto;
    private javax.swing.JComboBox<Object> jComboBoxFornecedorProd;
    private javax.swing.JComboBox<String> jComboBoxOrdenarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField txtBuscaProdutos;
    private javax.swing.JTextField txtCodeBarras;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtMarcaProduto;
    private javax.swing.JTextField txtMargemLucro;
    private javax.swing.JTextField txtPrecoProduto;
    private javax.swing.JTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
}
