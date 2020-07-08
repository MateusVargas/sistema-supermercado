package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Fornecedores;
import model.bean.Produtos;

public class ProdutosDAO {
    
    public boolean create(Produtos prod) throws SQLException{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("INSERT INTO produto "
                    + "(categoria,descricao,precocusto,margemlucro,precovenda,codigobarras,marca,fornecedor,idfornecedor)"
                    + " VALUES (?,?,?,?,?,?,?,?,?)");
            
            stat.setString(1, prod.getCategoria());
            stat.setString(2, prod.getDescricao());
            stat.setDouble(3, prod.getPrecoCusto());
            stat.setDouble(4, prod.getMargemLucro());
            stat.setDouble(5, prod.getPrecoVenda());
            stat.setString(6, prod.getCodigoBarras());
            stat.setString(7, prod.getMarca());
            stat.setString(8, prod.getFornecedor().getRazaoSocial());
            stat.setLong(9, prod.getFornecedor().getId());
            
        //    con.setAutoCommit(false);
            
            stat.executeUpdate();
        //    con.commit();         
            JOptionPane.showMessageDialog(null, "produto cadastrado", "", JOptionPane.INFORMATION_MESSAGE);
            return true;
            
        }catch(SQLDataException e){
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + e, "", JOptionPane.ERROR_MESSAGE);
        
