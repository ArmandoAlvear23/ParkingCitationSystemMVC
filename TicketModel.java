/**
 *@author Armando Alvear - 0254934
 *Software Engineering
 *CSCI 3340-02 - Spring 2018
 *Project 03 - PARKING CITATION MVC
 */

package ticket;

import java.util.ArrayList;

public class TicketModel {
    
    //Initialize an array data structure of class Ticket
    private ArrayList<Ticket> ticketDB = new ArrayList<>();
    
    //Initialize a current Ticket object
    private Ticket currentTicket = new Ticket();

    /**
     * @return the ticketDB
     */
    public ArrayList<Ticket> getTicketDB() {
        return ticketDB;
    }

    /**
     * @return the currentTicket
     */
    public Ticket getCurrentTicket() {
        return currentTicket;
    }

    /**
     * @param currentTicket the currentTicket to set
     */
    public void setCurrentTicket(Ticket currentTicket) {
        this.currentTicket = currentTicket;
        ticketDB.add(currentTicket);
    }
    
}