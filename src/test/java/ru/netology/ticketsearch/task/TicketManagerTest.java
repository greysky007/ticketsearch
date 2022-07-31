
package ru.netology.ticketsearch.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TicketManagerTest {
    TicketRepository repo = new TicketRepository();

    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(1, 1200, "ABA", "SBO", 600);
    Ticket ticket2 = new Ticket(2, 1500, "DME", "NBC", 300);
    Ticket ticket3 = new Ticket(3, 2300, "ESB", "KVK", 120);
    Ticket ticket4 = new Ticket(4, 1000, "DME", "NBC", 170);
    Ticket ticket5 = new Ticket(5, 900, "VKO", "BQT", 350);
    Ticket ticket6 = new Ticket(6, 3500, "DME", "NBC", 275);
    Ticket ticket7 = new Ticket(7, 5000, "JOK", "KVR", 168);
    Ticket ticket8 = new Ticket(8, 40000, "NYR", "OMS", 240);


    @BeforeEach
    public void setup() {
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Arrays.sort(repo.getItems());
    }

    @Test
    public void shouldSearch() {
        Ticket[] expected = {ticket4, ticket2, ticket6};
        Ticket[] actual = manager.searchBy("DME", "NBC");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSort() {
        Ticket[] expected = {ticket5, ticket4, ticket1, ticket2, ticket3, ticket6, ticket7, ticket8};
        Ticket[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

}
