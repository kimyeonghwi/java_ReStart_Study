package extendss;

public class CustomerTest {
    public static void main(String[] args) {
//        Customer customer = new Customer();
//        customer.setCustomerId(10010);
//        customer.setCustomerName("이순신");
//        customer.bonusPoint = 1000;
//        System.out.println(customer.showInfo());

        VipCustomer vipCustomer = new VipCustomer();
        vipCustomer.setCustomerId(10020);
        vipCustomer.setCustomerName("김유신");
        vipCustomer.bonusPoint= 2000;
        System.out.println(vipCustomer.showInfo());
    }
}
