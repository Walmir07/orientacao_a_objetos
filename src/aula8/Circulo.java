package aula8;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void mostrarForma(){
        System.out.println("Circunferência: " + getArea());
        System.out.println("Área do círculo: " + getPerimetro());
    }

    @Override
    protected double getPerimetro() {
        return 2 * raio * 3.14;
    }

    @Override
    protected double getArea() {
        return raio * raio * 3.14;
    }

}
