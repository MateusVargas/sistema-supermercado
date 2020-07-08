package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Fornecedores;

public class FornecedoresTableModel extends AbstractTableModel{
    
    private List<Fornecedores> listaFornecedores;
    private String[] colunas = {"Razão Social", "CNPJ", "Endereço", "Telefone", "Site", "E-mail", "UF", "Cidade"};

    public FornecedoresTableModel() {
        listaFornecedores = new ArrayList<>();
    }
    
    public FornecedoresTableModel(List<Fornecedores> forn){
        this();
        this.listaFornecedores.addAll(forn);
    }
    
    @Override
    public int getRowCount() {
        return listaFornecedores.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Fornecedores f = listaFornecedores.get(linha);
        switch(coluna){
            case 0:
                return f.getRazaoSocial();
            case 1:
                return f.getCnpj();
            case 2:
                return f.getEndereco();
            case 3:
                return f.getTelefone();
            case 4:
                return f.getSite();
            case 5:
                return f.getEmail();
            case 6:
                return f.getEstado();
            case 7:
                return f.getCidade();
                
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Fornecedores getFornecedores(int linha){
        if(linha >= listaFornecedores.size()){
            return null;
        }
        return listaFornecedores.get(linha);
    }

}

