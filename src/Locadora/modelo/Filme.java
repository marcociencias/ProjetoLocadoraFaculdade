package Locadora.modelo;

import java.util.Objects;

public class Filme {
    Integer id_filme,qtd;
    String duracao,titulo,genero,produtora;
    Double preco;

    public Filme() {

    }



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id_filme);
        hash = 29 * hash + Objects.hashCode(this.qtd);
        hash = 29 * hash + Objects.hashCode(this.duracao);
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.genero);
        hash = 29 * hash + Objects.hashCode(this.produtora);
        hash = 29 * hash + Objects.hashCode(this.preco);
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
        final Filme other = (Filme) obj;
        if (!Objects.equals(this.duracao, other.duracao)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.produtora, other.produtora)) {
            return false;
        }
        if (!Objects.equals(this.id_filme, other.id_filme)) {
            return false;
        }
        if (!Objects.equals(this.qtd, other.qtd)) {
            return false;
        }
        if (!Objects.equals(this.preco, other.preco)) {
            return false;
        }
        return true;
    }
    
    public Integer getId_filme() {
        return id_filme;
    }

    public void setId_filme(Integer id_filme) {
        this.id_filme = id_filme;
    }

    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }



    
    
}
