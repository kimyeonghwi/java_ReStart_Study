package beyul;

public class main1 {

    public static void main(String[] args) {
/*      배열 사용 실습 훈련
        String[] a = {"바보" , "멀록" , "멍청이"};
        Student[] b = new Student[3];

        for(int i=0;i<b.length;i++){
           b[i] = new Student(a[i], i);
           b[i].showInfo();
        }
        */

        // 배열 복사하기
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20, 30, 40, 50};
        // 아래 스테틱 메소드 사용하여 복사
        System.arraycopy(a, 0, b, 2, 3);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }



        // 배열 인스턴스 복사 얕은 복사
        // 여기서부터 실행 해본다면 얕은 복사라서 같은 인스턴스를 바라보기 때문에 한곳이 변경되어도 다 변경이 된다.
        Student[] c = new Student[3];
        Student[] d = new Student[3];

        c[0] = new Student("바보" ,1 );
        c[1] = new Student("멍청이" ,2 );
        c[2] = new Student("멀록" ,3 );

        System.arraycopy(c,0,d,0,3);

        for (int i = 0; i < d.length; i++) {
           d[i].showInfo();
        }

        c[0].setName("호롤롤로");
        c[0].setNum(1000);
        System.out.println("=====c=====");
        for (int i = 0; i < c.length; i++) {
            c[i].showInfo();
        }

        System.out.println("=====d=====");
        for (int i = 0; i < d.length; i++) {
            d[i].showInfo();
        }


        //아래부터 깊은 복사

        Student[] a1 = new Student[3];
        Student[] b1 = new Student[3];

        a1[0] = new Student("바보" ,1 );
        a1[1] = new Student("멍청이" ,2 );
        a1[2] = new Student("멀록" ,3 );

        //디폴트 생성자 만들어서 이렇게 활용 한뒤에 하나 씩 넣어준다.
        //따로 객체를 갖기위하여 이렇게 해준다
        b1[0] = new Student();
        b1[1] = new Student();
        b1[2] = new Student();

        for (int i = 0; i < a1.length; i++) {
            b1[i].setName(a1[i].getName());
            b1[i].setNum(a1[i].getNum());

        }

        a1[0].setName("호롤롤로");
        a1[0].setNum(1000);

        System.out.println("=====a1=====");
        for (int i = 0; i < a1.length; i++) {
            a1[i].showInfo();
        }

        System.out.println("=====b1=====");
        for (int i = 0; i < b1.length; i++) {
            b1[i].showInfo();
        }

        //for - each문
        String[] asd = {"a" ,"b","c"};
        // asd의 각 요소가 sss에 들어가면서 출력한다.
        for (String sss : asd){
            System.out.println(sss);
        }



    }
}
