package entities;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public Book(){
        this.name = "Название";
        this.author = "Автор";
    }

    private void setName(String name) {
        this.name = name;
    }
    private String getName() {
        return this.name;
    }

    private void setAuthor(String author) {
        this.author = author;
    }
    private String getAuthor() {
        return this.author;
    }

    @Override
    public String toString(){
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + '\'' +
                '}';
    }
}
