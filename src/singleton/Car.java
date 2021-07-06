package singleton;

public class Car {
    static int serialNum = 10000;
    private int car_Id;
    private String car_name;

    public Car(String car_name) {
        this.car_name = car_name;
        serialNum++;
        car_Id = serialNum;

    }

    public int getCar_Id() {
        return car_Id;
    }

    public void setCar_Id(int car_Id) {
        this.car_Id = car_Id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }
}
