package br.fecapads.projetoaula06;

import java.io.Serializable;

public class Pet implements Serializable {
    private String nome;
    private int idade;
    private String aniversario;
    private String raca;
    private String cor;
    private int imagemResId;

    public Pet(String nome, int idade, String aniversario, String raca, String cor, int imagemResId) {
        this.nome = nome;
        this.idade = idade;
        this.aniversario = aniversario;
        this.raca = raca;
        this.cor = cor;
        this.imagemResId = imagemResId;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getAniversario() { return aniversario; }
    public String getRaca() { return raca; }
    public String getCor() { return cor; }
    public int getImagemResId() { return imagemResId; }
}
