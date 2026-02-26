package aula4;

public class Circulo {

    public double raio;

    public double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * raio;
    }

    public boolean contemOutro(Circulo outro) {
        if (this.raio > outro.raio) {
            return true;
        } else {
            return false;
        }
    }

    public Circulo maior(Circulo outro){
        if(this.calcularCircunferencia() > outro.calcularCircunferencia()){
            return this;
        } else {
            return outro;
        }
    }

    public void exibirDados(){
        System.out.format(" Raio: %.2f, área: %.2f e circunferência: %.2f", this.raio, this.calcularArea(), this.calcularCircunferencia());
    }


}
