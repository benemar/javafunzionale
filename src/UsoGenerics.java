public class UsoGenerics {
    // applicazione dei generics ad un metodo

    // stampiamo un array uno di interi a l'altro di double
    public void stampaInteri (Integer [] myarray){
        for (int elemento :myarray  ) {
          //  System.out.println(elemento + " ");
            System.out.printf("%d", elemento);
        }
        System.out.println();
    }
    public void stampaDecimali (Double [] myarray){
        for (double elemento :myarray  ) {
            //  System.out.println(elemento + " ");
            System.out.printf("%.1f", elemento);
        }
        System.out.println();
    }

    // scriviamo un metodo generico valido per tutti i tipi di dati
    // E --> ident un elemento
    // K --> chiave
    // D --> numero
    // T --> elemento generico
    public <T>void usoMetodoGenerico (T [] myarray){
        for (T elemento :myarray  ) {
            //  System.out.println(elemento + " ");
            System.out.printf("%s", elemento); // s --> sta per carattere/stringa
        }
        System.out.println();
    }




}
