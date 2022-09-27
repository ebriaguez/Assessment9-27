import java.util.ArrayList;

public class Manager extends Employee implements Discountable {

    public Manager(String name, Clothing[] clothingItems, char size) {
        super(name, clothingItems, size);
    }

    @Override
    public double calcDiscount() {
        double getTotal = getDISCOUNT() + 0.15;
        return getTotal;
    }

    @Override
    public void printEmpPriceAfterDisc() {
        System.out.println(calcDiscount());
    }
}
