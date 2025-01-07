import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RickshawService {



    //Opretter et scanner objekt
    Scanner scanner = new Scanner(System.in);

    //Initialisere mit dobbelte array
    String[][] districts = {
            {"Christiania","Operaen","Havnebad Islands Brygge"},
            {"Tivoli","Rådhuspladsen","Christiansborg"},
            {"Amalienborg","Strøget","Nyhavn"}
    };


    ArrayList<Driver> drivers = new ArrayList<>();


    //Parametre skal være Drivers driver "navn" samt distrikt område
   public void createDriver(String name, int[] districtCoverage){
      drivers.add(new Driver(name, districtCoverage));

   }

   public void bookDriver(){
       //Laver en counter så der står 1-9.
       int counter = 0;


       //for-loop inde i et for-loop | printer districs[][] array ud
       System.out.println("Vær venlig og indtast den destination du ønsker:");
        for(int i = 0; i<districts.length; i++){

            for(int j =0; j<districts[i].length; j++){
                counter++;
                System.out.println(counter+") "+districts[i][j]);
            }
        }

       //Anvender en variabel og et scanner objekt til at gemme brugerens svar

       int answer = getNumericInput();

        //Bruger en switch til at få distriktnummer
        switch(answer) {
            case 1:
            case 2:
            case 3:
                System.out.println(findDriver(1));
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(findDriver(2));
                break;
            case 7:
            case 8:
            case 9:
                System.out.println(findDriver(3));
                break;
            default:
                System.out.println("Noget gik galt, prøv igen");
                bookDriver();
        }
      //Test  System.out.println(districtNumber);
        }




   String findDriver(int districtNumber) {
       //Laver en String til ledige chauffører så de kan returneres til sidst
       String ledigDriver = "";

       //Laver en for-loop til at få fat i alle drivere enkeltvis | driver[i]
       for (int i = 0; i < drivers.size(); i++) {
           //For at få fat på distrikttal udenfor array skal vi bruge for-each loop
           for (int district : drivers.get(i).getDistrictCoverage()) {
               //Her sammenlignes distriktnummer med driver[i]'s distriktområde. Samt om isBooked er true eller false
               if(districtNumber == district && !drivers.get(i).isBooked){
                   //Tilføjer driver[i] navn til String hvis ovenover stemmer
                   ledigDriver += "| "+drivers.get(i).getName()+" er ledig";
                   break;
               }
           }

               }
       if (ledigDriver.isEmpty()) {
           return "Ingen ledige chaufføre";
       }
       return ledigDriver;
   }
    //Metode til at throw exception hvis input != tal
    int getNumericInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input var ikke et tal. Prøv igen");
            }
        }
    }

}
