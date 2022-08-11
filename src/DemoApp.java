public class DemoApp {
    public static void main(String[] args) {

      //  typy danych

        System.out.println(10);
        System.out.println(20.2);
        System.out.println("testuje");
        System.out.println("x");
        System.out.println(true);
        System.out.println(false);


        /// zmienne
        /// typ nazwa = wartość;
        int number = 10;
        double dubleNumber = 20.3;
        String name = "Mariusz";
        char x = 'x';
        Boolean isTrue = true;
        Boolean isFalse = false;

        System.out.println(number);
        System.out.println(dubleNumber);
        System.out.println(name);
        System.out.println(x);
        System.out.println(isTrue);
        System.out.println(isFalse);

        System.out.println("cześć jestem "+ name +" i "+ name +" jest z nami "+ name +"");


       // Operatory

        double num1 = 10;
        double num2 = 4;
        System.out.println(10 + 10);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 2);
        System.out.println(num1 / num2);
        System.out.println(10 > 9);
        System.out.println(10 < 9);
        System.out.println(10 == 9);
        System.out.println(10 != 9);

       // operator i = &&

        System.out.println(10 == 10 && 20>9);

        // operator or/lub = ||

        System.out.println(10 != 10 || 20<9);
    }
}

