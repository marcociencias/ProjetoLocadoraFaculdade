package Locadora.dao;

import Locadora.modelo.Cliente;
import Conection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClienteDao {
    
    private Connection conection;
    
    public ClienteDao(){
        this.conection =  new Conexao().getConexao();
    }
    public void Adiciona(Cliente c){
        String SQL = "insert into Cliente (nome,cpf,cep,bairro,celular1,celular2,celular3,cidade,data_cad,data_nasc,email,estado,numero,rg,rua,telefone)"
                      + " values ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? );" ;
     
        try {
            PreparedStatement stmt = conection.prepareStatement(SQL);
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getCep());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getCelular1());
            stmt.setString(6, c.getCelular2());
            stmt.setString(7, c.getCelular3());
            stmt.setString(8, c.getCidade());
            stmt.setString(9, c.getData_cad());
            stmt.setString(10, c.getData_nasc());
            stmt.setString(11, c.getEmail());
            stmt.setString(12, c.getEstado());
            stmt.setString(13, c.getNum());
            stmt.setString(14, c.getRg());
            stmt.setString(15, c.getRua());
            stmt.setString(16, c.getTel_fixo());
            
            
            stmt.execute();
            
            stmt.close();
        } catch (SQLException e) {

            throw new RuntimeException(e);
            
        }
    }
    public void Consulta(String campo, String inf, Cliente c, javax.swing.JLabel l) {
        try {
               PreparedStatement stmt = this.conection.prepareStatement(
              "select*from Cliente where "+ campo +" like '"+ inf + "'");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setCep(rs.getString("cep"));
                c.setBairro(rs.getString("bairro"));
                c.setCelular1(rs.getString("celular1"));
                c.setCelular2(rs.getString("celular2"));
                c.setCelular3(rs.getString("celular3"));
                c.setCep(rs.getString("cep"));
                c.setCidade(rs.getString("cidade"));
                c.setData_cad(rs.getString("data_cad"));
                c.setData_nasc(rs.getString("data_nasc"));
                c.setEmail(rs.getString("email"));
                c.setEstado(rs.getString("estado"));
                c.setNum(rs.getString("numero"));
                c.setRg(rs.getString("rg"));
                c.setRua(rs.getString("rua"));
                c.setTel_fixo(rs.getString("telefone"));
                c.setId(rs.getInt("id_cliente"));
            }
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);            
        }
    }
    public void remove(Cliente c) {
        try {
            PreparedStatement stmt = conection
                    .prepareStatement("delete from Cliente where id_cliente=?");
            stmt.setInt(1, c.getId());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public void Alterar(Cliente c) {

        String sql = "update Cliente set nome=?,cpf=?,cep=?,bairro=?,celular1=?,celular2=?,celular3=?,cidade=?,data_cad=?,data_nasc=?,email=?,estado=?,numero=?,rg=?,rua=?,telefone=?,id_cliente=?;";
        try {
            PreparedStatement stmt = conection.prepareStatement(sql);
            stmt.setString(1, c.getNome()); 
            stmt.setString(2, c.getCpf());
            stmt.setString(3, c.getCep());
            stmt.setString(4, c.getBairro());
            stmt.setString(5, c.getCelular1());
            stmt.setString(6, c.getCelular2());
            stmt.setString(7, c.getCelular3());
            stmt.setString(8, c.getCidade());
            stmt.setString(9, c.getData_cad());
            stmt.setString(10, c.getData_nasc());
            stmt.setString(11, c.getEmail());
            stmt.setString(12, c.getEstado());
            stmt.setString(13, c.getNum());
            stmt.setString(14, c.getRg());
            stmt.setString(15, c.getRua());
            stmt.setString(16, c.getTel_fixo());
            stmt.setInt(17 , c.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
      }
    }

