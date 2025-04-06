public class SumaDeMatrices {

    /*
     * Escribe un programa que permita al usuario sumar dos matrices de tamaño 3x3. Los pasos serían:
     * Declara dos matrices de tamaño 3x3 e inicialízalas con valores predeterminados (o permite al usuario introducirlos).
     * Crea una tercera matriz donde almacenarás la suma de las dos matrices anteriores.
     * Recorre las matrices con bucles for anidados y realiza la operación suma.
     * Imprime las tres matrices (las dos iniciales y la resultante).
     */

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] array2 = {{2,3,4}, {5,6,7}, {8,9,10}};
        int[][] sum = new int[array1.length][array1[0].length];

        System.out.println("Primera matriz a sumar: ");
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                System.out.print(array1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\nSegunda matriz a sumar: ");
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("\nLa suma de ambas es: ");
        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}