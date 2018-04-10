package main;

public class Solution {

    public static int solution(int rows, String reservedSeats) {

        int availableGroups = rows * 3;

        if (reservedSeats != null && !reservedSeats.isEmpty()) {
            String[] reservedSeatsList = reservedSeats.split(" ");

            for (int x = 1; x <= rows; x++) {

                boolean block1Chkd = false;
                boolean block2Chkd = false;
                boolean block3Chkd = false;
                boolean seatDTaken = false;
                boolean seatGTaken = false;

                for (String reservedSeat : reservedSeatsList) {

                    String seatInRow = reservedSeat.substring(reservedSeat.length() - 1);
                    int rowNumberAsInt = Integer
                        .parseInt(reservedSeat.substring(0, reservedSeat.length() - 1));

                    // Checks to see if any seats in group 1 (A-C) are reserved
                    if (x == rowNumberAsInt) {
                        if (!block1Chkd) {
                            switch (seatInRow) {
                                case "A":
                                case "B":
                                case "C":
                                    availableGroups = availableGroups - 1;
                                    block1Chkd = true;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }

                    // Checks to see if any seats in group 2 (D-G) are reserved
                    if (x == rowNumberAsInt) {
                        if (!block2Chkd) {
                            switch (seatInRow) {
                                case "E":
                                case "F":
                                    availableGroups = availableGroups - 1;
                                    block2Chkd = true;
                                    break;
                                case "D":
                                    seatDTaken = true;
                                    break;
                                case "G":
                                    seatGTaken = true;
                                    break;
                                default:
                                    break;
                            }
                            // if both are reserved then Group check is done
                            if (seatDTaken && seatGTaken) {
                                availableGroups = availableGroups - 1;
                                block2Chkd = true;
                            }
                        }
                    }

                    // Checks to see if any seats in group 3 (H-K) are reserved
                    if (x == rowNumberAsInt) {
                        if (!block3Chkd) {
                            switch (seatInRow) {
                                case "H":
                                case "J":
                                case "K":
                                    availableGroups = availableGroups - 1;
                                    block3Chkd = true;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                }
            }
        }
        return availableGroups;
    }
}


