package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Venda;
import model.bean.Clientes;
import model.dao.VendaDAO;

public class VendaController {
    public boolean insert(String data, String notafiscal, double valor) throws SQLException{
        Venda v = new Venda();
        VendaDAO cd = new VendaDAO();
        
        v.setData(data);
        v.setNotafiscal(notafiscal);
        v.setValorTotal(valor);
        
        return cd.create(v);
    }

    public boolean update(long id, double valor) throws SQLException{
        Venda v = new Venda();
        VendaDAO cd = new VendaDAO();
        
        v.setId(id);
        v.setValorTotal(valor);
        
        return cd.update(v);
    }


    public int read(){
        VendaDAO cd = new VendaDAO();
        return cd.read();
    }
}
