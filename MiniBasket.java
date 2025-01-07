import java.util.ArrayList;
//(Eksamen) Fik mig til at tilføje denne klasse så hvis man laver et objekt med
//MiniBasket i main så kan man bruge denne addProduct metode der kun tillader maks 4 items i products liste
public class MiniBasket extends Basket {

    public void addProduct(Product product){
        if(products.size()<4){
            products.add(product);
            totalPrice += product.getPrice();
        }
    }

}
