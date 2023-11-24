import java.util.ArrayList;

/**
 * Write a description of class Smartphone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smartphone extends Computadora
{
   private Sensor sensorDeHuella;
   private Pantalla pantalla;
   
   public Smartphone(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        sensorDeHuella= new Sensor("Sensor Huella", "logitech", "series 300", "Huella", 250, componente);
        pantalla = new Pantalla("LCD", "Generica", "500", "Samsung", 800, componente);
    }
    
    
}
