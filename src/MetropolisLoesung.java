public class MetropolisLoesung {

    public static void main(String[] args) {

        boolean check1 =
                isMetropolis(true,100_001,500.0);
        System.out.println("check1 = " + check1);

        boolean check2 =
                isMetropolis(false,5_000,100.0);
        System.out.println("check2 = " + check2);

        boolean check3 =
                isMetropolis(false,1_000_000,1000.0);
        System.out.println("check3 = " + check3);
    }

    /*
    public static boolean isMetropolis(
            boolean isCapital,
            int inhabitants,
            double taxPerPersonAndMonth) {
        boolean resultA = isCapital && inhabitants > 100_000;
        boolean resultB = (inhabitants > 200_000)
                                && (inhabitants * taxPerPersonAndMonth
                                     * 12 >= 720_000_000);
        return resultA || resultB;
    }
    */

    public static boolean isMetropolis(
            boolean isCapital,
            int inhabitants,
            double taxPerPersonAndMonth) {

        if ((isCapital && inhabitants > 100_000)
                || (inhabitants > 200_000)
                && (inhabitants * taxPerPersonAndMonth
                * 12 >= 720_000_000)
        ) {
            return true;
        }

        return false;

    }




}