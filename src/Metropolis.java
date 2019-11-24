public class Metropolis {

    //Online noch einmal nachschaun

    public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {

        boolean isMetropolis = false;
        isCapital = true;
        inhabitants = 3000000;

        if (isCapital == true && inhabitants > 100000) {

            isMetropolis = true;
            System.out.println("Sie ist eine Metropole");

        }

        else if (inhabitants > 200_000 && inhabitants * taxPerPersonAndMonth * 12 >= 720_000_000) {

            isMetropolis = true;
            System.out.println("Sie ist eine Metropole");

        }

    return true;
    }
}







