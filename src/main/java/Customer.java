import java.util.ArrayList;

public abstract class Customer extends Person {

    private Clothing[] clothingItems;
    private char size;

    public Customer(String name, Clothing[] clothingItems, char size) {
        super(name);
        this.clothingItems = clothingItems;
        this.size = size;
    }

    //
   public Customer(String name, String description, double price, char size){
        super(name);
   }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + clothingItems +
                ", size=" + size +
                '}';
    }
}
