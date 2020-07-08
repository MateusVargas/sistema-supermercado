package controller;

import java.util.ArrayList;
import model.bean.Clientes;
import model.dao.ClientesDAO;

public class ClientesController {
    public boolean create(String nome,String sexo,String data,String cpf,String fone,String cep,String cidade,String endereco,String email){
        Clientes c = new Clientes();
        ClientesDAO cd = new ClientesDAO();
        
        c.setNome(nome);
        c.setSexo(sexo);
        c.setDataNasc(data);
        c.setCpf(cpf);
        c.setTelefone(fone);
        c.setCep(cep);
        c.setCidade(cidade);
        c.setEndereco(endereco);
        c.setEmail(email);
        
        return cd.create(c);
    }
    
    
    public ArrayList<Clientes> read(){
        ClientesDAO cdao = new ClientesDAO();
        
        return cdao.read();       
    }
    
    
    public boolean update(long id, String nome,String sexo,String data,String cpf,String fone,String cep,String cidade,String endereco,String email){
        Clientes c = new Clientes();
        ClientesDAO cd = new ClientesDAO();
        
        c.setId(id);
        c.setNome(nome);
        c.setSexo(sexo);
        c.setDataNasc(data);
        c.setCpf(cpf);
        c.setTelefone(fone);
        c.setCep(cep);
        c.setCidade(cidade);
        c.setEndereco(endereco);
        c.setEmail(email);
        
        return cd.update(c);
    }
    
    
    public void delete(long id){
        Clientes c = new Clientes();
        ClientesDAO cd = new ClientesDAO();
        
        c.setId(id);
        
        cd.delete(c);
        
    }
    
}
