package test;

import static main.SeatReservations.noOfAvailableThreeTogether;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SeatReservationsTest {

    @Test
    public void testOneRowNoReservedShouldReturnThree() {

        int result = noOfAvailableThreeTogether(1,"");

        assertThat(result, equalTo(3));
    }

    @Test
    public void testTwoRowsNoReservedShouldReturnSix() {

        int result = noOfAvailableThreeTogether(2, "");

        assertThat(result, equalTo(6));
    }

    @Test
    public void testOneRow_Seat1A_ReservedShouldReturnTwo() {

        int result = noOfAvailableThreeTogether(1, "1A");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1K_ReservedShouldReturnTwo() {
        int result = noOfAvailableThreeTogether(1, "1K");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1E_ReservedShouldReturnTwo() {
        int result = noOfAvailableThreeTogether(1, "1E");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1F_ReservedShouldReturnTwo() {
        int result = noOfAvailableThreeTogether(1, "1F");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seats1A_1K_ReservedShouldReturnOne() {

        int result = noOfAvailableThreeTogether(1, "1A 1K");

        assertThat(result, equalTo(1));
    }

    @Test
    public void testOneRow_Seat1D_ReservedShouldReturnThree() {
        int result = noOfAvailableThreeTogether(1, "1D");

        assertThat(result, equalTo(3));
    }
}
