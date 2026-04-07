package aula8;

public abstract class Forma {

    public void mostrarForma(){
        System.out.println("Área: " + getArea());
        System.out.println("Perímetro: " + getPerimetro());
    }

    protected abstract double getPerimetro();

    protected abstract double getArea();

}
