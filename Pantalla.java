import java.util.ArrayList;

/**
 * Write a description of class Pantalla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pantalla extends ComponenteElectronico
{
   private int resolucionX;
   private int resolucionY;
   
   public Pantalla(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        resolucionX=800;
        resolucionY=800;
    }
    
    public void setResolucionXY(int resolucionX, int resolucionY){
        this.resolucionX=resolucionX;
        this.resolucionY=resolucionY;
    }
    
    public int getResolucionX(){
    return resolucionX;
    }
    
    public int getResolucionY(){
        return resolucionY;
    }
    @Override
    public String toString() {
        
        String componenteElectronicoString = super.toString();
        
        
        return componenteElectronicoString + "resolucionX: " + resolucionX + " resolucionY: " + resolucionY;
    }
}
