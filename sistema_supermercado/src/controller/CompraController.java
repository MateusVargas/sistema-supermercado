package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.bean.Compra;
import model.bean.Fornecedores;
import model.dao.CompraDAO;

public class CompraController {

public boolean insert(String nf, String data, Fornecedores forn) throws SQLException{
        Compra c = new Compra();
        CompraDAO cd = new CompraDAO();
        
        c.setNotafiscal(nf);
        c.setData(data);
        c.setForn(forn);
        
        return cd.create(c);
    }


    public long read(){
        CompraDAO cd = new CompraDAO();
        return cd.read();
    }
}

    