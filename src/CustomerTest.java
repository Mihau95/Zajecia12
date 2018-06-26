import java.util.*;

public class CustomerTest {
    public static void main(String[] args) {
        TreeMap <Integer, Customer> customers = new TreeMap<>();
        customers.put(2333, new Customer(2333, "Adam", "Woj", 567000));
        customers.put(1243, new Customer(1243, "Jan", "Zizka", 456567));
        customers.put(5433, new Customer(5433, "Anna", "Wybij", 546788));
        customers.put(3444, new Customer(3444, "Patrycja", "Niebita", 433212));



        Set<Integer> keySet = customers.keySet();
        System.out.println(keySet);

        Collection<Customer> values = customers.values();
        for (Customer customer : customers.values()){
            System.out.println(customer);
        }

        System.out.println("Podaj id");
        Scanner scanner = new Scanner(System.in);
        Integer idSet = scanner.nextInt();
        customers.get(idSet);
        if (customers.get(idSet) == null){
            System.out.println("NIe ma klienta o takim numerze id");
        }else {
            System.out.println(customers);
        }
    }
}
