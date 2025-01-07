public class Food extends Product{

    String expireDate;

    Food(String name, String expireDate, double price){
        super(name, price);
        this.expireDate = expireDate;
    }


    public String toString(){
        return name+", "+expireDate+": "+price+" DKK";
    }
}
