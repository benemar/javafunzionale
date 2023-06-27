import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdaFunction {
    /*Function(args) -> {return x;}
     Rappresenta una funzione che prende in ingresso un parametro e ritorna un risultato */

// gestiamo le operazioni di calcolo delle differenza tra due numeri Interi

    public static void main(String[] args) {
        //           Entrata Uscita
        Function<Integer, Integer> diff = (numInt) -> numInt - 1;
        System.out.println("La differenza tra il numero inserito e 1 è " + diff.apply(10));
        // se abbiamo bisogno di 2 parametri c'è la BiFunction
        //           Entrata Entrata  Uscita
        BiFunction<Integer, Integer, Integer> diff2 = (n, v) -> n - v;
        System.out.println("La differenza tra i due numeri è " + diff2.apply(10, 4));

        // Quando i tipi in entrata e uscita sono ugual si puo' usere BinaryOperator
        BinaryOperator<Integer> diff3 = (n, v) -> n - v;
        System.out.println("La differenza tra i due numeri è " + diff3.apply(5, 8));

      //------


        // creiamo una funzione che converte in minuscolo una stringa
        // e la concateniamo ad un'altra stringa
        Function<String,String> minuscolo = (str) -> str.toLowerCase();
        Function<String,String> concatena = (conc) ->conc.concat(" A tutti");
        // andThen    unisce il risultato di due o più lambda
        System.out.println(minuscolo.andThen(concatena).apply("BENVENUTI"));








        /*

 class MathOperationV1<T extends Number> {
        public T add(T a, T b) {
            return a + b; // error: Operator '+' cannot be applied to 'T', 'T'
        }
}
Gabriel Agustìn Ippolito13:02
public static  <T extends Number>  double usoMetodoGenerico(T t, T u){
        BiFunction<T, T , Double> diff = (T t1, T u2) ->{
            return t.doubleValue()-u.doubleValue();
        };
        return diff.apply(t,u);
    }


 */

    }
}
