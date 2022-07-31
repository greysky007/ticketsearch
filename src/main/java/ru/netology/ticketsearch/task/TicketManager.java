package ru.netology.ticketsearch.task;

import java.util.Arrays;

public class TicketManager {
private TicketRepository repo;
    public TicketManager(TicketRepository repo) {
        this.repo = repo;
    }

    public void add(Ticket item) {
        repo.save(item);
    }


    public Ticket[] searchBy(String from, String to) {

        Ticket[] result = new Ticket[0]; // тут будем хранить подошедшие запросу продукты
        for (Ticket item : repo.getItems()) {
            if (matches(item, from, to)) {

                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = item;
                result = tmp;

                // "добавляем в конец" массива result продукт product
            }
        }
        return result;
    }


    public boolean matches(Ticket item, String from, String to) {
        if (item.getDeparture().contains(from) && item.getArrival().contains(to)) {
            return true;
        } else {
            return false;
        }
    }

}
