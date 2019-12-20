import java.util.ArrayList;
import java.util.List;

public class CustomerDB {
   final static List<Customer> customers = new ArrayList<Customer>();

    static {
        Customer customer = new Customer();
        customer.setName("diem");
        customer.setAddress("nha");
        customer.setBirthday("11/11/1111");
        customer.setImage("e");

    }
    public void save(Customer customers) {
