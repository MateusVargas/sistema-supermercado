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
import model.bean.Estoque;
import model.bean.Produtos;
import org.postgresql.util.PSQLException;

public class EstoqueDAO {
       public boolean create(Estoque est) throws SQLException{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("INSERT INTO estoque "
                    + "(idproduto,quantidade)"
                    + " VALUES (?,?)");
            
            stat.setLong(1, est.getProduto().getId());
            stat.setInt(2, est.getQtd());
            
          //  con.setAutoCommit(false);
            
            stat.executeUpdate();
         //   con.commit();         
            
            JOptionPane.showMessageDialog(null, "inserido no estoque com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            return true;
            
        }catch (PSQLException x) {
                JOptionPane.showMessageDialog(null, "esse produto já está no estoque", "", JOptionPane.WARNING_MESSAGE);
                return false;
        }catch(SQLDataException e){
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + e, "", JOptionPane.ERROR_MESSAGE);
        
       /* try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("erro");
            }*/
            return false;
            
        }
        finally{
            ConnectionFactory.closeConnection(con, stat);
            /*  try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }
        
    }
    
    
    public ArrayList<Estoque> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Estoque> arrayE = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("SELECT idproduto, quantidade, produto.descricao, produto.precovenda\n" +
"	FROM estoque inner join produto on(estoque.idproduto=produto.id);");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Estoque e = new Estoque();
                
                e.setQtd(resultado.getInt("quantidade"));
                
                Produtos p = new Produtos();
                p.setId(resultado.getInt("idproduto"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                e.setProduto(p);
                
                arrayE.add(e);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayE;
    }
       
    public boolean update(Estoque est){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareCall("UPDATE estoque SET quantidade = ? WHERE idproduto = ?");
            
            stat.setInt(1, est.getQtd());
            stat.setLong(2, est.getProduto().getId());
            
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
    
    
    public void delete(long id) throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat=null;      
        
        try{
        String sql="DELETE FROM estoque WHERE idproduto = ?";
        stat = con.prepareStatement(sql);
        stat.setLong(1, id);
        
        stat.executeUpdate();
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "não foi possível excluir", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    
    public boolean updateQuantidade(double qtd, Estoque est){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareCall("UPDATE estoque SET quantidade = ? WHERE idproduto = ?");
            
            stat.setDouble(1, qtd);
            stat.setLong(2, est.getProduto().getId());
            
            stat.executeUpdate();
                
            return true;
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "erro ao atualizar a quantidade", "", JOptionPane.ERROR_MESSAGE);
             return false;
             
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    
     public int read(long id){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        int qtd = 0;
        
        try{
            stat = con.prepareStatement("SELECT quantidade FROM estoque WHERE idproduto = ?");
            stat.setLong(1, id);
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Estoque e = new Estoque();
                
                e.setQtd(resultado.getInt("quantidade"));
                
                qtd = e.getQtd();
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao ler" +e, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        
        return qtd;      
    }
     
     
     public ArrayList<Estoque> getProdutos(String n){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stat = null;
            ResultSet resultado = null;
            
            ArrayList<Estoque> vetor = new ArrayList<>();
            try{
                stat = con.prepareStatement("SELECT idproduto, quantidade, produto.descricao, produto.precovenda\n" +
"	FROM estoque inner join produto on(estoque.idproduto=produto.id) WHERE produto.descricao LIKE ? ORDER BY idproduto");
                stat.setString(1, "%" +n+ "%");
                resultado=stat.executeQuery();
                
                while(resultado.next()){
                Estoque e = new Estoque();
                
                e.setQtd(resultado.getInt("quantidade"));
                
                Produtos p = new Produtos();
                p.setId(resultado.getInt("idproduto"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                e.setProduto(p);
                
                vetor.add(e);
            }
                
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "erro ao ler os alunos", "", JOptionPane.ERROR_MESSAGE);
            }finally{
                ConnectionFactory.closeConnection(con, stat, resultado);
            }
            
            return vetor;
            
    }
     
     
     
     
     public ArrayList<Estoque> ordenarProdutos(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Estoque> arrayE = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("SELECT idproduto, quantidade, produto.descricao, produto.precovenda\n" +
"	FROM estoque inner join produto on(estoque.idproduto=produto.id) ORDER by produto.descricao");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Estoque e = new Estoque();
                
                e.setQtd(resultado.getInt("quantidade"));

                Produtos p = new Produtos();
                p.setId(resultado.getInt("idproduto"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                e.setProduto(p);
                
                arrayE.add(e);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayE;
    }
     
     
     public ArrayList<Estoque> ordenarPorQtd(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList<Estoque> arrayE = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("SELECT idproduto, quantidade, produto.descricao, produto.precovenda\n" +
"	FROM estoque inner join produto on(estoque.idproduto=produto.id) ORDER by quantidade");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Estoque e = new Estoque();
                
                e.setQtd(resultado.getInt("quantidade"));
                
                Produtos p = new Produtos();
                p.setId(resultado.getInt("idproduto"));
                p.setDescricao(resultado.getString("descricao"));
                p.setPrecoVenda(resultado.getDouble("precovenda"));
                e.setProduto(p);
                
                arrayE.add(e);
            }
            
        }catch(SQLException e){
            
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        return arrayE;
    }
    
}
