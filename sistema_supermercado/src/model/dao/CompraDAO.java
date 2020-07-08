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
import model.bean.Compra;
import model.bean.Fornecedores;

public class CompraDAO {
     public boolean create(Compra c) throws SQLException{
        Connection con=ConnectionFactory.getConnection();
        PreparedStatement st2 = null;
        
        try{
            st2 = con.prepareStatement("INSERT INTO compra (notafiscal,data,idfornecedor) VALUES (?,?,?)");
            st2.setString(1, c.getNotafiscal());
            st2.setString(2, c.getData());
            st2.setLong(3, c.getForn().getId());
            
            con.setAutoCommit(false);
            
            st2.executeUpdate();
            con.commit();         
            
            JOptionPane.showMessageDialog(null, "compra registrada com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
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
                Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
              ConnectionFactory.closeConnection(con, st2);
        }
        
    }
     
     
    public long read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        long id = 0;
        
        try{
            stat = con.prepareStatement("SELECT MAX(id) as id FROM compra");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Compra c = new Compra();
                
                c.setId(resultado.getLong("id"));
                
                id = c.getId();
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao ler" +e, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        
        return id;      
    }
    
}
