package org.example;


import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = imput.nextLine();

        System.out.println("Digite o preço do produto");
        Double preco = imput.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        int qnt = imput.nextInt();

        produtoDAO dao = new produtoDAO();

        dao.inserir(nome, preco, qnt);
        System.out.println("produto inserido com sucesso");
    }
}