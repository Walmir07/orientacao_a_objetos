package aula8;

public class Quadrado extends Forma{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    protected double getPerimetro() {
        return lado * 4;
    }

    @Override
    protected double getArea() {
        return lado * lado;
    }

}
