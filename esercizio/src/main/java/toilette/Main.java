package toilette;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Toilette b= new Toilette();
        Persona p1= new Persona("Gaia",b);
        Persona p2= new Persona("Maria",b);
        Persona p3= new Persona("Viola",b);

        ArrayList<Persona> lista= new ArrayList<Persona>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for(int i =0; i<lista.size();i++){
            lista.get(i).start();
        }
    }
    
    
}