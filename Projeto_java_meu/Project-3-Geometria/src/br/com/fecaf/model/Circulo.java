package br.com.fecaf.model;

import java.util.Scanner;

public class Circulo {

    public double raio, area, perimetro;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarCirculo() {
        System.out.println("/******************************/");
        System.out.println("/*      Cadastro Circulo      */");
        System.out.println("/******************************/");
        System.out.print("Informe o raio do circulo: ");
        raio = scanner.nextDouble();
        System.out.println("Circulo Cadastrado com Sucesso !");
        System.out.println("/******************************/");
        return true;

    }

    public void calcularArea() {
        System.out.println("/* Calculando Area */");

        area = Math.PI * (raio * raio);

        System.out.println("A Area é " + area);

    }

    public void calcularPerimetro() {
        System.out.println("/* Calculando o Perimetro */");

        perimetro = 2 * Math.PI * raio;

        System.out.println("O Perimetro é: " + perimetro);
    }



}
