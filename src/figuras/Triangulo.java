/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author salacomputocentro.ba
 */
public abstract class Triangulo extends Figuras {

    double lado1;
    double lado2;
    double lado3;

    public Triangulo(double lado1, double lado2, double lado3, int numeroLados) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public String toString() {
        return "Triangulo: \n " + super.toString() + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + '}';
    }

    @Override
    public Double Area() {
        double a = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt((a * (a - lado1) * (a - lado2) * (a - lado3)));

    }

}
