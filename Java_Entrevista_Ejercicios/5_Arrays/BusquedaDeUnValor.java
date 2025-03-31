import java.util.Scanner;
public class BusquedaDeUnValor {

    /*
     * Crea un programa que permita al usuario buscar un valor en una matriz 4x4 y muestre la posición (o posiciones) en la que se encuentra el valor buscado. Si el valor no está presente, informa al usuario.
     * Declara una matriz de tamaño 4x4 e inicialízala con valores predeterminados (pueden ser valores aleatorios o fijos).
     * Solicita al usuario que ingrese un valor a buscar.
     * Usa bucles for anidados para recorrer la matriz y comprobar si el valor existe. Si lo encuentras, guarda la posición (índice de fila y columna).
     * Imprime las posiciones encontradas o un mensaje si no se encuentra el valor.
     */

     public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            int[][] matriz = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
            };

            System.out.println("Elija un valor a buscar entre las matriz, para validar si se encuentra: ");

            for(int i = 0; i<matriz.length;i++){
                for(int j = 0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();
            }


            int numero = entrada.nextInt();

                for(int i = 0; i < matriz.length; i++){
                    for(int j = 0; j < matriz[i].length;j++){
                        if (matriz[i][j] == numero){
                            System.out.println("El numero "+ numero +" ha sido encontrado en la fila "+(i+1)+" y la columna "+(j+1));
                        }
                        else if (i == matriz.length-1 && j == matriz[i].length-1){
                            System.out.println("El numero "+ numero +" no ha sido encontrado en la matriz.");
                        }
                }
            }
            
    }
}
