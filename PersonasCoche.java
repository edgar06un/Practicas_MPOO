package p4;

/**
 *
 * @author edgarriv69
 */
public class PersonasCoche {
    
    //Definiendo características de las personas
    private String nombre; 
    private String lugar; 
    
    //Constructor vacío
    public PersonasCoche() {
    }
    
    //Constructor lleno
    public PersonasCoche(String nombre, String lugar) {
        this.nombre = nombre;
        this.lugar = lugar;
    }
    
    //Constructores getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "PersonasCoche{" + "Mi nombre es:" + nombre + ", y mi lugar:" + lugar + '}';
    }

}
