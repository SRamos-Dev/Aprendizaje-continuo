package Fase3HerenciaYPolimorfismo;
public class Animal {

    /*Ejercicio 5: Clase base Animal con método hacerSonido().
     * Clases hijas: Perro y Gato con su propio sonido
    */

    public void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }

    public static void main(String[] args) {
        
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        miPerro.hacerSonido();
        miGato.hacerSonido();
    }
}
