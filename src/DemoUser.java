import model.Car;
import model.FamiliCar;
import model.User;

import java.util.*;
import java.util.stream.Collectors;

public class DemoUser {
    public static void main(String[] args) {

//typ nazwy = wartość
        User user1 = new User("Baretk", "Pekacki","asdasd@wp.pl", 38, true);


        user1.introduceYourself();
        System.out.println(user1.isAdult());
        user1.metodaZParametrem("Mariusz nauka java");

        User user2 = new User("Marek", "Kowalski","xxxxxx@wp.pl", 17, false);
        user2.introduceYourself();
        System.out.println(user2.isAdult());
        user2.metodaZParametremi("Mariusz nauka java", "dupa");
        user2.metodaZParametrem("Mariusz nnnn", "xxxxxxx");

        FamiliCar familiCar = new FamiliCar("BMW", "X3", "2.0", "SUV");
        familiCar.describeCar();


//kolekcja zbiur elementów tego samego typu
     //    1. lista - element1 element2 element3

        List<String> namesList = new ArrayList<String>();
        namesList.add("Bartek");
        namesList.add("Antek");
        namesList.add("Filip");
        namesList.add("Artur");
        namesList.add("Romek");

        System.out.println(namesList.size());
        System.out.println(namesList.get(1));


        // pętle

        for (int i = 0; i < namesList.size(); i++){
            System.out.println(namesList.get(i));
        }
        
      //  foreatch - przechodzi przez wszystkie wartości tablicy 

        for (String name: namesList) {
            System.out.println(name);
        }


        List<User> users = new ArrayList<User>();
        users.add(new User ("marcelina", "mariusz", "asdad@wp.pl", 22, true));
        users.add(new User ("marcelina1", "mariusz1", "asdad@wp1.pl", 221, false));
        users.add(new User ("marcelina2", "mariusz2", "asdad@wp2.pl", 222, true));

        for (User user : users) {
            user.introduceYourself();
        }

        // Mapa - klucz i wartość

        Map<Integer, String> namesMap = new HashMap<Integer, String>();

        namesMap.put(1, "Bartek");
        namesMap.put(2, "Mariusz");
        namesMap.put(3, "Tomasz");
        namesMap.put(4, "Remek");

        System.out.println(namesMap.get(2));

     //    for eatch dla Map
        for (Map.Entry<Integer, String> entry :namesMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        // kolekcja SET - przetrzymywanie unikalnych wartości

        Set<String> namesSet = new HashSet<String>();

        namesSet.add(("Bartek"));
        namesSet.add(("Bartek"));
        namesSet.add(("Mariusz"));

        System.out.println(namesSet.size());

        for (String name: namesSet) {
            System.out.println(name);
        }




        // STREAMY - strumienie wartości do obsługi kolekcji

        // 1. metody posrednie - zwracają nowe streamy
        // - filter - filtrowanie elementów
        // - przekształcanie elementów
        // 2. metody terminalne - są wykonane jako ostatnie - zwracają wartość, pozwalają zebrać wartość do kolekcji
        // foreatch - wyświetlanie dokumentów
        // min/ max/ sum - do wyciagnia minimalnej max i sumy wartość
        // anyMatch / allMatch / nonMatch - zwróci true lub false dla jednego wsztstkich oraz którego kolwiek elemenetu
        // count
        // collect - zmieranie elementów

        List<String> namess = new ArrayList<>();
        namess.add("Bartek");
        namess.add("Antek");
        namess.add("Filip");
        namess.add("Frtur");
        namess.add("Romek");

        for (String namex:namess) {
            if(namex.endsWith("k")){
                System.out.println(namex);
            }
        }

        //stream // metoda filters służy do ofiltrowywania elementów
 //       namess.stream()
 //               .filter(namec->namec.startsWith("F"))
 //               .forEach((namec-> System.out.println(namec)));
              //  .forEach(System.out::println);

        // zliczanie użytkowników
 //       long numberOfFNames = namess.stream()
 //               .filter(namec -> namec.startsWith("F"))
 //               .count();
 //       System.out.println(numberOfFNames);



        // map - zmaina czegoś na coś
 //       namess.stream()
 //               .map(name -> name.toUpperCase())
  //              .forEach(System.out::println);

  //      namess.stream()
   //             .map(name -> name.toUpperCase() + " jakiś test")
   //             .forEach(System.out::println);


        // czy wszytskie imiona konczą się na k - anyMatch

  //      boolean anyMatchEndsWithK = namess.stream()
  //              .anyMatch(name -> name.endsWith("k"));
  //      System.out.println(anyMatchEndsWithK);

   //     List<String> namesStartsWithF = namess.stream()
   //             .filter(name -> name.startsWith("F"))
   //             .filter(name -> !name.endsWith("k"))
  //              .collect(Collectors.toList());             // collect twoży nową kolekcje którą niżej pokazujemy

  //      namesStartsWithF.stream()                           // tu pokazujemy ta kolekcje
  //              .forEach(System.out::println);


        //Stremy na objektach

   //     List<User> usersx = new ArrayList<>();
  //      usersx.add(new User ("Marcelina", "Kowal", "asdad@wp22.pl", 222222, true));
 //       usersx.add(new User ("Monika", "Stasiek", "asdad@wp122.org", 221, false));
//        usersx.add(new User ("Mariusz", "Janusz", "asdad@wp2222222.eu", 222, true));


        // wyciągniecie ludzi co w nazwie emaila PL
   //     usersx.stream()
    //            .filter(user ->user.getEmail().endsWith(".pl"))
     //           .forEach(System.out::println);


        // wychągnięcie ludzi co nie lubią lodów
   //     usersx.stream()
     //           .filter(user->user.isLikeIceCream().equals(false))
   //             .forEach(System.out::println);

        // wyciągniecie ludzi co mają wiek wiekszy niż 223 lata

     //   usersx.stream()
     //           .filter(user -> user.getAge() >223)
   //             .forEach(System.out::println);

        // wyciągniecie użytkownika z minimalnym wiekiem

    //    User theYoungestUser = usersx.stream()
    //            .min(Comparator.comparing(user -> user.getAge()))
   //             .get();
  //      System.out.println(theYoungestUser);
    }
}
