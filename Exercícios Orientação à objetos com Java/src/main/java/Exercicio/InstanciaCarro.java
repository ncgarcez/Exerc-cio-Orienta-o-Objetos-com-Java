package Exercicio;

import java.util.Scanner;

public class InstanciaCarro {

    public static void main(String[] args) {

        String marca;
        String modelo;
        Integer ano;
        String variante;
        Integer capacidade;
        Integer pessoas;
        Integer novasPessoas;

        Scanner ler=new Scanner(System.in);

        System.out.println("========================================");
            System.out.println("Inserindo os dados do carro");
        System.out.println("========================================");

        System.out.println("Qual é a Marca do carro?");marca=ler.nextLine();

        System.out.println("Qual é o Modelo?");modelo=ler.nextLine();

        System.out.println("Qual a variante do carro?");variante=ler.nextLine();

        System.out.println("Qual o ano do veículo?");ano=ler.nextInt();

        System.out.println("Qual a capacidade do veículo?");capacidade=ler.nextInt();

        System.out.println("Quantas pessoas já tem no carro?");pessoas=ler.nextInt();

        Carro carro = new Carro(marca, modelo, ano, variante, capacidade, pessoas);

        System.out.println("========================================");
            System.out.println("Imprimindo os dados do objeto carro");
        System.out.println("========================================");

        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Variante: "+carro.getVariante());
        System.out.println("Ano: "+carro.getAno());
        System.out.println("Capacidade: "+carro.getCapacidade());
        System.out.println("Ocupação: "+carro.getPessoas());

        System.out.println("========================================");
            System.out.println("Colocando uma nova quantidade de pessoas");
        System.out.println("========================================");

        System.out.println("Informe quantas pessoas querem entrar no carro: ");novasPessoas=ler.nextInt();

        if (pessoas+novasPessoas<=capacidade){
            System.out.println("Ótimo, todos cabem no carro. Vamos partir.");
        } else {
            System.out.println("Infelizmente só cabem "+capacidade+". Precisaremos de mais carros.");
        }



    }
}
