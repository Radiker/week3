package controller.impl;

import entities.Admin;
import entities.Book;
import entities.Client;
import services.AdminService;
import services.ClientService;

import java.util.List;

public class LibraryAPIServiceImpl {
    private final AdminService adminService;
    private final ClientService clientService;

    public LibraryAPIServiceImpl(AdminService adminService, ClientService clientService) {
        this.adminService = adminService;
        this.clientService = clientService;
    }

    void ban(Admin admin, Client client){
        adminService.ban(client);
        System.out.printf("admin %s successfully banned client %s\n", admin.getPhone(), client.getPhone());
    }
    void unban(Admin admin, Client client){
        adminService.unban(client);
        System.out.printf("admin %s successfully unbanned client %s\n", admin.getPhone(), client.getPhone());
    }
    void takeBooks(Client client, List<Book> books){
        if(!client.getBanned()){
            clientService.takeBooks(client, books);
        }
        else
            System.out.printf("Client %s can't take books because he's banned\n", client.getPhone());
    }
    void returnBooks(Client client, List<Book> books){
        clientService.returnBooks(client, books);
        System.out.printf("Client %s returned books %s", client.getPhone(), client.getBooks());
    }
}
