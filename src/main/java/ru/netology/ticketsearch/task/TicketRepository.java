package ru.netology.ticketsearch.task;

public class TicketRepository {
    private Ticket[] tickets = new Ticket[0];


    public void save(Ticket item) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = item;
        tickets = tmp;
    }

    public void removeById(int id) {

        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket item : tickets) {
            if (item.getId() != id) {
                tmp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }

    public Ticket[] getItems() {
        return tickets;
    }
}
