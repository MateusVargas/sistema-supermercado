package model.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.bean.ItensVenda;
import model.bean.Produtos;

public class ItensVendaDAO {
        Connection con = ConnectionFactory.getConnection();
    
    public boolean insert(long idprod, long idvenda, ItensVenda i) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO itens_venda(\n"
                    + "	idvenda, idproduto, quantidade, valorunitario)\n"
                    + "	VALUES (?, ?, ?, ?)");
            stat.setLong(1, idvenda);
            stat.setLong(2, idprod);
            stat.setInt(3, i.getQtd());
            stat.setDouble(4, i.getValor());

            stat.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao inserir", "", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            ConnectionFactory.closeConnection(con, stat);
        }
    }
    
    public ArrayList<ItensVenda> read(long idvenda){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stat = null;
        ResultSet rs = null;
        
        ArrayList<ItensVenda> array = new ArrayList<>();
        
        try{
            stat = con.prepareStatement("select produto.id, produto.descricao, itens_venda.quantidade, produto.precovenda from produto inner join \n" +
"itens_venda on(produto.id=itens_venda.idproduto) inner join venda \n" +
"on(venda.id=itens_venda.idvenda) where itens_venda.idvenda = ?");
            stat.setLong(1, idvenda);
            rs = stat.executeQuery();
            
            while(rs.next()){
                ItensVenda iv = new ItensVenda();
                iv.setQtd(rs.getInt("quantidade"));
                
                Produtos prod = new Produtos();
                prod.setId(rs.getInt("id"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setPrecoVenda(rs.getDouble("precovenda"));
                
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

     
     
    public boolean delete(long idprod, long idvenda) {
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("DELETE FROM itens_venda WHERE idvenda = ? AND idproduto = ?");
            stat.setLong(1, idvenda);
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
