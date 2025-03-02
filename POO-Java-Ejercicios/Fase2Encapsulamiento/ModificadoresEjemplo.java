package Fase2Encapsulamiento;
public class ModificadoresEjemplo {
    /* Ejercicio 4: Modificadores public, private, protected y default en práctica. */
    
    // Atributos privados
    private String atributoPrivado = "Soy privado";
    // Atributos protegidos
    protected String atributoProtegido = "Soy protegido";
    // Atributos públicos
    public String atributoPublico = "Soy público";
    // Atributos por defecto (default)
    String atributoDefault = "Soy default";

    public static void main(String[] args) {
        ModificadoresEjemplo objeto = new ModificadoresEjemplo();
        
        // Acceso a atributos privados
        System.out.println(objeto.atributoPrivado); // Error: atributoPrivado has private access in ModificadoresEjemplo
        // Acceso a atributos protegidos
        System.out.println(objeto.atributoProtegido);
        // Acceso a atributos públicos
        System.out.println(objeto.atributoPublico);
        // Acceso a atributos por defecto (default)
        System.out.println(objeto.atributoDefault);
    }
}
