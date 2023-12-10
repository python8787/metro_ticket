package com.example.metroticket.service;

public interface TicketService {
    String bookTicket(String startStationCode, String endStationCode);
    boolean useTicket(String ticketId, String stationCode);
}
