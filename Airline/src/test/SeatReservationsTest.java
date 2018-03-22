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

}
