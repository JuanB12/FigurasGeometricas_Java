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
public abstract class Figuras {

    int numeroLados;
    String Nombre;
    Double Area;
    Double Perimetro;

    public Figuras(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Figuras{" + "numeroLados=" + numeroLados + ", Nombre=" + Nombre + ", Area=" + Area + ", Perimetro=" + Perimetro + '}';
    }

    public abstract String Nombre();

    public abstract Double Area();

    public abstract Double Perimetro();

    public abstract void dibujarFigura();

}
