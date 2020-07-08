package controller;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

public class UsuarioController {
    
    public boolean create(String nome, String senha) throws UnsupportedEncodingException, NoSuchAlgorithmException{
        Usuario us = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        
        us.setNomeUsuario(nome);
        us.setSenha(senha);

        return udao.create(us);
    }
    
    public boolean read(String nome, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        Usuario u = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        
        u.setNomeUsuario(nome);
        u.setSenha(senha);
        
        return udao.verificaUsuario(u);
    }
    
    public boolean verifica(String nome){
        Usuario u = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        
        u.setNomeUsuario(nome);
        
        return udao.verificaExiste(u);
    }
    
    public boolean alterarSenha(String nome, String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        Usuario u = new Usuario();
        UsuarioDAO udao = new UsuarioDAO();
        
        u.setNomeUsuario(nome);
        u.setSenha(senha);
        
        return udao.alterarSenha(u);
    }
    
}