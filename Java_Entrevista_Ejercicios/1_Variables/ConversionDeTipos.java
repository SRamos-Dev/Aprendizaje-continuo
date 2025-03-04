public class ConversionDeTipos {

    /*
     * Declara una variable de tipo double y asígnale un valor con decimales. 
     * Convierte este valor a tipo int y muestra ambos resultados.
     */
    public static void main(String[] args) {
        double doble = 55.5;
        System.out.println("El numero decimal a convertir es el: " + doble);

        int entero = (int)doble;
        System.out.println("El numero convertido es ahora: " + entero);
    }
     
}
