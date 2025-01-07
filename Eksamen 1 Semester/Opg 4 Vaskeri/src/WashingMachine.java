import java.util.Scanner;

public class WashingMachine implements LaundryMachine {
    String name;
    int capacity;
    double price;
    int duration;
    boolean isRunning;
    Scanner scanner;
    int counter = 0;


    WashingMachine(int capacity, String name) {
        this.name = name;
        this.capacity = capacity;
        price = capacity*1.2;
        this.scanner = new Scanner(System.in);
    }

    public void chooseProgram() {
        System.out.println("1) Uld og Silke"+"\n"+"2) Bomuld 40"+"\n"+"3) Bomuld 60");
        int answer = getNumericInput();
        if (answer<0 || answer>3) {
            System.out.println("Vælg mellem programmerne 1-3");
            getNumericInput();}
        switch(answer) {
            case 1:
                duration = 30;
                break;
            case 2:
                duration = 50;
                break;
            case 3:
                duration = 60;

        }
    }

    @Override
    public void displayPriceAndDuration() {
        System.out.println("Varighed: "+duration+" minutter.| "+"Pris: "+price+" DKK");
    }

    public void start(){
        System.out.println("Vaskemaskine er nu startet");
        isRunning = true;
    }

    @Override
    public void addExtra() {
        if(counter == 1){
            System.out.println("De kan ikke tilføje mere");}
        else{
        System.out.println("Ønsker de at tilføje forvask for 5kr yderligere ? (J/N)");
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("j")){
            price = price+5;
            System.out.println("Der er blevet tilføjet en forvask");
        }
       else if(answer.equalsIgnoreCase("n")){
            System.out.println("Intet tilføjet");
        } else {
            System.out.println("De skal indtaste 'J' for Ja eller 'N' for Nej");
            addExtra();
        }
        counter++;
        }
    }

    private int getNumericInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Input var ikke et tal. Prøv igen");
            }
        }
    }

    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }

}
