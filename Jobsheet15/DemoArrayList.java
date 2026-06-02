import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>(2);
        Customer customer1 = new Customer(1, "Zakia");
        Customer customer2 = new Customer(2, "Budi");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(new Customer(4, "Cica"));
        customers.add(2, new Customer(100, "Rosa"));
        System.out.println(customers.indexOf(customer2));
        Customer customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
        ArrayList<Customer> newcustomers = new ArrayList<Customer>();
        newcustomers.add(new Customer(201, "Della"));
        newcustomers.add(new Customer(202, "Victor"));
        newcustomers.add(new Customer(203, "Sarah"));
        customers.addAll(newcustomers);

        for (Customer cust : customers) {
            System.out.println(cust.toString());
        }
        System.out.println(customers);
    }
}
