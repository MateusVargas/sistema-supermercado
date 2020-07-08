package model.dao;

import conexao.ConnectionFactory;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.Produtos;
import model.bean.Usuario;
import view.ViewPrincipal;

public class UsuarioDAO {

    Connection con = ConnectionFactory.getConnection();

    public boolean create(Usuario user) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        PreparedStatement stat = null;
        PreparedStatement verifica = null;
        ResultSet rs = null;
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(user.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
            }
            String senhaCriptografada = sb.toString();
            
            
            ArrayList<Usuario> array = new ArrayList<>();

            verifica = con.prepareStatement("SELECT * FROM usuario");
            rs = verifica.executeQuery();
            
            while(rs.next()){
                Usuario u = new Usuario();
                u.setNomeUsuario(rs.getString("usuario"));
                array.add(u);
            }
            
            stat = con.prepareStatement("INSERT INTO usuario (usuario, senha) VALUES (?,?)");
            stat.setString(1, user.getNomeUsuario());
            stat.setString(2, senhaCriptografada);

            if(array.size()>-1){
            for(int i=0; i<array.size(); i++){
                if(array.get(i).getNomeUsuario().equals(user.getNomeUsuario())){
                    JOptionPane.showMessageDialog(null, "já existe um usuário com esse nome", "", JOptionPane.ERROR_MESSAGE);
                    throw new SQLException();

                     }
                }

            }
            
            stat.executeUpdate();
              
            return true;
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao adicionar usuário" + ex, "", JOptionPane.ERROR_MESSAGE);
            return false;

        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }

    }

    public boolean verificaUsuario(Usuario u) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(u.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
            }
            String senhaCriptografada = sb.toString();
            
            
            stat = con.prepareStatement("SELECT usuario, senha FROM usuario WHERE usuario = ? AND senha = ?");
            stat.setString(1, u.getNomeUsuario());
            stat.setString(2, senhaCriptografada);

            rs = stat.executeQuery();

            if (rs.next()) {

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + ex, "", JOptionPane.ERROR_MESSAGE);
            return false;

        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
        return false;
    }
    
    
    public boolean verificaExiste(Usuario u){
        PreparedStatement stat = null;
        ResultSet rs = null;

        try {
            stat = con.prepareStatement("SELECT usuario FROM usuario WHERE usuario = ?");
            stat.setString(1, u.getNomeUsuario());

            rs = stat.executeQuery();

            if (rs.next()) {

                return true;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao salvar no banco de dados" + ex, "", JOptionPane.ERROR_MESSAGE);
            return false;

        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
        return false;
    }
    
    
    public boolean alterarSenha(Usuario u) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        PreparedStatement stat = null;
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte messageDigest[] = md.digest(u.getSenha().getBytes("UTF-8"));
            
            StringBuilder sb = new StringBuilder();
            for(byte b : messageDigest){
                sb.append(String.format("%02X", 0xFF & b));
            }
            String senhaCriptografada = sb.toString();
            
            stat = con.prepareStatement("UPDATE usuario SET senha = ? WHERE usuario = ?");
            stat.setString(1, senhaCriptografada);
            stat.setString(2, u.getNomeUsuario());
            
            stat.executeUpdate();
              
            return true;
     
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao adicionar usuário" + ex, "", JOptionPane.ERROR_MESSAGE);
            return false;

        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }

}
