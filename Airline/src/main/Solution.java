package main;

public class Solution {

    public static int solution(int rows, String reservedSeats) {

        int availableGroups = rows * 3;

        if (reservedSeats != null && !reservedSeats.isEmpty()) {
            String[] reservedSeatsList = reservedSeats.split(" ");

            for (int x = 1; x <= rows; x++) {

                boolean block1Chkd = false;     // Seats A B & C
                boolean block2Chkd = false;     // Seats D E F & G
                boolean block3Chkd = false;     // Seats H J K
                boolean seatDTaken = false;
                boolean seatGTaken = false;

                for (String reservedSeat : reservedSeatsList) {

                    String seatInRow = reservedSeat.substring(reservedSeat.length() - 1);
                    int rowNumberAsInt = Integer
                        .parseInt(reservedSeat.substring(0, reservedSeat.length() - 1));

                    if (x == rowNumberAsInt) {
                        switch (seatInRow) {
                        // First block checks
                            case "A":
                            case "B":
                            case "C":
                                if (!block1Chkd) {
                                    availableGroups = availableGroups - 1;
                                    block1Chkd = true;
                                }
                                break;
                        // Second block checks
                            case "D":
                                seatDTaken = true;
                                break;
                            // If either E or F reserved then second block is not available
                            case "E":
                            case "F":
                                if (!block2Chkd) {
                                    availableGroups = availableGroups - 1;
                                    block2Chkd = true;
                                }
                                break;
                            case "G":
                                seatGTaken = true;
                                break;
                        // Third block checks
                            case "H":
                            case "J":
                            case "K":
                                if (!block3Chkd) {
                                    availableGroups = availableGroups - 1;
                                    block3Chkd = true;
                                }
                                break;
                            default:
                                break;
                        }
                        // if both are seats D & G are reserved then second block is not available
                        if (seatDTaken && seatGTaken) {
                            if (!block3Chkd) {
                                availableGroups = availableGroups - 1;
                                block2Chkd = true;
                            }
                        }
                    }
                }
            }
        }
        return availableGroups;
    }
}


