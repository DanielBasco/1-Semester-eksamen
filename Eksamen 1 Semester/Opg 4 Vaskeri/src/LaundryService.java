import java.util.ArrayList;
import java.util.Scanner;

public class LaundryService {
    Scanner scanner;
    public ArrayList<LaundryMachine> machines;

    LaundryService(){
        this.scanner = new Scanner(System.in);
        machines = new ArrayList<>();
    }

    void addMachine(LaundryMachine machine){
        machines.add(machine);
    }

    LaundryMachine chooseMachine() {
        System.out.println("Vælg en maskine: ");
       for (int i = 0; i<machines.size(); i++){
           System.out.println((i+1)+ ") "+machines.get(i).getName());
       }
        int answer = scanner.nextInt();
        if (answer < 1 || answer > 4) {
            System.out.println("De skal indtaste mellem tallene 1 og 4");
           return chooseMachine();
        } else {
            return machines.get(answer - 1);
        }
    }



}
