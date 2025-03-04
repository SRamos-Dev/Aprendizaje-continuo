
public class NumeroAleatorio {
    public static void main(String[] args) {
        //Genera un número aleatorio entre 1 y 100 y muestra si es par o impar. Usa Math.random().
        int max = 100;
        double random = (int)(Math.random()*max);

        System.out.println(random);

        if(random %2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }

    }
}
    