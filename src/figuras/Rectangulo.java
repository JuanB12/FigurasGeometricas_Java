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
public abstract class Rectangulo extends Figuras {

    double base;
    double altura;

    public Rectangulo(double base, double altura, int numeroLados) {
        super(2);
        this.base = base;
        this.altura = altura;

    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() + "Base=" + base + ", Altura=" + altura + '}';
    }

    @Override
    public Double Area() {
        return (base * altura);

    }

}
