package homework2.task2;

import java.util.Objects;

public class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book bk = (Book) o;
        return name.equals(bk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
