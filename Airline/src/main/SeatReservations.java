package main;

import java.util.Arrays;

public class SeatReservations {

    public static int noOfAvailableThreeTogether(int rows, String taken) {

        int availableGroups = rows * 3;

        String [] reservedSeats = taken.split(" ");

        System.out.println("Reserved seats details: " + Arrays.toString(reservedSeats));

        String [] groupAtoC = {"A", "B", "C"};
        String [] groupDtoG = {"D", "E", "F", "G"};
        String [] groupHtoK = {"H", "J", "K"};



        for (String reservedSeat : reservedSeats) {

            System.out.println("seat " + reservedSeat);

            // loop through AtoC array and look for match

            for (int i = 0; i < groupAtoC.length; i++) {
                if(reservedSeat.contains(groupAtoC[i])) {
                    availableGroups = availableGroups - 1;
                    break;
                }
            }
            for (int i = 0; i < groupAtoC.length; i++) {
                if(reservedSeat.contains(groupDtoG[i])) {
                    availableGroups = availableGroups - 1;
                    break;
                }
            }for (int i = 0; i < groupAtoC.length; i++) {
                if(reservedSeat.contains(groupHtoK[i])) {
                    availableGroups = availableGroups - 1;
                    break;
                }
            }

        }

        return availableGroups;

    }

}
