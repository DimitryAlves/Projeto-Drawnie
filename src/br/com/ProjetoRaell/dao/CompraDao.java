
package br.com.ProjetoRaell.dao;

import br.com.ProjetoRaell.jdbc.ConnectionFactory;
import br.com.ProjetoRaell.model.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
}
