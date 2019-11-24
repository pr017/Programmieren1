public class Distance {


    public static void main(String[] args) {

        double km1 = 100.0;
        double miles1  =km2Landmiles(km1);

        System.out.println(km1 + "KM sind " + miles1 + " Landmeilen");

        double miles2 = 65.7;
        double km2 = landmiles2Km(miles2);

        System.out.println(miles2  + " Landmeilen sind " + km2 + "KM");


    }

    public static double km2Landmiles(double km){
        //double miles = km * 0.6214;
        //return miles;
        return km * 0.6214;
    }

    public static double landmiles2Km(double miles){
        return miles / 0.6214;
    }

}
