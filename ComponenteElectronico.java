
import java.util.ArrayList;

/**
 *
 * @author Carlo
 */
public abstract class ComponenteElectronico extends DispositivoElectronico{
    
    
    public ComponenteElectronico(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
    }
    
 public boolean esParteDe() {
        // Verificar si el componente actual está en la lista de componentes del dispositivo
        if (this.getComponente() != null && !this.getComponente().isEmpty()) {
            for (ComponenteElectronico componente : this.getComponente()) {
                if (componente.equals(this)) {
                    return true;
                }
            }
        }
        return false;
    }
}