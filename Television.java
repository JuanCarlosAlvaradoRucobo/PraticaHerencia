import java.util.ArrayList;


public class Television
{
   private Pantalla pantalla;
   public Television(Pantalla pantalla){
      this.pantalla=pantalla;
   }
   
   
       @Override
    public String toString() {
        return pantalla.toString();
    }
}
