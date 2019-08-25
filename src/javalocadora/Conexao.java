/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author marco.junior
 */
public class Conexao {

public Connection con;
public Statement st;
public ResultSet rs;
public PreparedStatement pst;

    public void conexao ()
    {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaDeLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DriverManager.getConnection("jdbc:sqlserver://localhost\\NPNBMJUNIOR:1433;databaseName=AULA","sa","spnsw2002");
            st = con.createStatement();
            JOptionPane.showMessageDialog(null,"Conexão com Banco de Dados realizada com sucesso");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Conexão Mau sucedida");
        }
   
    }
   public void desconecta()
   {
       try
       {
           con.close();
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Erro ao realizar interação com o banco : " + e);
       }
   }
  
}
