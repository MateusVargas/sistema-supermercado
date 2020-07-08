package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Compra;
import model.bean.ItensCompra;
import model.bean.Produtos;
import model.dao.ItensCompraDAO;

public class ItensCompraController {
    public boolean insert(Produtos p, long idcompra, double valor) throws SQLException{
        ItensCompra i = new ItensCompra();
        i.setProduto(p);
        i.setValor(valor);
        
        ItensCompraDAO id = new ItensCompraDAO();
        return id.insert(i, idcompra);
    }
    
    public ArrayList<ItensCompra> read(long idcompra){
        ItensCompraDAO id = new ItensCompraDAO();
        return id.read(idcompra);
    }   
    
    public boolean delete(long idprod, long idcompra){
        ItensCompraDAO idv = new ItensCompraDAO();
        return idv.delete(idprod, idcompra);
    }
}
