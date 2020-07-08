package model.bean;

import model.bean.Fornecedores;

public class Compra {
    private long id;
    private String notafiscal;
    private String data;
    private Fornecedores forn;

    public Compra() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
    }

    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Fornecedores getForn() {
        return forn;
    }

    public void setForn(Fornecedores forn) {
        this.forn = forn;
    }
    
    @Override
    public String toString(){
        return this.getNotafiscal();
    }
}

