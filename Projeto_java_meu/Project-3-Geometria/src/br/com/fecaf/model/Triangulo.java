package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/*************************/");
        System.out.println("/** Cadastrar Triangulo **/");
        System.out.println("/*************************/");
        System.out.print("Informe a Base : ");
        base = scanner.nextDouble();
        System.out.print("Informe o lado 2: ");
        lado2 = scanner.nextDouble();
        System.out.print("Informe o lado 3: ");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("Triangulo Cadastrado com Sucesso !");
        System.out.println("/********************************/");
        return true;
    }

    public void calcularArea() {
        System.out.println("Calculando Area...");
        area = (base * altura) / 2;
        System.out.println("A Área é: " + area);
    }

    public void calcularPerimetro() {
        System.out.println("Calculando Perímetro...");
        perimetro = base + lado2 + lado3;
        System.out.println("O Perímetro é: " + perimetro);
    }

    public void definirTipo() {
        System.out.println("Definindo Tipo...");
        if (base == lado2 && base == lado3) {
            System.out.println("Este Triângulo é Equilátero!");
            //Tive que inverter e trazer a parte do triângulo retângulo pra cima do escaleno
            //se estivesse ao contrário, ele não verificava como triângulo retângulo
        } else if ((base * base == lado2 * lado2 + lado3 * lado3) ||
                (lado2 * lado2 == base * base + lado3 * lado3) ||
                (lado3 * lado3 == base * base + lado2 * lado2)) {
            System.out.println("Este é um Triângulo Retângulo!");
        } else if (base != lado2 && base != lado3 && lado2 != lado3){
            System.out.println("Este é um Triângulo Escaleno!");
        } else {
            System.out.println("Este Triângulo é Isósceles!");
        }
    }

    public void verificarTriangulo345() {
        //Verifica de os lados do triângulo seguem a regra 3-4-5 em proporção
        //usando o mesmo parâmetro do teorema de Pitágoras
        if ((base % 3 == 0 && lado2 % 4 == 0 && lado3 % 5 == 0) ||
                (base % 4 == 0 && lado2 % 5 == 0 && lado3 % 3 == 0) ||
                (base % 5 == 0 && lado2 % 3 == 0 && lado3 % 4 == 0)) {
            System.out.println("Este é um Triângulo Triângulo 3-4-5!");
        } else {
            System.out.println("Este NÃO é um Triângulo Triângulo 3-4-5.");
        }
    }
}