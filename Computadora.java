import java.util.ArrayList;

/**
 * Write a description of class Computadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Computadora extends DispositivoElectronicoDeConsumo
{
   private Microprocesador cpu;
   private long ramMb;
   
       public Computadora(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        cpu = new Microprocesador("Ryzen 3", "AMD", "5000series", "Ryzen", 2500, componente);
        ramMb= 32000;
    }
    
    
    
    
    public long getRam(){
        return ramMb;
    }
    
    public void setRam(long ramMb){
        this.ramMb=ramMb;
    }
}
