package aula4;

public class Main {

    public static void main(String[] args) {

        // Casting de tipos:

        char ch = 'y';
        String str = "abc";
        int num = (int) ch;

        System.out.println(num);

        //Varargs:

        Sequencia sequencia1 = new Sequencia(1, 2, 3, 4, 5);


        sequencia1.imprimirSquencia();


    }

}
