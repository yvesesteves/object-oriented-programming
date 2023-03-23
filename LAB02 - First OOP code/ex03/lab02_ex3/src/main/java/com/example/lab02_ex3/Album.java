package com.example.lab02_ex3;

public class Album {
    public static void main(String[] args) {
        Figurinha[] fig = new Figurinha[3];
        fig[0] = new Figurinha();
        fig[0].setNome("Rony");
        fig[0].setPosicao("Atacante");
        fig[0].setPais("Brasil");
        fig[0].setNiver("11/05/1995");
        fig[0].setPeso(65);
        fig[0].setAltura(166);
        fig[0].exibir();

        fig[1] = new Figurinha();
        fig[1].setNome("Neymar");
        fig[1].setPosicao("Atacante");
        fig[1].setPais("Brasil");
        fig[1].setNiver("05/02/1992");
        fig[1].setPeso(78);
        fig[1].setAltura(175);
        fig[1].exibir();

        fig[2] = new Figurinha();
        fig[2].setNome("Weverton");
        fig[2].setPosicao("Goleiro");
        fig[2].setPais("Brasil");
        fig[2].setNiver("13/12/1987");
        fig[2].setPeso(89);
        fig[2].setAltura(189);
        fig[2].exibir();
    }
}