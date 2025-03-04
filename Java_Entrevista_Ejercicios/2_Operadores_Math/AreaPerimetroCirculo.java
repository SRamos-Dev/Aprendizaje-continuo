import java.util.Scanner;

public class AreaPerimetroCirculo {
    public static void main(String[] args) {
        //Pide el radio de un círculo y calcula su área((3.1415*R)2) y perímetro (2(3.1415*R)) usando las funciones de Math.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Indica el radio del circulo para calcular su area y perimetro: ");
        int radio = entrada.nextInt();

        // Calcula el perímetro usando Math.PI
        double perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro del circulo es: "+ perimetro);

        // Calcula el área usando Math.PI y Math.pow
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+ area);
    }
}
    