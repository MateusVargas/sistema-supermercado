package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.ItensVenda;

public class ItensVendaTableModel extends AbstractTableModel{
    
    private List<ItensVenda> listaItensVenda;
    private String[] colunas = {"Produto", "Quantidade", "Total"};

    public ItensVendaTableModel() {
        listaItensVenda = new ArrayList<>();
    }
    
    public ItensVendaTableModel(List<ItensVenda> iv){
        this();
        this.listaItensVenda.addAll(iv);
    }
    
    @Override
    public int getRowCount() {
        return listaItensVenda.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        ItensVenda ivv = listaItensVenda.get(linha);
        switch(coluna){
            case 0:
                return ivv.getProduto().getDescricao();
            case 1:
                return ivv.getQtd();
            case 2:
                return ivv.getProduto().getPrecoVenda() * ivv.getQtd();
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public ItensVenda getItensVenda(int linha){
        if(linha >= listaItensVenda.size()){
            return null;
        }
        return listaItensVenda.get(linha);
    }

}


