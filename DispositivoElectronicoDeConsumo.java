import java.util.ArrayList;

/**
 *
 * @author Carlo
 */
public abstract class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;
    
    public DispositivoElectronicoDeConsumo(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        encendido = false;
    }
    
    
    public boolean isEncendido(){
        return encendido;
    }
}