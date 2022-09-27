import java.util.ArrayList;

public class HourlyEmployee extends Employee implements Discountable{


    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public double calcDiscount() {
        double getTotal = getDISCOUNT();
        return getTotal;
    }

    @Override
    public void printEmpPriceAfterDisc() {
        for(int x = 0; x < getClothingItems().length; x++){
            System.out.println(getClothingItems());
        }
    }
}
