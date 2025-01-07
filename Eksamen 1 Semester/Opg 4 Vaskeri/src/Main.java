import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        LaundryService laundryService = new LaundryService();

        WashingMachine washingMachine1 = new WashingMachine(5, "Vaskemaskine1");
        WashingMachine washingMachine2 = new WashingMachine(6, "Vaskemaskine2");
        WashingMachine washingMachine3 = new WashingMachine(7, "Vaskemaskine3");
         Dryer dryer = new Dryer("Tørretumbler1");

        laundryService.addMachine(washingMachine1);
        laundryService.addMachine(washingMachine2);
        laundryService.addMachine(washingMachine3);
        laundryService.addMachine(dryer);


        LaundryMachine currentmachine = laundryService.chooseMachine();
        System.out.println("Du har valgt følgende maskine: "+currentmachine.getName());
        currentmachine.chooseProgram();
        currentmachine.displayPriceAndDuration();
        currentmachine.addExtra();
        currentmachine.displayPriceAndDuration();
        currentmachine.start();
        currentmachine.addExtra();
        currentmachine.displayPriceAndDuration();




    }
}
