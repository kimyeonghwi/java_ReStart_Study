package beyul;

public class Student {

    String name;
    int num;

    public Student(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void showInfo(){
        System.out.println(num+","+name);
    }

}
