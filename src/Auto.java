import java.util.Arrays;
import java.util.List;

public class Auto {

    // creamo un metodo che inserisce in una lista le auto create
    public static List<Veicoli> getAll(){
   Veicoli veicolo1 = new Veicoli("Fiesta 1200", "Ford",false)  ;
   Veicoli veicolo2 = new Veicoli("Punto 1600", "Fiat",true)  ;
   Veicoli veicolo3 = new Veicoli("Micra 1000", "Nissan",false);
   Veicoli veicolo4 = new Veicoli("Audi zxc 1900", "Audi",true)  ;
   List<Veicoli> list = Arrays.asList(veicolo1,veicolo2,veicolo3,veicolo4);
   return  list;
    }
}
