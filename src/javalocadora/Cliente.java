/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;


/**
 *
 * @author marco.junior
 */
public class Cliente {

    public Connection con;
    public Statement st;
    public PreparedStatement pst;
    private int cod_cliente;
    private int id_cliente;
    private String Nome,RG,CPF,Data_Nascimento,Rua,Numero,Bairro,CEP,Cidade
    ,Estado,Telefone_fixo,E_mail,Celular_1,Celular_2,Celular_3,Data_cadastro;
    private String pesquisa;
    
 
    /**
     * @return the pesquisa
     */
    public String getPesquisa() {
        return pesquisa;
    }

    /**
     * @param pesquisa the pesquisa to set
     */
    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    
   
   public int getId_cliente()
   {
       return id_cliente;
   }
   
   public void setId_cliente(int id_cliente)
   {
       this.id_cliente = id_cliente;
   }
   
    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getData_Nascimento() {
        return Data_Nascimento;
    }

    public void setData_Nascimento(String Data_Nascimento) {
        this.Data_Nascimento = Data_Nascimento;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTelefone_fixo() {
        return Telefone_fixo;
    }

    public void setTelefone_fixo(String Telefone_fixo) {
        this.Telefone_fixo = Telefone_fixo;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getCelular_1() {
        return Celular_1;
    }

    public void setCelular_1(String Celular_1) {
        this.Celular_1 = Celular_1;
    }

    public String getCelular_2() {
        return Celular_2;
    }

    public void setCelular_2(String Celular_2) {
        this.Celular_2 = Celular_2;
    }

    public String getCelular_3() {
        return Celular_3;
    }

    public void setCelular_3(String Celular_3) {
        this.Celular_3 = Celular_3;
    }

    public String getData_cadastro() {
        return Data_cadastro;
    }

    public void setData_cadastro(String Data_cadastro) {
        this.Data_cadastro = Data_cadastro;
    }
   
}
