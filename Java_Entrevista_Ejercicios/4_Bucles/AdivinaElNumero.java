import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        //Genera un número entre 1 y 50. Permite al usuario adivinarlo, indicando si el número es mayor o menor hasta acertar. Usa un while.
        Scanner entrada = new Scanner(System.in);

        int numeroGanador = 30;
        int numUsuario = 0;
        int intentos = 1;

        System.out.println("---- ADIVINA EL NUMERO ---");
        System.out.println("Elige un numero entre el 1 y el 50 para poder ganar el juego");

        


        while (numUsuario != numeroGanador) {
            System.out.println("Este es tu intento "+intentos);
            numUsuario = entrada.nextInt();
            intentos++;
        }
        if (numUsuario == numeroGanador) {
            System.out.println("Felicidades haz descubierto el numero correcto!!");
        }
        
    }
}
