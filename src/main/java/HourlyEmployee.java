import java.util.ArrayList;

public class HourlyEmployee extends Employee implements Discountable{
    private final double DISCOUNT = 0.10;


    public HourlyEmployee(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public double calcDiscount(Clothing clothing) { //
        return clothing.getPrice() * DISCOUNT;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) { //
        System.out.println(clothing.getPrice() - calcDiscount(clothing));
    }
}
