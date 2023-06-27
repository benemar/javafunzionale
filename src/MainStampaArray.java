public class MainStampaArray {


    public static void main(String[] args) {
        UsoGenerics usoGenerics = new UsoGenerics();
        Integer [] arrayInteri ={1,2,3,4,5,6};
        Double [] arrayDouble = {1.5,7.9,3.9,7.9};
        usoGenerics.stampaInteri(arrayInteri);
        System.out.println("----------------");
        usoGenerics.stampaDecimali(arrayDouble);

        // usiamo il metodo generico per stampare i dati
        System.out.println("usiamo il metodo generico per stampare i dati");
        usoGenerics.usoMetodoGenerico(arrayInteri);
        usoGenerics.usoMetodoGenerico(arrayDouble);
    }

}
