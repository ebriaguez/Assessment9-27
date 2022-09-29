import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShopApp {
    public static double calcTotal(Clothing[] clothing){
        double total = 0.0;
        for(int i = 0; i < clothing.length; i++){
            total = clothing[i].getPrice();
        }

        return total;
    }
    public static boolean isAFit(Customer customer,Clothing clothing){

        if(customer.getSize() == clothing.getSize()){
            System.out.println("Does not fit");
            return true;
        }
        return false;

    }
    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothingList){

        Collections.sort(clothingList, Comparator.comparingDouble(Clothing::getPrice));
        clothingList.forEach(clothing -> System.out.println(clothing));


    }
    public static void printEmployeeName(Employee employee){
        System.out.println(employee.getName());

    }
    public static void printDiscAmtOff(Discountable[] discountable, Clothing clothing){

        for(int x = 0; x < discountable.length; x++){
            System.out.println(discountable[x].calcDiscount(clothing));

        }


    }


}
