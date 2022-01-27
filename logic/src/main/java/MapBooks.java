import java.util.*;

public class MapBooks {
    public static void main(String[] args) {

        menu();
    }

    private static void menu() {
        Login login = new Login();
        OperationsWithBooks operationsWithBooks = new OperationsWithBooks();
        operationsWithBooks.createMap();
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        System.out.println("Witaj w bibliotece online! Wybierz na klawiaturze wybrany numer dzialania;)");
        while (option != 5) {
            System.out.println("1. Stworz konto; 2. Kup książke; 3. Wypożycz książke; 4. Zwroc ksiazke; 5. Zakoncz dzialanie programu;");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    login.createUser();
                    break;
                case 2:
                    if (login.logging()) {
                        operationsWithBooks.buyBook();
                    }
                    break;
                case 3:
                    if (login.logging()) {
                        operationsWithBooks.lendBook();
                    }
                    break;
                case 4:
                    if (login.logging()) {
                        operationsWithBooks.returnBook();
                    }
                    break;
            }
        }
        scanner.close();
        System.out.println("dzieki ze odwiedziles nasz program, do zobaczenia wkrotce :)");
    }

}
// Traversing map
//        for (Map.Entry<Integer, Book> entry : map.entrySet()) { // using map.entrySet() for iteration
//            int key = entry.getKey(); // definiuje key
//            Book b = entry.getValue(); // definiuje value
//            System.out.println(key + " Details:");
//            System.out.println("    " +b.getId()+ " "+ b.getTitle() +" by "+ b.getAuthor()+ " "+ b.getGenre());
//        }

// SORTOWANIE ZA POMOCA STREAMA
//        //Returns a Set view of the mappings contained in this map
//        map.entrySet()
//                //Returns a sequential Stream with this collection as its source
//                .stream()
//                //Sorted according to the provided Comparator
//                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
//                //Performs an action for each element of this stream
//                .forEach(System.out::println);