       /* try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("erro");
            }*/
            return false;
            
        } finally{
            ConnectionFactory.closeConnection(con, stat);
            /*  try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
        
    }
    
    
    public ArrayList<Produtos> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Produtos> arrayP = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id as pid, produto.categoria, produto.descricao, produto.precocusto, produto.margemlucro,\n" +
"produto.precovenda, produto.codigobarras, produto.marca, produto.fornecedor,\n" +
"produto.idfornecedor, fornecedores.id, fornecedores.razaosocial from produto inner join fornecedores \n" +
"on(produto.idfornecedor=fornecedores.id)");
           // stat = con.prepareStatement("");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Produtos p = new Produtos();
                p.setId(resultado.getLong("pid"));
                p.setCategoria(resultado.getString("categoria"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoCusto(resultado.getDouble("precocusto"));
                p.setMargemLucro(resultado.getDouble("margemlucro"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                p.setCodigoBarras(resultado.getString("codigobarras"));
                p.setMarca(resultado.getString("marca"));
                
                Fornecedores f = new Fornecedores();
                f.setId(resultado.getInt("id"));
                f.setRazaoSocial(resultado.getString("razaosocial"));
                p.setFornecedor(f);
                
                arrayP.add(p);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayP;
    }
    
    
    public boolean update(Produtos prod){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareCall("UPDATE produto "
                    + "SET categoria = ?, descricao = ?, precocusto = ?, margemlucro = ?, precovenda = ?,"
                    + " codigobarras = ?, marca = ?, fornecedor = ?, idfornecedor = ? WHERE id = ?");
            
            stat.setString(1, prod.getCategoria());
            stat.setString(2, prod.getDescricao());
            stat.setDouble(3, prod.getPrecoCusto());
            stat.setDouble(4, prod.getMargemLucro());
            stat.setDouble(5, prod.getPrecoVenda());
            stat.setString(6, prod.getCodigoBarras());
            stat.setString(7, prod.getMarca());
            stat.setString(8, prod.getFornecedor().getRazaoSocial());
            stat.setLong(9, prod.getFornecedor().getId());
            stat.setLong(10, prod.getId());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
                
            return true;
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
             return false;
             
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
               
    }
    
    
    public void delete(Produtos p) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat=null;      
        
        try{
        String sql="DELETE FROM produto WHERE id = ?";
        stat = con.prepareStatement(sql);
        stat.setLong(1, p.getId());
        
        stat.executeUpdate();
        
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "não foi possível excluir", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    
    public ArrayList<Produtos> getProdutos(String n){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stat = null;
            ResultSet resultado = null;
            
            ArrayList<Produtos> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("select produto.id as pid, produto.categoria, produto.descricao, produto.precocusto, produto.margemlucro,\n" +
"produto.precovenda, produto.codigobarras, produto.marca, produto.fornecedor,\n" +
"produto.idfornecedor, fornecedores.id, fornecedores.razaosocial from produto inner join fornecedores \n" +
"on(produto.idfornecedor=fornecedores.id) WHERE descricao LIKE ? ORDER BY produto.id");
                stat.setString(1, "%" +n+ "%");
                resultado=stat.executeQuery();
                
                while(resultado.next()){
                Produtos p = new Produtos();
                p.setId(resultado.getLong("pid"));
                p.setCategoria(resultado.getString("categoria"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoCusto(resultado.getDouble("precocusto"));
                p.setMargemLucro(resultado.getDouble("margemlucro"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                p.setCodigoBarras(resultado.getString("codigobarras"));
                p.setMarca(resultado.getString("marca"));
                
                Fornecedores f = new Fornecedores();
                f.setId(resultado.getInt("id"));
                f.setRazaoSocial(resultado.getString("razaosocial"));
                p.setFornecedor(f);
                
                vetor.add(p);
            }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os alunos", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, resultado);
            }
            
            return vetor;
            
    }
    
    
    
    public ArrayList<Produtos> ordenarCategoria() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Produtos> arrayP = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id as pid, produto.categoria, produto.descricao, produto.precocusto, produto.margemlucro,\n" +
"produto.precovenda, produto.codigobarras, produto.marca, produto.fornecedor,\n" +
"produto.idfornecedor, fornecedores.id, fornecedores.razaosocial from produto inner join fornecedores \n" +
"on(produto.idfornecedor=fornecedores.id) ORDER BY produto.categoria");
           // stat = con.prepareStatement("");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Produtos p = new Produtos();
                p.setId(resultado.getLong("pid"));
                p.setCategoria(resultado.getString("categoria"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoCusto(resultado.getDouble("precocusto"));
                p.setMargemLucro(resultado.getDouble("margemlucro"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                p.setCodigoBarras(resultado.getString("codigobarras"));
                p.setMarca(resultado.getString("marca"));
                
                Fornecedores f = new Fornecedores();
                f.setId(resultado.getInt("id"));
                f.setRazaoSocial(resultado.getString("razaosocial"));
                p.setFornecedor(f);
                
                arrayP.add(p);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayP;
    }
    
    
    public ArrayList<Produtos> ordenarPorFornecedor() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Produtos> arrayP = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id as pid, produto.categoria, produto.descricao, produto.precocusto, produto.margemlucro,\n" +
"produto.precovenda, produto.codigobarras, produto.marca, produto.fornecedor,\n" +
"produto.idfornecedor, fornecedores.id, fornecedores.razaosocial from produto inner join fornecedores \n" +
"on(produto.idfornecedor=fornecedores.id) ORDER BY fornecedores.razaosocial");
           // stat = con.prepareStatement("");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Produtos p = new Produtos();
                p.setId(resultado.getLong("pid"));
                p.setCategoria(resultado.getString("categoria"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoCusto(resultado.getDouble("precocusto"));
                p.setMargemLucro(resultado.getDouble("margemlucro"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                p.setCodigoBarras(resultado.getString("codigobarras"));
                p.setMarca(resultado.getString("marca"));
                
                Fornecedores f = new Fornecedores();
                f.setId(resultado.getInt("id"));
                f.setRazaoSocial(resultado.getString("razaosocial"));
                p.setFornecedor(f);
                
                arrayP.add(p);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayP;
    }
    
    
    public ArrayList<Produtos> ordenarDescricao() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Produtos> arrayP = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id as pid, produto.categoria, produto.descricao, produto.precocusto, produto.margemlucro,\n" +
"produto.precovenda, produto.codigobarras, produto.marca, produto.fornecedor,\n" +
"produto.idfornecedor, fornecedores.id, fornecedores.razaosocial from produto inner join fornecedores \n" +
"on(produto.idfornecedor=fornecedores.id) ORDER BY produto.descricao");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Produtos p = new Produtos();
                p.setId(resultado.getLong("pid"));
                p.setCategoria(resultado.getString("categoria"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoCusto(resultado.getDouble("precocusto"));
                p.setMargemLucro(resultado.getDouble("margemlucro"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                p.setCodigoBarras(resultado.getString("codigobarras"));
                p.setMarca(resultado.getString("marca"));
                
                Fornecedores f = new Fornecedores();
                f.setId(resultado.getInt("id"));
                f.setRazaoSocial(resultado.getString("razaosocial"));
                p.setFornecedor(f);
                
                arrayP.add(p);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayP;
    }
    
}
