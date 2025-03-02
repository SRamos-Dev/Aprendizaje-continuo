public abstract class Figura {

    /*Ejercicio 6: Clase abstracta Figura con método abstracto calcularArea().
     * Clases hijas: Circulo y Rectangulo.
    */
    public abstract double calcularArea();

    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5);
        Figura miRectangulo = new Rectangulo(4,6);

        System.out.println("El area de mi circulo es: "+miCirculo.calcularArea());
        System.out.println("El area de mi rectangulo es: "+miRectangulo.calcularArea());
    }
}
