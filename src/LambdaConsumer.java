import java.util.List;
import java.util.function.Consumer;

public class LambdaConsumer {

        /*
        INTERFACCIA CONSUMER
        Consumer: (args) -> {   void  }
        Rappresenta una funzione che accetta un argomento e produce un risultato
         */
       /*
        esercizio--> creiamo una lista di auto con i seguenti dati
        - modello
        - marca
        - ibrida (true si)

        -- Estriamo i dati di tutte le macchine
        -- Estraiamo solo i modelli
        -- Estraiamo solo le macchine ibride

        */
        public static void main(String[] args) {

            // ESTRAGGO TUTTE LE AUTO
            List <Veicoli> autovetture = Auto.getAll();
            Consumer<Veicoli> c1 = par1 -> System.out.println(par1);
            // iteriamo gli elementi della lista
            autovetture.forEach(c1);

            // -- Estraiamo solo i modelli
            System.out.println("Estraiamo solo i modelli");
            Consumer<Veicoli> c2 = par1 -> System.out.println(par1.getModello()) ;
            autovetture.forEach(c2);

            // -- Estraiamo solo le macchine ibride
            System.out.println("Estraiamo solo le macchine ibride");
            autovetture.forEach(veicoli -> {
                if(veicoli.isIbrida()==true)
                    c1.accept(veicoli);
            });

    }
}
