package main;

import java.util.Arrays;

public class Solution {

    public static int solution(int rows, String reservedSeats) {

        final String[] GROUP_1 = {"A", "B", "C"};
        final String[] GROUP_2 = {"D", "E", "F", "G"};
        final String[] GROUP_3 = {"H", "J", "K"};

        int availableGroups = rows * 3;

        String[] reservedSeatsList = reservedSeats.split(" ");

        Arrays.sort(reservedSeatsList);

        for (int x = 1; x <= rows; x++) {

            boolean block1Chkd = false;
            boolean block2Chkd = false;
            boolean block3Chkd = false;
            boolean seatDTaken = false;
            boolean seatGTaken = false;

            for (String reservedSeat : reservedSeatsList) {

                // Checks to see if any seats in group 1 (A-C) are reserved
                for (int i = 0; i < GROUP_1.length; i++) {
                    if (!block1Chkd) {
                        if (reservedSeat.contains(GROUP_1[i]) && reservedSeat
                            .contains(Integer.toString(x))) {
                            availableGroups = availableGroups - 1;
                            block1Chkd = true;
                            break;
                        }
                    }
                }

                // Checks to see if any seats in group 2 (D-G) are reserved
                for (int i = 0; i <= GROUP_2.length; i++) {
                    if (!block2Chkd) {
                        // Checks for seat E or F - if either reserved then Group check is done
                        if (reservedSeat.contains("E") && reservedSeat
                            .contains(Integer.toString(x))
                            || reservedSeat.contains("F") && reservedSeat
                            .contains(Integer.toString(x))) {
                            availableGroups = availableGroups - 1;
                            block2Chkd = true;
                            break;
                        }

                        // Checks to see if D & G are reserved
                        if (reservedSeat.contains("D") && reservedSeat
                            .contains(Integer.toString(x))) {
                            seatDTaken = true;
                        }
                        if (reservedSeat.contains("G") && reservedSeat
                            .contains(Integer.toString(x))) {
                            seatGTaken = true;
                        }
                        // if both are reserved then Group check is done
                        if (seatDTaken && seatGTaken) {
                            availableGroups = availableGroups - 1;
                            block2Chkd = true;
                        }
                    }
                }

                // Checks to see if any seats in group 3 (H-K) are reserved
                for (int i = 0; i < GROUP_3.length; i++) {
                    if (!block3Chkd) {
                        if (reservedSeat.contains(GROUP_3[i]) && reservedSeat
                            .contains(Integer.toString(x))) {
                            availableGroups = availableGroups - 1;
                            block3Chkd = true;
                            break;
                        }
                    }
                }
            }
        }
        return availableGroups;
    }
}


