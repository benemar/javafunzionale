public class LambdaBase {

    public static void main(String[] args) {

       // creiamo una lambda per la somma

        int a = 10;
        int b = 4;
        // CalcolatriceLambda sommaNumeri = (int x,int y ) ->{ return x + y; };
        // la semplifichiamo eliminando elementi non necessari
        CalcolatriceLambda sommaNumeri = ( x, y ) ->  x + y;
        // richiamo la lambda
        System.out.println(sommaNumeri.operazioni(a,b));
        CalcolatriceLambda.saluto();
        /*
            @Override
            public int somma(int a, int b) {
            return a +b ;
    } */
    }
}
