import java.util.Scanner;
public class SumaElementos {
    public static void main(String[] args) {
        //Crea un array de enteros de tamaño 5, pide al usuario que introduzca los valores y luego muestra la suma total.

        int[] arrayInt = new int[5]; 
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vas a indicar los valores que iremos a sumar de una matriz: ");
        System.out.println("Primer valor: ");
        arrayInt[0] = scanner.nextInt();
        System.out.println("Segundo valor: ");
        arrayInt[1] = scanner.nextInt();
        System.out.println("Tercer valor: ");
        arrayInt[2] = scanner.nextInt();
        System.out.println("Cuarto valor: ");
        arrayInt[3] = scanner.nextInt();
        System.out.println("Quinto valor: ");
        arrayInt[4] = scanner.nextInt();

        System.out.println("\nLos valores elegidos son: ");
        for(int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i]+"\t");
            sum += arrayInt[i]; 
        }
        System.out.println("\n\nLa suma de los numeros es: "+sum);
        scanner.close();
    }
}
    