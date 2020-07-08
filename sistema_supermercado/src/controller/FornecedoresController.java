package controller;

import java.util.ArrayList;
import model.bean.Fornecedores;
import model.dao.FornecedoresDAO;

public class FornecedoresController {
    
    public boolean create(String razao, String cnpj, String email, String endereco, String estado, String cidade, String site, String telefone) {
        Fornecedores forn = new Fornecedores();
        FornecedoresDAO fDAO = new FornecedoresDAO();
        
        forn.setRazaoSocial(razao);
        forn.setCnpj(cnpj);
        forn.setEmail(email);
        forn.setEndereco(endereco);
        forn.setEstado(estado);
        forn.setCidade(cidade);
        forn.setSite(site);
        forn.setTelefone(telefone);
        
        return fDAO.create(forn);
    }
    
    public ArrayList<Fornecedores> read(){
        FornecedoresDAO fDAO = new FornecedoresDAO();
        return fDAO.read();
    }
    
    public void update(long id, String razao, String cnpj, String email, String endereco, String estado, String cidade, String site, String telefone){
        Fornecedores forn = new Fornecedores();
        FornecedoresDAO fDAO = new FornecedoresDAO();
        
        forn.setId(id);
        forn.setRazaoSocial(razao);
        forn.setCnpj(cnpj);
        forn.setEmail(email);
        forn.setEndereco(endereco);
        forn.setEstado(estado);
        forn.setCidade(cidade);
        forn.setSite(site);
        forn.setTelefone(telefone);
        
        fDAO.update(forn);   
    }
    
    public void delete(Fornecedores f){
        FornecedoresDAO fDAO = new FornecedoresDAO();
        fDAO.delete(f);
    }
    
    
    public ArrayList <Fornecedores> ordenarRazaoSocial(){
        FornecedoresDAO fcDAO = new FornecedoresDAO();
        return fcDAO.ordenarRazaoSocial();
    }
    
    public ArrayList <Fornecedores> ordenarPorEstado(){
        FornecedoresDAO fcDAO = new FornecedoresDAO();
        return fcDAO.ordenarPorEstado();
    }
    
    public ArrayList <Fornecedores> ordenarPorCidade(){
        FornecedoresDAO fcDAO = new FornecedoresDAO();
        return fcDAO.ordenarPorCidade();
    }
   
    public ArrayList<Fornecedores> getForn(String ch){
        FornecedoresDAO fDAO = new FornecedoresDAO();
        return fDAO.getFornecedores(ch);
    }
}
