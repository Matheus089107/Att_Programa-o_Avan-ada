package org.example;


import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite o nome do funcionario: ");
        String nome = imput.nextLine();

        System.out.println("Digite o cargo do funcionario:");
        String cargo = imput.nextLine();

        System.out.println("Digite o salario do funcionario: ");
        double salario = imput.nextDouble();

        funcionariosDAO dao = new funcionariosDAO();

        dao.inserir(nome, cargo,salario);
    }
}