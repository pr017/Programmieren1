public class TurmRechner {

    public static void main(String[] args) {
        double ergebnis = 2;
        int zahl = 2;

        System.out.println(ergebnis);

        for (zahl = 2; zahl<=9; zahl++ ){

            ergebnis = ergebnis * zahl;
            System.out.println(ergebnis);

        }

        for (zahl = 2;zahl <=9; zahl++ ){

            ergebnis = ergebnis / zahl;
            System.out.println(ergebnis);

        }

    }

}
