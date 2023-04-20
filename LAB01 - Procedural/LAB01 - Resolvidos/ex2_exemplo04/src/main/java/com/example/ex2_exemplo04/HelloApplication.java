package com.example.ex2_exemplo04;


import java.util.Scanner;


public class HelloApplication {

    public static int alteraPreco(float preco[], float porcentagem){
        float temp;
        int i = 0;
        if (porcentagem > -100) {
            temp = 1 + porcentagem/100;
            preco[i] = preco[i]*temp;
            return 0;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        String [] nome = new String[4];
        float[] preco = new float[4];
        int [] qtd_estoque = new int[4];


        for(int i = 0; i < 4; i++){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Informe o nome: ");
            String name = entrada.nextLine();
            nome[i] = name;
            System.out.println("\n");

            System.out.println("Informe o preco: ");
            float prc = entrada.nextFloat();
            preco[i] = prc;
            System.out.println("\n");

            System.out.println("\n");
            System.out.println("Informe a quantidade no estoque: ");
            int qtd = entrada.nextInt();
            qtd_estoque[i] = qtd;
            System.out.println("\n");

        }

    }
}