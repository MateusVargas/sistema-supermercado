package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Produtos;

public class ProdutoTableModel extends AbstractTableModel{
    
    private List<Produtos> listaProdutos;
    private String[] colunas = {"Categoria", "Descricao", "Preco custo", "Margem lucro %", "Preco venda", "Fornecedor", "Codigo barras", "Marca"};

    public ProdutoTableModel() {
        listaProdutos = new ArrayList<>();
    }
    
    public ProdutoTableModel(List<Produtos> prod){
        this();
        this.listaProdutos.addAll(prod);
    }
    
    @Override
    public int getRowCount() {
        return listaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Produtos p = listaProdutos.get(linha);
        switch(coluna){
            case 0:
                return p.getCategoria();
            case 1:
                return p.getDescricao();
            case 2:
                return p.getPrecoCusto();
            case 3:
                return p.getMargemLucro();
            case 4:
                return p.getPrecoVenda();
            case 5:
                return p.getFornecedor().getRazaoSocial();
            case 6:
                return p.getCodigoBarras();
            case 7:
                return p.getMarca();
                
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Produtos getProdutos(int linha){
        if(linha >= listaProdutos.size()){
            return null;
        }
        return listaProdutos.get(linha);
    }

}

