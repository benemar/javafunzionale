import java.util.function.BiFunction;

public class RichiamoGenericFunction {

    public static void main(String[] args) {
        GenericBiFunction gbf = new GenericBiFunction();
        Integer a = 5;
        Float b = 8.5f ;
      //  public <T extends Number> T usoMetodoGenerico (BiFunction<T, T, T> diff4 , T n, T v)
        BiFunction<Integer,Float, Float> somma = (x,y)-> x + y;
        float x = gbf.usoMetodoGenerico(somma,a,b);
        System.out.println(x);
    }
}
