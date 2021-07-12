package extendss;

public class VipCustomer extends Customer{

    private int agentId;
    double saleRat;

    public VipCustomer(){
        customerGrade = "VIP";
        bonusRat = 0.05;
        saleRat = 0.1;
        System.out.println("비아피 생성자  생성자");
    }



    public int getAgentId(){
        return agentId;
    }

}
