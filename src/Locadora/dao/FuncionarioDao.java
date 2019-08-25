/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.dao;

import Locadora.modelo.Cliente;
import Conection.Conexao;
import Locadora.modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class FuncionarioDao {
        private Connection conection;
    public FuncionarioDao(){
        this.conection =  new Conexao().getConexao();
    }
    public void Adiciona(Funcionario c){
     String SQL = "insert into Funcionario (nome,cpf,cep,bairro,celular1,celular2,celular3,cidade,data_cad,data_nasc,email,estado,numero,rg,rua,telefone,num_cart,serie)"
			+"values ( ?, ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ,  ? , ? );";
            

//"insert into Funcionario (nome,cpf,cep,bairro,celular1,celular2,celular3,cidade,data_cad,data_nasc,email,estado,numero,rg,rua,tel_fixo,num_cart,serie)"
                    //  + " values ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? );" ;
        
    
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
            stmt.setString(17, c.getNum_cart());
            stmt.setString(18, c.getSerie());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {

            throw new RuntimeException(e);
            
        }
    }
    public void Consulta(String campo, String inf, Funcionario c, javax.swing.JLabel l) {
        try {
               PreparedStatement stmt = this.conection.prepareStatement(
              "select*from Fucionario where "+ campo +" like '"+ inf + "'");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setCep(rs.getString("cep"));
               c.setBairro(rs.getString("bairro"));
                c.setCelular1(rs.getString("celular1"));
                c.setCelular2(rs.getString("celular2"));
                c.setCelular3(rs.getString("celular3"));
                c.setCidade(rs.getString("cidade"));
                c.setData_cad(rs.getString("data_cad"));
                c.setData_nasc(rs.getString("data_nasc"));
                c.setEmail(rs.getString("email"));
                c.setEstado(rs.getString("estado"));
                c.setNum(rs.getString("numero"));
                c.setRg(rs.getString("rg"));
                c.setRua(rs.getString("rua"));
                c.setTel_fixo(rs.getString("telefone"));
                c.setId_func(rs.getInt("id_func"));
                c.setNum_cart(rs.getString("num_cart"));
                c.setSerie(rs.getString("serie"));
            
            }
            rs.close();
            stmt.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);            
        }
    }
    public void remove(Funcionario c) {
        try {
            PreparedStatement stmt = conection
                    .prepareStatement("delete from funcionario where id_func=?");
            stmt.setInt(1, c.getId_func());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
    }
    public void Alterar(Funcionario c) {

        String sql = "update Funcionario set nome=?,cpf=?,cep=?,bairro=?,celular1=?,celular2=?,celular3=?,cidade=?,data_cad=?,data_nasc=?,email=?,estado=?,numero=?,rg=?,rua=?,telefone=?,id_func=?,num_cart,serie;";
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
            stmt.setInt(17 , c.getId_func());
            stmt.setString(18, c.getNum_cart());
            stmt.setString(19, c.getSerie());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL " + e);
            throw new RuntimeException(e);
        }
      }
}
