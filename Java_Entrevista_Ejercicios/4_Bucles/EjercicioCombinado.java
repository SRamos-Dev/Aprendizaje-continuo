import java.util.Scanner;
public class EjercicioCombinado {

    /*
     * Crea un programa que combine switch y do while. El programa debe:.
     * Mostrar un menú (1: Convertir a Euros, 2: Convertir a Dólares, 3: Salir).
     * Usar switch para determinar qué conversión realizar.
     * Continuar mostrando el menú hasta que el usuario elija salir (do while)
     */

     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Elija la opcion que desea: ");
            System.out.println("1: Convertir a Euros ");
            System.out.println("2: Convertir a Dolares ");
            System.out.println("3: Salir");

            switch (opcion = entrada.nextInt()) {
                case 1:
                    System.out.println("Ha elegido convertir a Euros");
                    continue;
                case 2:
                    System.out.println("Ha elegido convertir a Dolares");
                    continue;
                case 3: 
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Seleccione una de las opciones indicadas");
                    continue;
            }

        }while(opcion != 3);
        entrada.close();
     }
}
