
import java.util.ArrayList;

/**
 *
 * @author Carlo
 */
public abstract class DispositivoElectronico {
    protected float costo;
    private String fabricante;
    private String numeroSerie;
    private String marca;
    private String nombre;
    protected ArrayList<ComponenteElectronico> componente;
    
    public DispositivoElectronico(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        this.costo=costo;
        this.nombre=nombre;
        this.fabricante=fabricante;
        this.marca=marca;
        this.numeroSerie=numeroSerie;
        componente = new ArrayList<>();
    }   
    
public void agregarComponente(ComponenteElectronico nuevoComponente) {
    componente.add(nuevoComponente);
}

public void quitarComponente(ComponenteElectronico componenteAQuitar) {
    componente.remove(componenteAQuitar);
}
    
public float getCosto(){
    return costo;
}

public void setCosto(float costo){
    this.costo=costo;
}

public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre=nombre;
}

public String getFabricante(){
    return fabricante;
}

public void setFabricante(String fabricante){
    this.fabricante=fabricante;
}

public String getMarca(){
    return marca;
}

public void setMarca(String marca){
    this.marca=marca;
}
    
    public ArrayList<ComponenteElectronico> getComponente(){
        return componente;
    }
    
    public String toString(){
        return "nombre dispositivo: " +nombre +"fabricante: "+fabricante +"numeroSerie: "+numeroSerie +"marca: " +marca +"costo: " +costo;
    }
}
