package ArrayLIst;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {

   /*    Student lee = new Student("아옳0" , 10);

       Student tee = new Student("아옳옳" , 10);

       lee.addSubject("컴활" , 70);
       lee.addSubject("과학" , 40);
       lee.addSubject("국어" , 50);

       tee.addSubject("컴활" , 90);
       tee.addSubject("과학" , 85);
       tee.addSubject("국어" , 91);


       lee.showInfo();
       System.out.println("====================");
       tee.showInfo();
       */


        Dog[] dogs = new Dog[5];

        dogs[0] = new Dog("꼬꼬", "불독");
        dogs[1] = new Dog("꼬꼬1", "똥개");
        dogs[2] = new Dog("꼬꼬2", "리트리버");
        dogs[3] = new Dog("꼬꼬3", "코카");
        dogs[4] = new Dog("꼬꼬4", "포메");


        for (Dog d : dogs){
            d.showInfo();
        }

    }


}
