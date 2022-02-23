package services.impl;

import entities.Book;
import entities.Client;

import java.util.List;

public class ClientServiceImpl {
    void takeBooks(Client client, List<Book> books){
        List<Book> clientBooks = client.getBooks();
        clientBooks.addAll(books);
        client.setBooks(clientBooks);
    }
    void returnBooks(Client client, List<Book> books){
        List<Book> clientBooks = client.getBooks();
        clientBooks.removeAll(books);
        client.setBooks(clientBooks);
    }
}
