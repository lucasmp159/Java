package CalculoArea;

public class Esfera extends Calculo {
    final double pi = 3.14;

    public double calculoArea(double r){
        return 4 * pi * Math.pow(r,2);
    }
}
