package Conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Conexao {

 public Connection getConexao(){
   System.out.println("Conectado ao Banco de Dados");
   
   try{
     return      
     DriverManager.getConnection("jdbc:mysql://localhost/Aula","root","");
   }catch(SQLException e){
     throw new RuntimeException(e);
       
     
    }
   }
    public  static void main(String[]args){
      new Conexao().getConexao();
        System.out.println("Conexão Criada com Sucesso");
    }

}
