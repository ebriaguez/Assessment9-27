import java.util.ArrayList;

public class ShopApp {
    public static void main(String[] args) {

        Clothing itemOne = new Clothing("t-shirt", 12.99, 'M');
        Clothing itemTwo = new Clothing("jeans", 20.00, '7');
        Clothing itemThree = new Clothing("shoes", 45.99, '9');


        Clothing[] employeeCart = {itemOne, itemTwo, itemThree};
        Clothing[] managerCart = {itemOne, itemTwo, itemThree};

        Manager manager = new Manager("Sam", managerCart, 'M');
        HourlyEmployee employeeOne = new HourlyEmployee("Bobby", employeeCart, 'L');

        System.out.println(employeeOne.calcDiscount());
        System.out.println(manager.calcDiscount());
    }
}
