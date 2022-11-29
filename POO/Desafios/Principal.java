package CalculoArea;

public class Principal {
    public static void main(String[] args){
        Calculo quadrado = new Calculo();
        System.out.println("Área do quadrado: " + quadrado.calculoArea(8, 10) + "m²");
        Triangulo triangulo = new Triangulo();
        System.out.println("Área do triângulo: " + triangulo.calculoArea(10,20) + "m²");
        Retangulo retangulo = new Retangulo();
        System.out.println("Área do retangulo: " + retangulo.calculoArea(12, 15) + "m²");
        Esfera esfera = new Esfera();
        System.out.println("Área da esfera: " + esfera.calculoArea(5) + "m²");
    }
}
