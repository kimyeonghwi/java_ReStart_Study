package class_ex;

public class Subway {

    int subwayLine, passengerCount , money;

    public Subway(int subwayLine) {
        this.subwayLine = subwayLine;

    }

    public void take(int money){
        this.money += money;
        passengerCount ++;

    }

    public void showInfo(){
        System.out.println("지하철" +subwayLine +"호선의 승객은" + passengerCount + "이고 수익은 :" + money+ "입니다."  );
    }

}
