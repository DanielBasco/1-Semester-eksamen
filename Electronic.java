public class Electronic extends Product{

    int warrantyNoOfMonths;

    Electronic(String name, int warrantyNoOfMonths, double price){
        super(name, price);
        this.warrantyNoOfMonths = warrantyNoOfMonths;
    }





    public String toString(){
        return name+", "+warrantyNoOfMonths+" måneders garanti: "+price+" DKK";
    }

}
