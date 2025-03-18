import java.util.Scanner;

public class CalculadoraCalificaciones {
    
    public static void main(String[] args) {
        /*Recibe una nota (0-100) y muestra el nivel:
        * 90 o más: Excelente
        * 70 a 89: Aprobado
        * Menos de 70: Reprobado
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica tu calificacion y la traducire a una calificacion textual: ");
        int calificacion = entrada.nextInt();
        
            if(calificacion >= 0 && calificacion < 70){
            System.out.println("Reprobado");
        } else if(calificacion >= 70 && calificacion < 90){
            System.out.println("Aprobado");
        } else if(calificacion >= 90 && calificacion <= 100){
            System.out.println("Excelente");
        } else{
            System.out.println("La nota no es real en un sistema de calificacion de 0 a 100, indica la calificacion real");
        }
        entrada.close();
    }
}
