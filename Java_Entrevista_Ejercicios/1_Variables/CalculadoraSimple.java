import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        //Crea un programa que defina dos variables (int a y int b) y realice las operaciones básicas (+, -, *, /) mostrando el resultado de cada una.
        Scanner entrada = new Scanner(System.in);

        int a, b, opcion = 0;
        System.out.println("== CALCULADORA ==");
        System.out.println("Seleccione la opcion que desee: ");
        System.out.println(" 1. Suma\n 2. Resta\n 3. Multiplicacion\n 4. División\n 5. Salir");

        opcion = entrada.nextInt();

        if(opcion != 5){
            System.out.println("Indique dos numeros que desee para la operacion a realizar:");
            a = entrada.nextInt();
            b = entrada.nextInt();
        
        
            if(opcion == 1){
                int suma = a + b;
                System.out.println("La suma de "+a+" + "+b+" es igual a: "+suma);
            }
            else if(opcion == 2){
                int resta = a - b;
                System.out.println("La resta de "+a+" - "+b+" es igual a: "+resta);
            }
            else if(opcion == 3){
                int multiplicacion = a * b;
                System.out.println("El resultado de "+a+" x "+b+" es igual a: "+multiplicacion);
            }
            else if(opcion == 4){
                int division = a / b;
                System.out.println("El resultado de "+a+" / "+b+" es igual a: "+division);
            }else{
                System.out.println("Elija una de las opciones en el Menu");
            }
        }
        if(opcion == 5){
            System.out.println("Saliendo del programa. Vuelva pronto....");
        }
        entrada.close();
    }
}
    