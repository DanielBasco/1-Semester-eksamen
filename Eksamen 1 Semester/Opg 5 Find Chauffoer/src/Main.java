public class Main {

    public static void main(String[] args) {
        RickshawService r = new RickshawService();
        int[] districts = new int[]{1, 3};
        r.createDriver("Sigurd", districts);

       r.bookDriver();


    }
}