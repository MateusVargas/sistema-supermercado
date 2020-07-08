package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Fornecedores;
import model.bean.Produtos;
import model.dao.ProdutosDAO;

public class ProdutosController {
    
    public boolean create(/*String categoria, String descricao, double precocusto, double margemlucro, double precovenda,
        String codigobarras, String marca, Fornecedores forn*/Produtos p) throws SQLException{
      //  Produtos prod = new Produtos();
        ProdutosDAO pdao = new ProdutosDAO();
        
     /*   prod.setCategoria(categoria);
        prod.setDescricao(descricao);
        prod.setPrecoCusto(precocusto);
        prod.setMargemLucro(margemlucro);
        prod.setPrecoVenda(precovenda);
        prod.setCodigoBarras(codigobarras);
        prod.setMarca(marca);
     //   prod.setData(data);
    //    prod.getFornecedor().setRazaoSocial(forn.getRazaoSocial());
        prod.setFornecedor(forn);*/
        
        return pdao.create(p);
    }
    
    
    public ArrayList<Produtos> read(){
        ProdutosDAO pdao = new ProdutosDAO();
        return pdao.read();
    }
    
    public boolean update(long id, String categoria, String descricao, double precocusto, double margemlucro, double precovenda,
        String codigobarras, String marca, Fornecedores forn){
        Produtos prod = new Produtos();
        ProdutosDAO pdao = new ProdutosDAO();
        
        prod.setId(id);
        prod.setCategoria(categoria);
        prod.setDescricao(descricao);
        prod.setPrecoCusto(precocusto);
        prod.setMargemLucro(margemlucro);
        prod.setPrecoVenda(precovenda);
        prod.setCodigoBarras(codigobarras);
        prod.setMarca(marca);
        prod.setFornecedor(forn);
        
        return pdao.update(prod);
        
    }
    
    public void delete(Produtos p) throws SQLException{
        ProdutosDAO pdao=new ProdutosDAO();
        
        pdao.delete(p);
    }
    
    public ArrayList <Produtos> getProdutos(String n){
        ProdutosDAO pDAO = new ProdutosDAO();
        return pDAO.getProdutos(n);
    }
    
    public ArrayList <Produtos> ordenarCategoria(){
        ProdutosDAO pDAO = new ProdutosDAO();
        return pDAO.ordenarCategoria();
    }
    
    public ArrayList <Produtos> ordenarPorFornecedor(){
        ProdutosDAO pDAO = new ProdutosDAO();
        return pDAO.ordenarPorFornecedor();
    }
    
    public ArrayList <Produtos> ordenarDescricao(){
        ProdutosDAO pDAO = new ProdutosDAO();
        return pDAO.ordenarDescricao();
    }
    
}
