import java.util.Random;
import java.util.Scanner;
public class MayorYMenor {
    public static void main(String[] args) {
        //Llena un array de 10 números aleatorios y muestra cuál es el mayor y cuál el menor.

        int[] matriz = new int[10];
        Random random = new Random();
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
            if (matriz[i] > mayor) {
                mayor = matriz[i];
            }
            if (matriz[i] < menor) {
                menor = matriz[i];
            }
        }
        System.out.println("Los números generados son: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i] + " ");
        }
        System.out.println("\nEl número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor + " y el menor es: " + menor);



    }
}
