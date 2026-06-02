import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>(2);

        customers.add(new Customer(1, "Zakia"));
        customers.add(new Customer(2, "Budi"));

        customers.add(new Customer(3, "Cica"));

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
    }
}
