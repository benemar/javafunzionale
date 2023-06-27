import java.util.function.BiFunction;

public class GenericBiFunction {
       // Integer -- Double -- Float
    public <T extends Number, U extends Number, R extends Number >
    R usoMetodoGenerico (BiFunction<T, U, R> diff4 , T n, U v)

    {
        R ris = diff4.apply(n,v);
         return ris;
    }

// Con la classe RichiamoGeneericFunction uso il metodo GenericBiFunction
}
