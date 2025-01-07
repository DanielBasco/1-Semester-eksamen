import java.time.Duration;
import java.util.Scanner;

public class Dryer implements LaundryMachine {
    int duration;
    double price;
    String name;
    Scanner scanner;

    Dryer(String name){
        this.name = name;
        duration = 30;
        price = duration * 0.5;
        this.scanner = new Scanner(System.in);
    }

    public void chooseProgram() {
        System.out.println("1) Lav varme" + "\n" + "2) Høj varme");
        int answer = getNumericInput();
        if (answer<0 || answer>2) { getNumericInput();}
        switch(answer){
            case 1:
               System.out.println("Valgt: Program 1 | Lav varme");
           break;
           case 2: System.out.println("Valgt: Program 2 | Høj varme");
               break;
        }
    }

    @Override
    public void displayPriceAndDuration() {
        System.out.println("Varighed: "+duration+" minutter| "+"Pris: "+price+" DKK");
    }

    public void start(){
        System.out.println("Tørretumbler er nu startet");
    }

    public void addExtra() {

            System.out.println("Ønsker de at tilføje 10 minutter ? (J/N)");
            String answer = scanner.next();
            if(answer.equalsIgnoreCase("j")){
                duration = duration+10;
                System.out.println("Der er blevet tilføjet 10 minutter");
            }
            else if(answer.equalsIgnoreCase("n")){
                System.out.println("Intet tilføjet denne gang");
            } else {
                System.out.println("De skal indtaste 'J' for Ja eller 'N' for Nej");
                addExtra();
            }
        }


    private int getNumericInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine()); // Parse input as integer
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: "); // Handle invalid input
            }
        }
    }

   public String getName(){
        return name;
    }

}
