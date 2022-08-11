package model;

public class User {
    // 1. pola objektu - opisują z czego skłąda się objekt czyli klasa


    ///////modyfikatory dostępu:
    // 1. public - dostępne wszędzie
    // 2. private - dostępne tylko w tej klasie
    // 3. protected - dostępne tylko w klasie która jest dziedziczona lub w tym samym pakiecie, folderze.

    // enkapsulacja - ukrywanie danych (private)
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean likeIceCream;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Boolean isLikeIceCream() {
        return likeIceCream;
    }

    // 2. konstruktor -
    public User(String firstName, String lastName, String email, int age, boolean likeIceCream ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.likeIceCream = likeIceCream;
    }

    // 3. metoda - opisują co obiekt bedzie mogł zrobić

    public void introduceYourself (){
        System.out.println("Mi name is "+ firstName +" "+ lastName +"");
    }

    public Boolean isAdult () {
        if(age>18){
           return  true;
        } else {
            return false;
        }
    }

    public void metodaZParametrem (String parametr){

        System.out.println("Parametr metody: "+ parametr +"");
    }

    public void metodaZParametrem (String parametr, String parametr2){

        System.out.println("Parametr metody: "+ parametr +" "+ parametr2 +"");
    }

    public void metodaZParametremi (String parametr, String parametr2){
        System.out.println("Parametr metody: "+ parametr +" "+ parametr2 +"");
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", likeIceCream=" + likeIceCream +
                '}';
    }
}
