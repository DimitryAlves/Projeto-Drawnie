
  
package br.com.ProjetoRaell.dao;

import br.com.ProjetoRaell.jdbc.ConnectionFactory;
import br.com.ProjetoRaell.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ClienteDao {
    private Connection con;
    
    public ClienteDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public void salvarCliente(Cliente cli){
        try {
            String sql = "insert into cadastro_cliente(nome, telefone, cep , cidade, estado, rua, quantity)"
                    + " values (?, ?, ?, ? ,?, ?, ?)";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               stmt.setString(1, cli.getNome());
               stmt.setString(2, cli.getTelefone());
               stmt.setString(3, cli.getCep());
               stmt.setString(4, cli.getCidade());
               stmt.setString(5, cli.getEstado());
               stmt.setString(6, cli.getRua());
               stmt.setInt(7, cli.getQuantity());
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
        
    }
}
