package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelReservationSystem {
    /*
     * Created a array list name as hotels.
     */
    public static List<Hotel> hotels = new ArrayList<>();
    /*
     * Created a method addHotel to add the hotels in the array list.
     */
    public void addHotel(Hotel  hotel)
    {
        hotels.add(hotel);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");
    }
}
