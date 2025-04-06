import java.util.Random;
public class MayorYMenor {
    public static void main(String[] args) {
        //Llena un array de 10 números aleatorios y muestra cuál es el mayor y cuál el menor.

        int[] array = new int[10];
        Random random = new Random();
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < array.length;i++){
            array[i] = random.nextInt(100);
            System.out.print(array[i]+"\t");

            if(array[i] > maxValue){
                maxValue = array[i];
            }
            if(array[i] < minValue){
                minValue = array[i];
            }
        }
        System.out.println("\n\nEl valor maximo de los numeros es: "+maxValue);
        System.out.println("El valor minimo de los numeros es: "+minValue);
    }
}
