package ru.bank.queue;

import ru.bank.queue.model.Client;
import ru.bank.queue.model.Ticket;

import java.util.List;
import java.util.Random;

public class ProjectRunApp {



    public static void main(String[] args) {

        BankService bankService = new BankService();

        bankService.giveMeTicket("Снять деньги", "1");
        bankService.giveMeTicket("Снять деньги", "3");
        bankService.giveMeTicket("Снять деньги", "5");
        bankService.giveMeTicket("Снять деньги", "7");
        bankService.giveMeTicket("Снять деньги", null);


        List<Client> clients = bankService.getClients();
        List<Client> tickets = bankService.getTickets();
        List<Client> ticketToClient = bankService.getTicketToClient();

        printInfo(ticketToClient);

        while (tickets.size() > 0){
            process(tickets);
        }



    }

    private static void process(List<Client> tickets) {
        for (Client clientToProcess : tickets){
            System.out.println("Client processed " + clientToProcess);
            /*tickets.remove(clientToProcess);*/
        }

    }

    private static void printInfo(List<Client> ticketToClient) {
        for (int i = 0; i < ticketToClient.size(); i++){
            Client client = ticketToClient.get(i);
            String s = client != null ? client.toString() : null;
            System.out.println("TicketID: " + i + " Client: " + s);
        }
    }
}
