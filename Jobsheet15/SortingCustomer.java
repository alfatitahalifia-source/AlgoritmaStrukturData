import java.util.ArrayList;

public class SortingCustomer {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "Zakia"));
        customers.add(new Customer(5, "Budi"));
        customers.add(new Customer(4, "Cica"));
        customers.sort((c1, c2) ->
            c1.name.compareTo(c2.name));
        System.out.println(customers);
    }
}
