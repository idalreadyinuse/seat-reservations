package main;

import java.util.Arrays;

public class SeatReservations {

    public static int noOfAvailableThreeTogether(int rows, String taken) {

        int availableGroups = rows * 3;

        String [] reservedSeats = taken.split(" ");

        System.out.println("Reserved seats details: " + Arrays.toString(reservedSeats));

        if (reservedSeats[0].contains("A")) {
            availableGroups = availableGroups -1;
        }

        return availableGroups;

    }

}
