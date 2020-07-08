package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.ItensCompra;

public class ItensCompraTableModel extends AbstractTableModel{
    
    private List<ItensCompra> listaItensCompra;
    private String[] colunas = {"Produto", "Preço custo"};

    public ItensCompraTableModel() {
        listaItensCompra = new ArrayList<>();
    }
    
    public ItensCompraTableModel(List<ItensCompra> ic){
        this();
        this.listaItensCompra.addAll(ic);
    }
    
    @Override
    public int getRowCount() {
        return listaItensCompra.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        ItensCompra icc = listaItensCompra.get(linha);
        switch(coluna){
            case 0:
                return icc.getProduto().getDescricao();
            case 1:
                return icc.getProduto().getPrecoCusto();

            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public ItensCompra getItensCompra(int linha){
        if(linha >= listaItensCompra.size()){
            return null;
        }
        return listaItensCompra.get(linha);
    }

}



