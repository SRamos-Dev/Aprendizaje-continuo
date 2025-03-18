import java.util.Scanner;

public class ComparadorEdades {
    public static void main(String[] args) {
        //Pide la edad de dos personas e indica cuál es mayor, menor o si tienen la misma edad.
        Scanner entrada = new Scanner(System.in);

        int edadPersona1;
        int edadPersona2;

        System.out.println("Indica la edad de la primera persona: ");
        edadPersona1 = entrada.nextInt();
        System.out.println("Indica la edad de la segunda persona: ");
        edadPersona2 = entrada.nextInt();

        if (edadPersona1 < edadPersona2 && edadPersona1 > 0 && edadPersona2 > 0) {
            System.out.println("La persona 2 es Mayor y la 1 Menor");
        }
        else if (edadPersona1 > edadPersona2 && edadPersona1 > 0 && edadPersona2 > 0){
            System.out.println("La persona 1 es Mayor y la 2 Menor");
        }
        else if(edadPersona1 == edadPersona2 && edadPersona1 > 0 && edadPersona2 > 0){
            System.out.println("Ambas personas tienen la misma edad");
        }else {
            System.out.println("No es una edad valida");
        }
        entrada.close();
    }
}
    