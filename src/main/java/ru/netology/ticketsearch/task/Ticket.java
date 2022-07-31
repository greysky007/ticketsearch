package ru.netology.ticketsearch.task;
public class Ticket implements Comparable<Ticket> {

    protected int id;
    protected int amount;
    protected String departure;
    protected String arrival;
    protected int time;

    public Ticket(int id, int amount, String departure, String arrival, int time) {
        this.id = id;
        this.amount = amount;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public int getTime() {
        return time;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    @Override
    public int compareTo(Ticket o) {
        if (this.amount < o.amount) {
            return -1;
        } else if (this.amount > o.amount) {
            return 1;
        } else {
            return 0;
        }
    }
}



