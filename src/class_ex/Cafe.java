package class_ex;

public class Cafe {
    private int money, price ,customer_count;
    private String name;


    public Cafe(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void buy(int price) {
        customer_count ++;
        money += price;
    }

    public int getPrice() {
        return price;
    }

    public void showInfo(){
        System.out.println("카페" +name+ "의 총 고객은 " + customer_count + "이고 수익은 :" + money+ "입니다."  );
    }

}
