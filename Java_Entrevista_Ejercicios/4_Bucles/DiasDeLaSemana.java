import java.util.Scanner;

public class DiasDeLaSemana {

    //Crea un programa que tome un número del 1 al 7 y, usando switch, imprima el día de la semana correspondiente (por ejemplo, 1 para Lunes, 2 para Martes, etc.). Si el número no está en el rango, muestra un mensaje de error.
    
    public static void main(String[] args) {
        System.out.println("Indique un numero del 1 al 7 para mostrar el dia de la semana correspondiente: ");
        Scanner entrada = new Scanner(System.in);
        int numUsuario = entrada.nextInt();

        switch (numUsuario) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
            System.out.println("No es un numero valido");
            break;
        }
        entrada.close();
    }

}
