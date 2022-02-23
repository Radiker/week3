package entities;

import java.util.ArrayList;
import java.util.List;

public class Client extends AbstractUser {
    private Boolean banned;
    private List<Book> books;

    public Client(){
        super();
        this.banned = false;
        this.books = new ArrayList<>();
    }

    public Client(String firstName, String lastName, String middleName, String phone, Boolean banned, List<Book> books){
        super(firstName, lastName, middleName, phone);
        this.banned = banned;
        this.books = books;
    }
}
