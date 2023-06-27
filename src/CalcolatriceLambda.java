/**
 * Interfaccia funzionale per la definizione astratta di ujna calcolatrice
 */
@FunctionalInterface
public interface CalcolatriceLambda {

   int operazioni(int a, int b);

   public static void saluto(){
      System.out.println("Operazione eseguita");
   }
}
