package p4;

/**
 *
 * @author edgarriv69
 */
public class P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    /*A traves de getter y setter creamos objetos
    y los definimos con sus caracteristicas*/
    //Chofer 
    PersonasCoche p1 = new PersonasCoche();
    p1.setLugar("Chofer");
    p1.setNombre("Juan");
    
    //Copiloto
    PersonasCoche p2 = new PersonasCoche();
    p2.setLugar("Copiloto");
    p2.setNombre("Daniel");
    
    //Pasajero 1
    PersonasCoche p3 = new PersonasCoche();
    p3.setLugar("Pasajero 1");
    p3.setNombre("Jose");
    
    //Pasajero 2
    PersonasCoche p4 = new PersonasCoche();
    p4.setLugar("Pasajero 2");
    p4.setNombre("Pedro");
    
    //Se manda a imprimir cada persona
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p4);
    
    }
}
