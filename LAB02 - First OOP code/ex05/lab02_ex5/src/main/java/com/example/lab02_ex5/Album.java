package com.example.lab02_ex5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Album {
    public static void main(String[] args) {
        Selecao[] sel = new Selecao[2];
        sel[0] = new Selecao("Brasileira", "Tite");
        sel[0].nomeJogador[0] = "Weverton";
        sel[0].nomeJogador[1] = "Danilo";
        sel[0].nomeJogador[2] = "Marquinhos";
        sel[0].nomeJogador[3] = "Thiago Silva";
        sel[0].nomeJogador[4] = "Alex Sandro";
        sel[0].nomeJogador[5] = "Casemiro";
        sel[0].nomeJogador[6] = "Fred";
        sel[0].nomeJogador[7] = "Paquetá";
        sel[0].nomeJogador[8] = "Neymar";
        sel[0].nomeJogador[9] = "Richarlison";
        sel[0].nomeJogador[10] = "Vinicius Jr.";
        sel[0].mostraSelecao();

        sel[1] = new Selecao("Argentina", "Scaloni");
        sel[1].nomeJogador[0] = "Martinez";
        sel[1].nomeJogador[1] = "Molina";
        sel[1].nomeJogador[2] = "Otamendi";
        sel[1].nomeJogador[3] = "Romero";
        sel[1].nomeJogador[4] = "Acuña";
        sel[1].nomeJogador[5] = "De Paul";
        sel[1].nomeJogador[6] = "Enzo Fernandez";
        sel[1].nomeJogador[7] = "Mac Allistar";
        sel[1].nomeJogador[8] = "Messi";
        sel[1].nomeJogador[9] = "Julian Alvarez";
        sel[1].nomeJogador[10] = "Dí Maria";
        sel[1].mostraSelecao();


        /*
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

         */
    }
}