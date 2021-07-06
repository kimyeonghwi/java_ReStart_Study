package class_ex;

public class Student {

   private String student_Name ;
   private int money, grade;

    public Student(String student_Name, int money, int grade) {
        this.student_Name = student_Name;
        this.money = money;
        this.grade = grade;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        money -= 1000;
    }


    public void takeSubway(Subway subway){
        subway.take(1500);
        money -= 1500;
    }

    public void takeTaxi(Taxi taxi){
        taxi.take(10000);
        money -= 10000;
    }

    public void showInfo(){
        System.out.println(student_Name+ "님의 남은돈은 " + money +"입니다.");
    }


}
