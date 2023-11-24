import java.util.ArrayList;

/**
 * Write a description of class Microprocesador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Microprocesador extends ComponenteElectronico
{
    private int cacheRam;
    private long velocidadHz;
    
    public Microprocesador(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        cacheRam = 0;
        velocidadHz= 0;
    }
    
    
    public void setCacheRam(int cacheRam){
        this.cacheRam=cacheRam;
    }
    
    public int getCacheRam(){
        return cacheRam;
    }
    
    public void setVelocidadHz(long velocidadHz){
        this.velocidadHz=velocidadHz;
    }
    
    public long getVelocidadHz(){
        return velocidadHz;
    }
}
