
  
package br.com.ProjetoRaell.dao;

import br.com.ProjetoRaell.jdbc.ConnectionFactory;
import br.com.ProjetoRaell.model.Cliente;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
               
               JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
        
    }
    
    public void editarCliente(Cliente cli){
           try {
            String sql = "update cadastro_cliente set nome=?, telefone=?, cep=?, cidade=?, estado=?, rua=?, quantity=? " + "where id=?";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               stmt.setString(1, cli.getNome());
               stmt.setString(2, cli.getTelefone());
               stmt.setString(3, cli.getCep());
               stmt.setString(4, cli.getCidade());
               stmt.setString(5, cli.getEstado());
               stmt.setString(6, cli.getRua());
               stmt.setInt(7, cli.getQuantity());
               stmt.setInt(8,cli.getId());
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
    }
    
    public void excluirCliente(Cliente cli){
         try {
            String sql = "delete from cadastro_cliente where id = ? ";
               PreparedStatement stmt = con.prepareStatement(sql);
               
               
               stmt.setInt(1,cli.getId());
               
               stmt.execute();
               stmt.close();
               
               JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
            
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Algo aconteceu" + e);

        }
    
    }
        
    
    public List <Cliente> listarClientes(){
        try {
            List<Cliente> clientes = new ArrayList<>();
            
            String sql = "select * from cadastro_cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setId(rs.getInt("id"));
                cli.setNome(rs.getString("nome"));
                cli.setTelefone(rs.getString("telefone"));
                cli.setCep(rs.getString("cep"));
                cli.setCidade(rs.getString("cidade"));
                cli.setEstado(rs.getString("estado"));
                cli.setRua(rs.getString("rua"));
                cli.setQuantity(rs.getInt("quantity"));
                
                clientes.add(cli);
            }
            
            return clientes;
                    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar consulta!" + e);
            return null;
            
        }
    
    }

}
