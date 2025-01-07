public class Clothes extends Product {

    double size;
    String color;

   public Clothes(String name, String color, double size, double price){

        //Super() snupper name og price fra Product klassens konstruktør
        super(name, price);
        this.size = size;
        this.color = color;

    }



    public String toString(){
       return name+", "+color+", Str. "+size+": "+price+" DKK";
   }


}
