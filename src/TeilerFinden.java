public class TeilerFinden {


    public static void main(String[] args) {

        int zahl = 17;
        int teiler = 2;
        boolean hatTeiler = false;

        while(teiler < zahl){

            if (zahl % teiler == 0){

                System.out.println("teiler = " + teiler);
                hatTeiler = true;

            }


            teiler ++;           //++ = um eins erhöhen

        }

        if (hatTeiler == false){

            System.out.println("upps - Primzahl");
        }





    }





}
