package singleton;

public class CompanyTest {
    public static void main(String[] args) {
        Company company = Company.getInstance();
        Company company1 = Company.getInstance();

        System.out.println(company == company1);

        Car sonata = company.createCar("sonata");
        Car bMW = company.createCar("BMW");

        System.out.println("차량 번호"+sonata.getCar_Id()+"차량이름"+sonata.getCar_name());
        System.out.println("차량 번호"+bMW.getCar_Id()+"차량이름"+bMW.getCar_name());



    }
}
