package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.ItensCompra;
import model.bean.Produtos;

public class ItensCompraDAO {
    
    Connection con = ConnectionFactory.getConnection();
    
    public boolean insert(ItensCompra i, long idcompra) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO itens_compra(\n"
                    + "	idcompra, idproduto, valor)\n"
                    + "	VALUES (?, ?, ?)");
            stat.setLong(1, idcompra);
            stat.setLong(2, i.getProduto().getId());
            stat.setDouble(3, i.getValor());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir, produto já consta no banco de dados", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    
    public ArrayList<ItensCompra> read(long idcompra){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        ArrayList<ItensCompra> array = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id, produto.descricao, itens_compra.valor, produto.precocusto from produto inner join \n" +
"itens_compra on(produto.id=itens_compra.idproduto) inner join compra \n" +
"on(compra.id=itens_compra.idcompra) where itens_compra.idcompra = ?");
            stat.setLong(1, idcompra);
            rs = stat.executeQuery();
            
            while(rs.next()){
                ItensCompra iv = new ItensCompra();
                iv.setValor(rs.getInt("valor"));
                
                Produtos prod = new Produtos();
                prod.setId(rs.getInt("id"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPrecoCusto(rs.getDouble("precocusto"));
                
                iv.setProduto(prod);
                array.add(iv);
            }
            
        }catch(SQLException w){
            JOptionPane.showMessageDialog(null, "erro ao ler" +w, "", JOptionPane.ERROR_MESSAGE);
        }finally{
            ConnectionFactory.closeConnection(con, stat, rs);
        }
        
        return array;
    }
    
    public boolean delete(long idprod, long idcompra) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("DELETE FROM itens_compra WHERE idcompra = ? AND idproduto = ?");
            stat.setLong(1, idcompra);
            stat.setLong(2, idprod);

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao excluir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }
     
}
