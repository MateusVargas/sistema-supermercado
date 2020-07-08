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
import model.bean.Venda;
import model.bean.Clientes;

public class VendaDAO {
      public boolean create(Venda v) throws SQLException{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement st2 = null;
        
        try{
            st2 = con.prepareStatement("INSERT INTO venda (data,notafiscal,valor) VALUES (?,?,?)");
            st2.setString(1, v.getData());
            st2.setString(2, v.getNotafiscal());
            st2.setDouble(3, v.getValorTotal());
            
            con.setAutoCommit(false);
            
            st2.executeUpdate();
            con.commit();         
            
            JOptionPane.showMessageDialog(null, "venda registrada com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            return true;
            
        }catch(SQLDataException e){
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + e, "", JOptionPane.ERROR_MESSAGE);
        
        try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("erro");
            }
            return false;
            
        } finally{
            
              try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
              ConnectionFactory.closeConnection(con, st2);
        }
        
    }
      
      
    public boolean update(Venda v) throws SQLException{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("UPDATE venda SET valor = ? WHERE id = ?");
            stat.setDouble(1, v.getValorTotal());
            stat.setLong(2, v.getId());
            
            con.setAutoCommit(false);
            
            stat.executeUpdate();
            con.commit();         
            
            return true;
            
        }catch(SQLDataException e){
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + e, "", JOptionPane.ERROR_MESSAGE);
        
        try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("erro");
            }
            return false;
            
        } finally{
            ConnectionFactory.closeConnection(con, stat);
              try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     
     
     
     public int read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        int id = 0;
        
        try{
            stat = con.prepareStatement("SELECT MAX(id) as id FROM venda");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Venda v = new Venda();
                
                v.setId(resultado.getLong("id"));
                
                id = (int) v.getId();
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao ler" +e, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        
        return id;      
    }
}
