import java.util.ArrayList;

public class Basket {
    ArrayList<Product> products = new ArrayList<>();

    double totalPrice = 0;

    public static void main (String[] args){

        //Opretter instans af klassen så jeg kan kalde på metoderne i main
        Basket basket = new Basket();

        //Opretter objekter til indkøbskurven
        Clothes c1 = new Clothes("Sweather","Hvid", 7.5, 500);
        Clothes c2 = new Clothes("Jakke", "Sort", 8, 800);
        basket.addProduct(c1);
        basket.addProduct(c2);

        Electronic e1 = new Electronic("SteelSeries Mus", 36, 600);
        Electronic e2 = new Electronic("Airfryer", 12, 3500);
        basket.addProduct(e1);
        basket.addProduct(e2);

        Food f1 = new Food("Banan", "20 Januar 2025", 3);
        Food f2 = new Food("Leverpostej", "01 Februar 2025", 15);
        basket.addProduct(f1);
        basket.addProduct(f2);

        //(Eksamen) Ekstra tilføjelse i eksamen, for at teste om det stod rigtigt selvom vi tilføjer den hernede
        Clothes c3 = new Clothes("Sokker", "Sorte", 8, 55);

        basket.addProduct(c3);

        basket.printAll();
    }

   public void addProduct(Product product){
        products.add(product);
        //(Eksamen)Fik mig til at tilføje pris for hver gang et produkt blev tilføjet
            totalPrice += product.getPrice();
    }

    public double getTotalPrice(){
        //(Eksamen) Fik mig til at tilføje 5% rabat hvis pris er over 100kr
        if(totalPrice>100){
            System.out.println("Du har købt for over 100kr og får 5% rabat");

        }
        return totalPrice*0.95;
    }

    void printAll(){
        System.out.println("Tøj");
        for (Product p : products){
            if(p instanceof Clothes)
                System.out.println(p.toString());  }

        System.out.println("\n"+"Elektronik");
        for (Product p : products){
            if (p instanceof Electronic)
                System.out.println(p.toString()); }

            System.out.println("\n"+"Fødevare");
            for(Product p : products){
                if(p instanceof Food)
                    System.out.println(p.toString());
            }
        System.out.println("\n"+"I Alt: "+getTotalPrice()+" DKK");

        }




    }


