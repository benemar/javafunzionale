public class Main {
    public static void main(String[] args) {

       // Calcolatrice --> somma
        CalcolatriceSharp calcolatrice =  new CalcolatriceSharp();
        int sum = calcolatrice.somma(10,8);
        System.out.println("la somma è: " + sum);

        Calcolatrice calc2 = new Calcolatrice() {
            @Override
            public int somma(int a, int b) {
                return a +b;
            }
            @Override
            public int differenza(int a, int b) {
                return a - b;
            }
        };

        int dif = calc2.differenza(10,3);
        System.out.println("la differenza è " + dif);
    }
}