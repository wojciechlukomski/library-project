import org.apache.commons.codec.binary.Base64;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private static Map<String, String> users = new HashMap<String, String>();

    public Login() {
    }

    public static void setUsers(Map<String, String> users) {
        Login.users = users;
    }

    public static Map<String, String> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Login{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void createUser() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj nazwe uzytkownika: ");
            String user = scanner.next();
            if (users.containsKey(user)) {
                System.out.println("Podany uzytkownik istnieje:)  Wprowadz inna nazwe");
                continue;
            } else {
                System.out.println("Podaj haslo: ");
                String password = scanner.next();
                String decodedPassword = new String(Base64.encodeBase64(password.getBytes()));
                users.put(user, decodedPassword);
                System.out.println("Twoja konto zostalo stworzone! Dziekujemy");
                System.out.println(getUsers());
                break;
            }
        } while (true);
    }

    public void logging() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wprowadz nazwe uzytkownika: \n \n(jesli chcesz wrocic do menu, wpisz 'q')");
            String user = scanner.next();

            if (user.equals("q")) {
                break;
            } else if (users.containsKey(user)) {
                System.out.println("Podaj haslo: ");
                String password = scanner.next();
                String encodedPassword = new String(Base64.decodeBase64(users.get(user).getBytes()));
                System.out.println(encodedPassword);

                if (password.equals(encodedPassword)) {
                    System.out.println("Gratulacje! Zalogowales sie na konto: " + user);
                    break;

                } else {
                    System.out.println("wprowadzono zle haslo!");

                }

            } else {
                System.out.println("nie ma takiego uzytkownika.");
                continue;
            }

        } while (true);
    }
}

