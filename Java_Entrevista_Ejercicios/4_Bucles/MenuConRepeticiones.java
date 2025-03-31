import java.util.Scanner;
public class MenuConRepeticiones {

    /*
     * Combina un menú con un do while. El programa debe mostrar opciones como:
     * 1: Sumar dos números.
     * 2: Restar dos números.
     * 3: Salir. Después de cada opción (excepto salir), el menú debe volver a mostrarse. 
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int opcion;

            do {
                System.out.println("Elige la opcion que deseas: ");
                System.out.println("1. Sumar dos numeros.");
                System.out.println("2. Restar dos numeros.");
                System.out.println("3. Salir");
                opcion = entrada.nextInt();

                if(opcion == 1){
                    System.out.println("Indique dos numeros para ser sumados:");
                    System.out.print("Numero 1: ");
                    int num1 = entrada.nextInt();
                    System.out.print("Numero 2: ");
                    int num2 = entrada.nextInt();
                    System.out.println();
                    int suma = num1 + num2;
                    System.out.println("\nEl resultado de "+num1+" + "+num2+" es: "+suma+"\n");
                }else if(opcion == 2){
                    System.out.println("Indique dos numeros para ser restados:");
                    System.out.print("Numero 1: ");
                    int num1 = entrada.nextInt();
                    System.out.print("Numero 2: ");
                    int num2 = entrada.nextInt();
                    System.out.println();
                    int resta = num1 - num2;
                    System.out.println("\nEl resultado de "+num1+" - "+num2+" es: "+resta+"\n");
                }else if(opcion == 3){
                    System.out.println("\nSaliendo del programa...");
                }else{
                    System.out.println("\nOpcion no valida. Elija una opcion correcta\n");
                }
            } while(opcion != 3);
            entrada.close();
        }
    }
    

    


    
