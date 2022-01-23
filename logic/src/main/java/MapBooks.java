import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;


public class MapBooks {
    public static void main(String[] args) {

        // parsowanie z mapy do jsona za pomoca builderaGson
        Gson gson = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create(); //zeby ladnie wyswietlalo
        String uniqueMapJson = gson.toJson(createUniqueListOfBooks());
        String mapJson = gson.toJson(createMap());

        showUniqueBooks(uniqueMapJson);
//        showAvailableBooks(mapJson);
    }

    public static void showUniqueBooks(String uniqueMapJson) {

        System.out.println("List of books: ");
        System.out.printf("JSON format: %s", uniqueMapJson);

    }

    public static void showAvailableBooks(String mapJson) {

        System.out.println("Currently available books: ");
        System.out.printf("JSON: %s", mapJson);

    }

    public static Map<Integer, Book> createMap() {
        // Creating map of books
        Map<Integer, Book> map = new HashMap<>();

        // Creating books
        Book b1 = new Book(1, "lord of the rings", "J.R.R Tolkien", Genre.FANTASY);
        Book b2 = new Book(2, "game of thrones", "George RR Martin", Genre.FANTASY);
        Book b3 = new Book(3, "american gods", "Neil Gaiman", Genre.FANTASY);
        Book b4 = new Book(4, "the erathsea quarter", "Ursula Le Guin", Genre.FANTASY);
        Book b5 = new Book(5, "the perfect escape", "Leah Konen", Genre.THRILLER);
        Book b6 = new Book(6, "beach wedding", "Michael Ledwidge", Genre.THRILLER);
        Book b7 = new Book(7, "left you dead", "Peter James", Genre.THRILLER);
        Book b8 = new Book(8, "the paradox hotel", "Rob Hart", Genre.THRILLER);
        Book b9 = new Book(9, "romeo and juliet", "William Shakespeare", Genre.DRAMA);
        Book b10 = new Book(10, "makbet", "William Shakespeare", Genre.DRAMA);
        Book b11 = new Book(11, "hamlet", "William Shakespeare", Genre.DRAMA);
        Book b12 = new Book(12, "before i go to sleep", "S.J. Watson", Genre.DRAMA);
        Book b13 = new Book(13, "alexander hamilton", "Ron Chernow", Genre.BIOGRAPHY);
        Book b14 = new Book(14, "churchill", "Martin Gilbert", Genre.BIOGRAPHY);
        Book b15 = new Book(15, "enrique's journey", "Sonia Nazario", Genre.BIOGRAPHY);
        Book b16 = new Book(16, "into the wild", "Jon Krakauer", Genre.BIOGRAPHY);

        Book b17 = new Book(17, "lord of the rings", "J.R.R Tolkien", Genre.FANTASY);
        Book b18 = new Book(18, "game of thrones", "George RR Martin", Genre.FANTASY);
        Book b19 = new Book(19, "american gods", "Neil Gaiman", Genre.FANTASY);
        Book b20 = new Book(20, "the erathsea quarter", "Ursula Le Guin", Genre.FANTASY);
        Book b21 = new Book(21, "the perfect escape", "Leah Konen", Genre.THRILLER);
        Book b22 = new Book(22, "beach wedding", "Michael Ledwidge", Genre.THRILLER);
        Book b23 = new Book(23, "left you dead", "Peter James", Genre.THRILLER);
        Book b24 = new Book(24, "the paradox hotel", "Rob Hart", Genre.THRILLER);
        Book b25 = new Book(25, "romeo and juliet", "William Shakespeare", Genre.DRAMA);
        Book b26 = new Book(26, "makbet", "William Shakespeare", Genre.DRAMA);
        Book b27 = new Book(27, "hamlet", "William Shakespeare", Genre.DRAMA);
        Book b28 = new Book(28, "before i go to sleep", "S.J. Watson", Genre.DRAMA);
        Book b29 = new Book(29, "alexander hamilton", "Ron Chernow", Genre.BIOGRAPHY);
        Book b30 = new Book(30, "churchill", "Martin Gilbert", Genre.BIOGRAPHY);
        Book b31 = new Book(31, "enrique's journey", "Sonia Nazario", Genre.BIOGRAPHY);
        Book b32 = new Book(32, "into the wild", "Jon Krakauer", Genre.BIOGRAPHY);

        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        map.put(4, b4);
        map.put(5, b5);
        map.put(6, b6);
        map.put(7, b7);
        map.put(8, b8);
        map.put(9, b9);
        map.put(10, b10);
        map.put(11, b11);
        map.put(12, b12);
        map.put(13, b13);
        map.put(14, b14);
        map.put(15, b15);
        map.put(16, b16);
        map.put(17, b17);
        map.put(18, b18);
        map.put(19, b19);
        map.put(20, b20);
        map.put(21, b21);
        map.put(22, b22);
        map.put(23, b23);
        map.put(24, b24);
        map.put(25, b25);
        map.put(26, b26);
        map.put(27, b27);
        map.put(28, b28);
        map.put(29, b29);
        map.put(30, b30);
        map.put(31, b31);
        map.put(32, b32);

        return map;
    }
    public static Set<Book> createUniqueListOfBooks (){

        Set<Book> linkedHashSet = new LinkedHashSet<>(createMap().values());

        // ta sama opcja co wyzej tylko za pomoca TreeSet, ktory domyslnie sortuje rosnaco

        return linkedHashSet;

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




