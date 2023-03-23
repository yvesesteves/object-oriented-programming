package com.example.lab02_ex1;

public class Figurinha {
    public String  nome, posicao, pais, niver;
    public int altura, peso;

    void exibir(){
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
