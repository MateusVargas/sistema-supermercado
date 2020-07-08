package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Estoque;

public class EstoqueTableModel extends AbstractTableModel{
    
    private List<Estoque> listaEstoque;
    private String[] colunas = {"Produto", "Quantidade", "Preco venda"};

    public EstoqueTableModel() {
        listaEstoque = new ArrayList<>();
    }
    
    public EstoqueTableModel(List<Estoque> forn){
        this();
        this.listaEstoque.addAll(forn);
    }
    
    @Override
    public int getRowCount() {
        return listaEstoque.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Estoque est = listaEstoque.get(linha);
        switch(coluna){
            case 0:
                return est.getProduto().getDescricao();
            case 1:
                return est.getQtd();
            case 2:
                return est.getProduto().getPrecoVenda();
                
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Estoque getEstoque(int linha){
        if(linha >= listaEstoque.size()){
            return null;
        }
        return listaEstoque.get(linha);
    }

}


