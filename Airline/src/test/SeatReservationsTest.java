package test;

import static main.Solution.solution;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SeatReservationsTest {

    @Test
    public void testOneRowNoReservedShouldReturnThree() {

        int result = solution(1,"");

        assertThat(result, equalTo(3));
    }

    @Test
    public void testTwoRowsNoReservedShouldReturnSix() {

        int result = solution(2, "");

        assertThat(result, equalTo(6));
    }

    @Test
    public void testOneRow_Seat1A_ReservedShouldReturnTwo() {

        int result = solution(1, "1A");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seats1C_1A_ReservedShouldReturnTwo() {

        int result = solution(1, "1C 1A");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1K_ReservedShouldReturnTwo() {
        int result = solution(1, "1K");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1E_ReservedShouldReturnTwo() {
        int result = solution(1, "1E");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1F_ReservedShouldReturnTwo() {
        int result = solution(1, "1F");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seats1A_1K_ReservedShouldReturnOne() {

        int result = solution(1, "1A 1K");

        assertThat(result, equalTo(1));
    }

    @Test
    public void testOneRow_Seat1D_ReservedShouldReturnThree() {
        int result = solution(1, "1D");

        assertThat(result, equalTo(3));
    }

    @Test
    public void testOneRow_Seat1E_1C_1J_ReservedShouldReturnZero() {
        int result = solution(1,"1E 1C 1J");

        assertThat(result, equalTo(0));
    }

    @Test
    public void testTwoRows_Seat1A_ReservedShouldReturnFive() {
        int result = solution(2,"1A");

        assertThat(result, equalTo(5));
    }

    @Test
    public void testTwoRows_Seat1A_2A_ReservedShouldReturnFour() {
        int result = solution(2,"1A 2A");

        assertThat(result, equalTo(4));
    }

    @Test
    public void testTwoRows_Seat1E_ReservedShouldReturnFive() {
        int result = solution(2,"1E");

        assertThat(result, equalTo(5));
    }

    @Test
    public void testTwoRows_Seat1J_1K_ReservedShouldReturnFive() {
        int result = solution(2,"1K 1J");

        assertThat(result, equalTo(5));
    }

    @Test
    public void testTwoRows_Seat1A_2F_1C_ReservedShouldReturnFour() {
        int result = solution(2,"1A 2F 1C");

        assertThat(result, equalTo(4));
    }

    @Test
    public void testThreeRows_Seat1A_2F_1C_3A_3C_3H_3K_ReservedShouldReturnFour() {
        int result = solution(3,"1A 2F 1C 3A 3H 3C 3K");

        assertThat(result, equalTo(5));
    }

    @Test
    public void testOneRow_Seat1D_1G_ReservedShouldReturnTwo() {
        int result = solution(1,"1D 1G");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testOneRow_Seat1E_1F_ReservedShouldReturnTwo() {
        int result = solution(1,"1F 1E");

        assertThat(result, equalTo(2));
    }

    @Test
    public void testTwoRows_Seat1D_1G_2A_2E_ReservedShouldReturnThree() {
        int result = solution(2,"2A 1G 1D 2E");

        assertThat(result, equalTo(3));
    }

    @Test
    public void testTwoRows_Seat1E_1F_ReservedShouldReturnFive() {
        int result = solution(2,"1F 1E");

        assertThat(result, equalTo(5));
    }

    @Test
    public void testTwoRows_Seat1A_2A_1D_2D_2G_1K_2K_ReservedShouldReturnOne() {
        int result = solution(2,"1A 2A 1D 2D 2G 1K 2K");

        assertThat(result, equalTo(1));
    }

    @Test
    public void testOneRow_Seat1E_1G_ReservedShouldReturnTwo() {
        int result = solution(1,"1G 1E");

        assertThat(result,equalTo(2));
    }

    @Test
    public void testTwoRows_Seat1E_2G_ReservedShouldReturnFive() {
        int result = solution(2,"2G 1E");

        assertThat(result,equalTo(5));
    }

    @Test
    public void testManyRows_ManySeats() {
//        int result = solution(10, "1A 2B 3C 4D 5E 6F 7G 8H 9J 10K");
        int result = solution(10, "10E");

        assertThat(result, equalTo(29));
    }

//    2 2 2 3 2 2 3 2 2 2

}

