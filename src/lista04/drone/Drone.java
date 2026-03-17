package lista04.drone;

public class Drone {

    public String identificador;
    public int bateria;
    public int altitude;
    public boolean emVoo;

    public Drone(String identificador){
        if(identificador == null || identificador.isEmpty() || identificador.isBlank()){
            throw new IllegalArgumentException();
        } else {
            this.identificador = identificador;
            this.bateria = bateria;
            this.altitude = altitude;
            this.emVoo = emVoo;
        }
    }

    public String getIdentificador(){
        return identificador;
    }

    public int getBateria(){
        return bateria;
    }

    public int getAltitude(){
        return altitude;
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setBateria(int valor){
        if(valor < 0 || valor > 100){
            throw new IllegalArgumentException("Valor fora de intervalo.");
        } else {
            this.bateria = valor;
        }
    }

    public void setAltitude(int metros){
        if(metros < 0 || metros > 120){
            throw new IllegalArgumentException("Altitude inválida.");
        } else if (this.isEmVoo()) {
            this.altitude = metros;
        }
    }

    public void decolar(){
        if(bateria > 20){
            this.emVoo = true;
        }
    }

    public void pousar(){
        this.emVoo = false;
        this.altitude = 0;
    }

}
