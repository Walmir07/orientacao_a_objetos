package aula4;

public class Sequencia {

   int[] numeros;

   public Sequencia(int... sequencia){
       this.numeros = sequencia;
   }

   public void imprimirSquencia(){
       for(int i = 0; i < numeros.length; i++){
           System.out.println(numeros[i]);
       }
   }



}
