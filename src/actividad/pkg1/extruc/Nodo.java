
package actividad.pkg1.extruc;

public class Nodo {

    private String nombre;
     Nodo siguiente;
    
    public Nodo(String nombre) {
        this.nombre = nombre;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void enlazarSig(Nodo siguiente) {
        this.siguiente = siguiente;
    }

  
    
}


