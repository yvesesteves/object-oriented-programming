package com.example.lab02_ex4;
public class Figurinha {
    private String  nome, posicao, pais, niver;
    private int altura, peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNiver() {
        return niver;
    }

    public void setNiver(String niver) {
        this.niver = niver;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void exibir(){
        System.out.println("--Figurinha--");
        System.out.println("Nome: " + this.nome);
        System.out.println("Posição: " + this.posicao);
        System.out.println("País: " + this.pais);
        System.out.println("Data de nascimento: " + this.niver);
        System.out.println("Altura(cm): " + this.altura);
        System.out.println("Peso(kg): " + this.peso);
        System.out.println("-------");
        System.out.println("\n");
    }


}


