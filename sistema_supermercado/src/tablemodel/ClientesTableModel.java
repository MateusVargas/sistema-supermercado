package tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.bean.Clientes;

public class ClientesTableModel extends AbstractTableModel{
    
    private List<Clientes> listaClientes;
    private String[] colunas = {"Nome", "Sexo", "CPF", "Endereço", "Celular", "CEP", "Data Nasc.", "Cidade", "E-mail"};

    public ClientesTableModel() {
        listaClientes = new ArrayList<>();
    }
    
    public ClientesTableModel(List<Clientes> cli){
        this();
        this.listaClientes.addAll(cli);
    }
    
    @Override
    public int getRowCount() {
        return listaClientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        Clientes c = listaClientes.get(linha);
        switch(coluna){
            case 0:
                return c.getNome();
            case 1:
                return c.getSexo();
            case 2:
                return c.getCpf();
            case 3:
                return c.getEndereco();
            case 4:
                return c.getTelefone();
            case 5:
                return c.getCep();
            case 6:
                return c.getDataNasc();
            case 7:
                return c.getCidade();
            case 8:
                return c.getEmail();
                
            default:
                return "";                   
        }
    }
    
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    
    
    public Clientes getClientes(int linha){
        if(linha >= listaClientes.size()){
            return null;
        }
        return listaClientes.get(linha);
    }

}

