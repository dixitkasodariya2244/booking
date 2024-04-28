package org.example.controller;

import org.example.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/cinema")
public class Bookingcontroller {
    List<Ticket> ticketList = new ArrayList<>();

    @PostMapping(path = "/tickets")
    public Ticket addTicket(@RequestBody Ticket ticket){
        ticketList.add(ticket);
        return ticket;
    }


    @GetMapping(path = "/tickets")
    public List<Ticket> getTicket(){
        return ticketList;
    }
}
