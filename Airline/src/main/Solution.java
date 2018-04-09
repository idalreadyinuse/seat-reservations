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
            boolean block3Chkd = false;

            for (String reservedSeat : reservedSeatsList) {

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
                for (int i = 1; i <= 2; i++) {
                    if (reservedSeat.contains(GROUP_2[i]) && reservedSeat
                        .contains(Integer.toString(x))) {// Just looking for seat E or F
                        availableGroups = availableGroups - 1;
                        break;
                    }
                }
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


