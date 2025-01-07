public abstract class Product {

    //(Eksamen) Skal tilføje private foran mine variabler
     String name;
     double price;

    //Konstruktør som de andre klasser kan bruge (Indeholder produktnavn og pris)
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //(Eksamen) Havde kommet til at lave denne metode abstract så alle klasser der extended Product også skulle have den
    public double getPrice(){
        return price;
    }

}
