import java.util.function.Supplier;

public class LambdaSupplier {

    public static void main(String[] args) {
        /*
        Generiamo con l'uso di una lambda Supplier un numero casuale
        moltiplicato per 1000
        La Supplier è un'interfaccia funzionale che non richiede parametri
         */
        Supplier<Integer > numRandom = ()-> (int) (Math.random() * 1000);
        // il metodo get() riporta il risultato.
        System.out.println("generato numero random: " + numRandom.get());
    }
}
