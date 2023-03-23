package com.example.lab02_ex2;

public class Album {
    public static void main(String[] args) {
        Figurinha f1 = new Figurinha();
        f1.setNome("Rony");
        f1.setPosicao("Atacante");
        f1.setPais("Brasil");
        f1.setNiver("11/05/1995");
        f1.setPeso(65);
        f1.setAltura(166);
        f1.exibir();

        Figurinha f2 = new Figurinha();
        f2.setNome("Neymar");
        f2.setPosicao("Atacante");
        f2.setPais("Brasil");
        f2.setNiver("05/02/1992");
        f2.setPeso(78);
        f2.setAltura(175);
        f2.exibir();

        Figurinha f3 = new Figurinha();
        f3.setNome("Weverton");
        f3.setPosicao("Goleiro");
        f3.setPais("Brasil");
        f3.setNiver("13/12/1987");
        f3.setPeso(89);
        f3.setAltura(189);
        f3.exibir();
    }
}