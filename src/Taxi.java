public class Taxi {
    String name;
    int money, today_Customer_Count;

    public Taxi(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money += money;
        today_Customer_Count ++;
    }

    public void showInfo(){
        System.out.println(name+"의 오늘 수입은 "+ money+ "이고 총 승객은 "+ today_Customer_Count+ "이다");
    }

}
