package extendss;

public class Customer {

    protected int customerId;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRat;

    public Customer(){
        customerGrade = "SILVER";
        bonusRat = 0.01;
        System.out.println("커스터머 생성자");
    }

    public int calcPrice(int price){
        bonusPoint += price * bonusRat;
        return price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showInfo(){
        return customerName + " 님의 등급은 " + customerGrade + "이며 , 남은 보너스 포인트는" + bonusPoint + "입니다.";
    }
}
