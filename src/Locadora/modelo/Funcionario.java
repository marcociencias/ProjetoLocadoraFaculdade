/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.modelo;

import java.sql.Blob;
import java.util.Objects;

public class Funcionario {
    Integer Id_func;
    String nome,rg,cpf,rua,num,bairro,cep,cidade,estado,tel_fixo,email,celular1,celular2,celular3,idade,num_cart,serie,Data_cad,Data_nasc;

    public String getData_cad() {
        return Data_cad;
    }

    public void setData_cad(String Data_cad) {
        this.Data_cad = Data_cad;
    }

    public String getData_nasc() {
        return Data_nasc;
    }

    public void setData_nasc(String Data_nasc) {
        this.Data_nasc = Data_nasc;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.Id_func);
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.rg);
        hash = 61 * hash + Objects.hashCode(this.cpf);
        hash = 61 * hash + Objects.hashCode(this.rua);
        hash = 61 * hash + Objects.hashCode(this.num);
        hash = 61 * hash + Objects.hashCode(this.bairro);
        hash = 61 * hash + Objects.hashCode(this.cep);
        hash = 61 * hash + Objects.hashCode(this.cidade);
        hash = 61 * hash + Objects.hashCode(this.estado);
        hash = 61 * hash + Objects.hashCode(this.tel_fixo);
        hash = 61 * hash + Objects.hashCode(this.email);
        hash = 61 * hash + Objects.hashCode(this.celular1);
        hash = 61 * hash + Objects.hashCode(this.celular2);
        hash = 61 * hash + Objects.hashCode(this.celular3);
        hash = 61 * hash + Objects.hashCode(this.idade);
        hash = 61 * hash + Objects.hashCode(this.num_cart);
        hash = 61 * hash + Objects.hashCode(this.serie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.num, other.num)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.tel_fixo, other.tel_fixo)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.celular1, other.celular1)) {
            return false;
        }
        if (!Objects.equals(this.celular2, other.celular2)) {
            return false;
        }
        if (!Objects.equals(this.celular3, other.celular3)) {
            return false;
        }
        if (!Objects.equals(this.idade, other.idade)) {
            return false;
        }
        if (!Objects.equals(this.num_cart, other.num_cart)) {
            return false;
        }
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        if (!Objects.equals(this.Id_func, other.Id_func)) {
            return false;
        }
        return true;
    }

    public Integer getId_func() {
        return Id_func;
    }

    public void setId_func(Integer Id_func) {
        this.Id_func = Id_func;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTel_fixo() {
        return tel_fixo;
    }

    public void setTel_fixo(String tel_fixo) {
        this.tel_fixo = tel_fixo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getCelular3() {
        return celular3;
    }

    public void setCelular3(String celular3) {
        this.celular3 = celular3;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getNum_cart() {
        return num_cart;
    }

    public void setNum_cart(String num_cart) {
        this.num_cart = num_cart;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    
}
