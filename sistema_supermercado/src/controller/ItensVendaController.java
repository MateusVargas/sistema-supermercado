package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Venda;
import model.bean.ItensVenda;
import model.bean.Produtos;
import model.dao.ItensVendaDAO;

public class ItensVendaController {

    public boolean insert(long idprod, long idvenda, int qtd, double valor) throws SQLException{
        ItensVenda i = new ItensVenda();
        i.setQtd(qtd);
        i.setValor(valor);
        
        ItensVendaDAO id = new ItensVendaDAO();
        return id.insert(idprod, idvenda, i);
    }
    
    public ArrayList<ItensVenda> read(long idvenda){
        ItensVendaDAO id = new ItensVendaDAO();
        return id.read(idvenda);
    }
    
    
    public boolean delete(long idprod, long idvenda){
        ItensVendaDAO idv = new ItensVendaDAO();
        return idv.delete(idprod, idvenda);
    }
}
