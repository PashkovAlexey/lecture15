package ru.bank.queue;

import ru.bank.queue.model.Client;
import ru.bank.queue.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class BankService {

    private final Client CLIENT_1 = new Client("Вася Пупкин", "6123 777333", "1");
    private final Client CLIENT_2 = new Client("Иван Васильевич", "2123 444555", "3");
    private final Client CLIENT_3 = new Client("Нина Петровна", "1232 457364", "5");
    private final Client CLIENT_4 = new Client("Сергей Владимирович", "6798 867856", "10");
    private final Client CLIENT_5 = new Client("Сергей Петров", "4566 458953", "13");
    private final Client CLIENT_6 = new Client("Ivan", "4566 458953", "15");


    private List<Client> clients = List.of(CLIENT_1, CLIENT_2, CLIENT_3, CLIENT_4, CLIENT_5, CLIENT_6);

    private List<Client> tickets = new ArrayList<>();
    private List<Client> ticketToClient = new ArrayList<>();

    public int giveMeTicket(String uslugaType, String clientId){
        int newTicketNumber = tickets.size();
        tickets.add(getClientById(clientId));

        return newTicketNumber;

    }

    private Client getClientById(String clientId) {
        for (Client currentClient : clients)
            if(currentClient != null && currentClient.getClientId().equals(clientId)){
                return currentClient;
            }
        return null;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<Client> getTickets() {
        return tickets;
    }

    public void setTickets(List<Client> tickets) {
        this.tickets = tickets;
    }

    public List<Client> getTicketToClient() {
        return ticketToClient;
    }

    public void setTicketToClient(List<Client> ticketToClient) {
        this.ticketToClient = ticketToClient;
    }
}
