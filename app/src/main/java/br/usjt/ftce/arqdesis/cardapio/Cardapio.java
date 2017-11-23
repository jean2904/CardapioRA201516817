package br.usjt.ftce.arqdesis.cardapio;

/**
 * Created by jeanl on 22/11/2017.
 */

import java.io.Serializable;

public class Cardapio implements Serializable, Comparable<Cardapio> {
    private int id;
    private String nome;
    private String detalhe;
    private String ingrediente;
    private String imagem;

    public Cardapio(int id, String nome, String detalhe, String ingrediente, String imagem) {
        this.id          = id;
        this.nome        = nome;
        this.detalhe     = detalhe;
        this.ingrediente = ingrediente;
        this.imagem      = imagem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDetalhe() { return detalhe; }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {  this.ingrediente = ingrediente;  }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Cardapio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", detalhe='" + detalhe + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", imagem='" + imagem + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cardapio c) {
        return this.nome.compareTo(c.getNome());
    }

    public String getFoto() {
        return getImagem();
    }
}
