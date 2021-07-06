package class_ex;

public class Take {

    public static void main(String[] args) {

        Student studentLee = new Student("lee",2000,1);
        Student studentKim = new Student("kim",5000,2);
        Student studentJang = new Student("Jang" , 20000, 3);

        Bus bus100 = new Bus(100);
        studentLee.takeBus(bus100);
        studentLee.showInfo();
        bus100.showInfo();

        Subway subway1 = new Subway(1);
        studentKim.takeSubway(subway1);
        studentKim.showInfo();
        subway1.showInfo();

        Taxi taxi = new Taxi("카카오택시");
        studentJang.takeTaxi(taxi);
        studentJang.showInfo();
        taxi.showInfo();


        //여기부터가 카페로 실습한 구역임.

        Student student2 = new Student("Mulok" , 10000, 1);
        Student student1 = new Student("Mulok" , 10000, 1);
        Cafe star = new Cafe("starCafe" , 4000);
        Cafe kong = new Cafe("CongCafe" , 4500);

        student1.buyCoffee(star,star.getPrice());
        student1.showInfo();
        star.showInfo();

        student2.buyCoffee(kong, kong.getPrice());
        student2.showInfo();
        kong.showInfo();

    }
}
