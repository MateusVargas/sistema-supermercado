package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Clientes;

public class ClientesDAO {
    public boolean create(Clientes c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("INSERT INTO cliente "
                    + "(nome,sexo,datanascimento,cpf,telefone,cep,cidade,endereco,email) VALUES (?,?,?,?,?,?,?,?,?)");
            
            stat.setString(1, c.getNome());
            stat.setString(2, c.getSexo());
            stat.setString(3, c.getDataNasc());
            stat.setString(4, c.getCpf());
            stat.setString(5, c.getTelefone());
            stat.setString(6, c.getCep());
            stat.setString(7, c.getCidade());
            stat.setString(8, c.getEndereco());
            stat.setString(9, c.getEmail());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "cadastrado com sucesso", "", JOptionPane.INFORMATION_MESSAGE);
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao inserir" +e, "", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    
    public ArrayList<Clientes> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet resultado = null;
        
        ArrayList <Clientes> arrayClientes = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("SELECT * FROM cliente");
            resultado = stat.executeQuery();
            
            while(resultado.next()){
                Clientes c = new Clientes();
                
                c.setId(resultado.getLong("id"));
                c.setNome(resultado.getString("nome"));
                c.setSexo(resultado.getString("sexo"));
                c.setDataNasc(resultado.getString("datanascimento"));
                c.setCpf(resultado.getString("cpf"));
                c.setTelefone(resultado.getString("telefone"));
                c.setCep(resultado.getString("cep"));
                c.setCidade(resultado.getString("cidade"));
                c.setEndereco(resultado.getString("endereco"));
                c.setEmail(resultado.getString("email"));
                
                arrayClientes.add(c);
            }
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "erro ao ler" +e, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, resultado);
        }
        
        return arrayClientes;      
    }
    
    
    public boolean update(Clientes c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("UPDATE cliente SET nome = ?, sexo = ?, datanascimento = ?, cpf = ?,"
                    + "telefone = ?, cep = ?, cidade = ?, endereco = ?, email = ? WHERE id = ?");
            stat.setString(1, c.getNome());
            stat.setString(2, c.getSexo());
            stat.setString(3, c.getDataNasc());
            stat.setString(4, c.getCpf());
            stat.setString(5, c.getTelefone());
            stat.setString(6, c.getCep());
            stat.setString(7, c.getCidade());
            stat.setString(8, c.getEndereco());
            stat.setString(9, c.getEmail());
            stat.setLong(10, c.getId());
            
            stat.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "atualizado com sucesso", "", JOptionPane.INFORMATION_MESSAGE); 
            return true; 
            
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "erro ao ler" +e, "", JOptionPane.ERROR_MESSAGE);
             return false;
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
        
    }
    
    
    public void delete(Clientes c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        
        try{
            stat = con.prepareStatement("DELETE FROM cliente WHERE id = ?");
            stat.setLong(1, c.getId());
            
            stat.executeUpdate();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "não foi possível excluir" +e, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
}
