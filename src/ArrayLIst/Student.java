package ArrayLIst;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private int id_num;
    private static int id = 1000;
    ArrayList<Subject> list;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        id_num = id;
        id++ ;
        list = new ArrayList<>();

    }

    public void addSubject(String name , int score){
        Subject subject = new Subject(name, score);
        list.add(subject);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId_num() {
        return id_num;
    }

    public void showInfo(){
        int total = 0;

        for(Subject s : list){
            total += s.getSubject_Score();
            System.out.println(name+"학생의"+s.getSubject_name()+"과목의 점수는 "+ s.getSubject_Score()+"입니다.");
        }
        System.out.println("이름 :" + name + " , 학번 :" + id_num + " , 나이:" + age + "총점 : " +total + "입니다." );
    }

}
