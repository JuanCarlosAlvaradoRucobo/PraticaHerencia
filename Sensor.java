import java.util.ArrayList;

/**
 * Write a description of class Sensor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sensor extends ComponenteElectronico
{
   private String tipo;
   private String unidadDeMedida;
   private int valor;
   
   public Sensor(String nombre, String fabricante, String numeroSerie, String marca, float costo, ArrayList<ComponenteElectronico> componente){
        super(nombre, fabricante, numeroSerie, marca, costo, componente);
        tipo = "Huella digital";
        unidadDeMedida = "DPI";
        valor = 1000;
    }
   public void setValor(int valor){
       this.valor=valor;
   }
   
   public int getValor(){
       return valor;
   }
   
   public void setTipo(String tipo){
       this.tipo=tipo;
   }
   
   public String getTipo(){
       return tipo;
   }
   
   public void setUnidadDeMedida(String unidadDeMedida){
       this.unidadDeMedida=unidadDeMedida;
   }
   
   public String getUnidadDeMedida(){
       return unidadDeMedida;
   }
   
    @Override
    public String toString() {
        
        String dispositivoElectronicoString = super.toString();
        
        
        return dispositivoElectronicoString + "tipo de sensor: " + tipo + " unidad: " + unidadDeMedida + " medida: " + valor;
    }
}
