public class Weather {

    public static void printweather(String weather) {
        System.out.println("The weather is " + weather);
    }

    public static String buildWeatherText(String weather){

        return "The Weather is " + weather;
    }

    public static void main(String[] args) {

        printweather("dark & cold");
    }



}
