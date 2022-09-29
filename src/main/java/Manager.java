import java.util.ArrayList;

public class Manager extends Employee implements Discountable {

    private final double DISCOUNT = 0.25;

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    public double getDiscount(){ //
        return DISCOUNT;
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothing) {
        System.out.println(clothing.getPrice() - calcDiscount(clothing));

    }


    @Override
    public double calcDiscount(Clothing clothing) {
        return clothing.getPrice() * DISCOUNT;
    }
}
