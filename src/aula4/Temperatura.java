package aula4;

public class Temperatura {

    double valor;
    String escala;

    public Temperatura(double valor, String escala){

        this.valor = valor;

        if(!escala.equals("C") && !escala.equals("F") && !escala.equals("K")){
            this.escala = "Inválida";
        } else {
            this.escala = escala;
        }

    }

    public double toCelsius(){
        if (this.escala.equals("F")) {
            return (this.valor - 32) / 1.8;
        } else if (this.escala.equals("K")) {
            return (this.valor - 273);
        } else {
            return this.valor;
        }
    }

    public double toFahrenheit(){
        if (this.escala.equals("C")) {
            return (1.8 * this.valor + 32);
        } else if (this.escala.equals("K")) {
            return ((this.valor - 273) * 1.8 + 32);
        } else {
            return this.valor;
        }
    }

    public double toKelvin(){

        if (this.escala.equals("C")) {
            return (this.valor + 273);
        } else if (this.escala.equals("F")) {
            return (this.valor - 32) * 5/9 + 273;
        } else {
            return this.valor;
        }

    }

    public void imprimeComEscala() {
        System.out.println("A temperatura é: " + this.valor + "°" + this.escala);
    }
}
