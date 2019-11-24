public class ArrayDemo2 {

    public static void main(String[] args) {

        String[] monate = {"Jaenner", "Februar", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        System.out.println(monate.length);

        for(int m = 0; m < monate.length; m++) {
            System.out.println(monate[m] + " ["+ (m+1) +"]");
        }

    }
}
// online noch einmal nachschaun