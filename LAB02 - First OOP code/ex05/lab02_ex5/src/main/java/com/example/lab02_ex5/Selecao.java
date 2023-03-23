package com.example.lab02_ex5;

public class Selecao {
    String nomeSelecao;
    String[] nomeJogador = new String[11];
    String nomeTecnico;

    public Selecao(String nomeSelecao, String nomeTecnico){
        this.nomeSelecao = nomeSelecao;
        this.nomeTecnico = nomeTecnico;

        for(int i=0; i<11; i++){
            nomeJogador[i] = String.valueOf(new Figurinha(nomeSelecao));
        }
    }

    public void mostraSelecao(){
        System.out.println("Seleção " +this.nomeSelecao);
        System.out.println("GOL: "+this.nomeJogador[0]);
        System.out.println("LD: "+this.nomeJogador[1]);
        System.out.println("ZAG: "+this.nomeJogador[2]);
        System.out.println("ZAG: "+this.nomeJogador[3]);
        System.out.println("LE: "+this.nomeJogador[4]);
        System.out.println("VOL: "+this.nomeJogador[5]);
        System.out.println("VOL: "+this.nomeJogador[6]);
        System.out.println("MEI: "+this.nomeJogador[7]);
        System.out.println("ATA: "+this.nomeJogador[8]);
        System.out.println("ATA: "+this.nomeJogador[9]);
        System.out.println("ATA: "+this.nomeJogador[10]);
        System.out.println("Técnico: " + this.nomeTecnico);
        System.out.println("------------------");
        System.out.println("\n");
    }
}

