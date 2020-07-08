package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Fornecedores;

public class FornecedoresDAO {
    
    public boolean create(Fornecedores forn) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO fornecedores (razaosocial,cnpj,email,endereco,estado,cidade,site,telefone) VALUES (?,?,?,?,?,?,?,?)");
            stat.setString(1, forn.getRazaoSocial());
            stat.setString(2, forn.getCnpj());
            stat.setString(3, forn.getEmail());
            stat.setString(4, forn.getEndereco());
            stat.setString(5, forn.getEstado());
            stat.setString(6, forn.getCidade());
            stat.setString(7, forn.getSite());
            stat.setString(8, forn.getTelefone());

           // con.setAutoCommit(false);
            
            stat.executeUpdate();
         //   con.commit();
            JOptionPane.showMessageDialog(null, "cadastrado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + ex, "", JOptionPane.ERROR_MESSAGE);
           
           /* try {
                con.rollback();
            } catch (SQLException ex1) {
                System.out.println("erro");
            }*/
            return false;
            
        } finally{
            ConnectionFactory.closeConnection(con, stat);
           /* try {
                con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(FornecedoresDAO.class.getName()).log(Level.SEVERE, null, ex);
            }*/
        }

    }
    
    
    public ArrayList<Fornecedores> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;
        
        ArrayList<Fornecedores> lista = new ArrayList<>();
        try{
            stat = con.prepareStatement("SELECT * FROM fornecedores ORDER by id");
            rs = stat.executeQuery();
            
            while(rs.next()){
                Fornecedores f = new Fornecedores();
                f.setId(rs.getLong("id"));
                f.setRazaoSocial(rs.getString("razaosocial"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setSite(rs.getString("site"));
                f.setTelefone(rs.getString("telefone"));
                
                
                lista.add(f);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao ler os fornecedores", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return lista;
    }
    
    public void update(Fornecedores f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("UPDATE fornecedores SET razaosocial = ?, cnpj = ?, email = ?, endereco = ?,"
                    + " estado = ?, cidade = ?, site = ?, telefone = ? WHERE id = ?");
            stat.setString(1, f.getRazaoSocial());
            stat.setString(2, f.getCnpj());
            stat.setString(3, f.getEmail());
            stat.setString(4, f.getEndereco());
            stat.setString(5, f.getEstado());
            stat.setString(6, f.getCidade());
            stat.setString(7, f.getSite());
            stat.setString(8, f.getTelefone());
            stat.setLong(9, f.getId());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao atualizar", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    public void delete(Fornecedores f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("DELETE FROM fornecedores WHERE id = ?");
            stat.setLong(1, f.getId());
            
            stat.executeUpdate();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    
    public ArrayList<Fornecedores> ordenarRazaoSocial() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;
        
        ArrayList<Fornecedores> lista = new ArrayList<>();
        try{
            stat = con.prepareStatement("SELECT * FROM fornecedores ORDER by razaosocial");
            rs = stat.executeQuery();
            
            while(rs.next()){
                Fornecedores f = new Fornecedores();
                f.setId(rs.getLong("id"));
                f.setRazaoSocial(rs.getString("razaosocial"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setSite(rs.getString("site"));
                f.setTelefone(rs.getString("telefone"));
                
                
                lista.add(f);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao ler os fornecedores", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return lista;
    }
    
    
    public ArrayList<Fornecedores> ordenarPorEstado() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;
        
        ArrayList<Fornecedores> lista = new ArrayList<>();
        try{
            stat = con.prepareStatement("SELECT * FROM fornecedores ORDER by estado");
            rs = stat.executeQuery();
            
            while(rs.next()){
                Fornecedores f = new Fornecedores();
                f.setId(rs.getLong("id"));
                f.setRazaoSocial(rs.getString("razaosocial"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setSite(rs.getString("site"));
                f.setTelefone(rs.getString("telefone"));
                
                
                lista.add(f);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao ler os fornecedores", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return lista;
    }
    
    
    public ArrayList<Fornecedores> ordenarPorCidade() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;
        
        ArrayList<Fornecedores> lista = new ArrayList<>();
        try{
            stat = con.prepareStatement("SELECT * FROM fornecedores ORDER by cidade");
            rs = stat.executeQuery();
            
            while(rs.next()){
                Fornecedores f = new Fornecedores();
                f.setId(rs.getLong("id"));
                f.setRazaoSocial(rs.getString("razaosocial"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setSite(rs.getString("site"));
                f.setTelefone(rs.getString("telefone"));
                
                
                lista.add(f);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao ler os fornecedores", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return lista;
    }
    
    
    
    public ArrayList<Fornecedores> getFornecedores(String ch) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs =null;
        
        ArrayList<Fornecedores> lista = new ArrayList<>();
        try{
            stat = con.prepareStatement("SELECT * FROM fornecedores WHERE razaosocial LIKE ? ORDER by id");
            stat.setString(1, "%" +ch+ "%");
            rs = stat.executeQuery();
            
            while(rs.next()){
                Fornecedores f = new Fornecedores();
                f.setId(rs.getLong("id"));
                f.setRazaoSocial(rs.getString("razaosocial"));
                f.setCnpj(rs.getString("cnpj"));
                f.setEmail(rs.getString("email"));
                f.setEndereco(rs.getString("endereco"));
                f.setEstado(rs.getString("estado"));
                f.setCidade(rs.getString("cidade"));
                f.setSite(rs.getString("site"));
                f.setTelefone(rs.getString("telefone"));
                
                
                lista.add(f);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "erro ao ler os fornecedores", "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return lista;
    }
    
    
}
