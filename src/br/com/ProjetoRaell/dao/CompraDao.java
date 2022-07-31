
package br.com.ProjetoRaell.dao;

import br.com.ProjetoRaell.jdbc.ConnectionFactory;
import br.com.ProjetoRaell.model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class CompraDao {
    private Connection con;
    
    public CompraDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarCompra(Compra comp){
        try {
            String sql = "insert into cadastro_compra(flavor, shape, quantity)"
                    + " values (?, ?, ?)";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               stmt.setString(1, comp.getFlavor());
               stmt.setString(2, comp.getShape());
               stmt.setInt(3, comp.getQuantity() );
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Compra realizada com sucesso");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
        
    }
    
    public void editarCompra(Compra comp){
           try {
            String sql = "update cadastro_compra set shape=?, quantity=? " + "where flavor=?";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               stmt.setString(1, comp.getShape());
               stmt.setInt(2, comp.getQuantity());
                stmt.setString(3, comp.getFlavor());
               
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Compra alterada com sucesso!");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
    }
    
    public void excluirCompra(Compra comp){
         try {
            String sql = "delete from cadastro_compra where flavor = ? ";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               
               stmt.setString(1,comp.getFlavor());
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Compra excluída com sucesso!");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
    
    }
    public List <Compra> listarCompras(){
        try {
            List<Compra> compras = new ArrayList<>();
            
            String sql = "select * from cadastro_compra";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){              
                Compra comp = new Compra();
                
                comp.setFlavor(rs.getString("flavor"));
                comp.setShape(rs.getString("shape"));
                comp.setQuantity(rs.getInt("quantity"));
                
                compras.add(comp);
            }
            
            return compras;
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta!" + e);
            return null;
            
        }
    
    }
}
