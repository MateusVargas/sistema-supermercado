package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Estoque;
import model.bean.Produtos;
import model.dao.EstoqueDAO;
import model.dao.ProdutosDAO;

public class EstoqueController {
    public boolean create(Produtos prod, int qtd) throws SQLException{
        Estoque est = new Estoque();
        EstoqueDAO e = new EstoqueDAO();
        
        est.setProduto(prod);
        est.setQtd(qtd);
        
        return e.create(est);
    }
    
    public boolean update(Produtos prod, int qtd) throws SQLException{
        Estoque est = new Estoque();
        EstoqueDAO e = new EstoqueDAO();
        
        est.setProduto(prod);
        est.setQtd(qtd);
        
        return e.update(est);
    }
    
    public ArrayList<Estoque> read(){
        EstoqueDAO e = new EstoqueDAO();
        return e.read();
    }
    
    public void delete(long id) throws SQLException{
        EstoqueDAO e = new EstoqueDAO();
        
        e.delete(id);
    }
    
    public boolean updateQtd(double qtd, Estoque est){
        EstoqueDAO e = new EstoqueDAO();
        return e.updateQuantidade(qtd, est);
    }
    
    public ArrayList <Estoque> getProdutos(String n){
        EstoqueDAO e = new EstoqueDAO();
        return e.getProdutos(n);
    }
    
    public ArrayList <Estoque> ordenarProdutos(){
        EstoqueDAO e = new EstoqueDAO();
        return e.ordenarProdutos();
    }
    
    public ArrayList <Estoque> ordenarPorQtd(){
        EstoqueDAO e = new EstoqueDAO();
        return e.ordenarPorQtd();
    }
}
