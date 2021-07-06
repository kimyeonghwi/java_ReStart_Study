package class_ex;

public class Bus {
    int busNumber, passengerCount , money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;

    }

    public void take(int money){
        this.money += money;
        passengerCount ++;

    }

    public void showInfo(){
        System.out.println("버스" +busNumber +"번의 승객은" + passengerCount + "이고 수익은 :" + money+ "입니다."  );
    }

}
