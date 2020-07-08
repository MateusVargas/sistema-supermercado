package model.bean;

public class Estoque {
    private Produtos produto;
    private int qtd;

    public Estoque() {
    }

    public Produtos getProduto() {
        return produto;
    }

    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }   
    
    @Override
    public String toString(){
        return this.getProduto().getDescricao();
    }
}
