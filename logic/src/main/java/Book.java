import java.util.Objects;

public class Book  {

    private final int id;
    private final String title;
    private final String author;
    private final Genre genre;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public Book(int id, String title, String author, Genre genre) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre);
    }


}
// 1. czym sie rozni tworzenie mapy od Map<> a Hashmap<> albo Set i hashSet<>  --> Map<integer,String> = new Hashmap a Hashmap<integer,String> = new hashmap
// 2. Jak skonwertowac set na mape zeby miala K,V



