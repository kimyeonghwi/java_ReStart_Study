package singleton;

public class Company {
    //싱글톤은 다른곳에서 인스턴스 생성못하도록
    //생성자를 private 으로 만들어줌
    //1단계
    private Company(){}

    //2단계
    //유일하게 생성한 인스턴스
    private static Company instance = new Company();

    //3단계
    //외부에서 참조할 수 있는 public 메서드 만들기

    public static Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

    //4단계 다른 클래스에서 확인 해보기

    //여기메소드는 실습 메소드이다.
    public Car createCar(String name){
        Car car = new Car(name);
        return car;
    }

}
