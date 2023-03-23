package com.example.lab02_ex1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Album{
    public static void main(String[] args) {
        Figurinha f1 = new Figurinha();
        f1.nome = "Rony";
        f1.posicao = "Atacante";
        f1.pais = "Brasil";
        f1.niver = "11/05/1995";
        f1.peso = 65;
        f1.altura = 166;
        f1.exibir();

        Figurinha f2 = new Figurinha();
        f2.nome = "Neymar";
        f2.posicao = "Atacante";
        f2.pais = "Brasil";
        f2.niver = "05/02/1992";
        f2.peso = 78;
        f2.altura = 175;
        f2.exibir();

        Figurinha f3 = new Figurinha();
        f3.nome = "Weverton";
        f3.posicao = "Goleiro";
        f3.pais = "Brasil";
        f3.niver = "13/12/1987";
        f3.peso = 89;
        f3.altura = 189;
        f3.exibir();
    }
}