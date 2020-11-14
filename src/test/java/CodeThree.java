/*
* In this exercise, I will practice simple mathematics using assertEquals
* My first Test
*
* addition - 55+66
* subtraction - 99-33
* multiplication - 10*10
* division - 99/33
* Math.pow
* Math.sqrt
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodeThree {

    public static void main(String[] args) {

    }

    @Test
    public void testRoot() {
        double expected = 0;
        assertEquals(3,Math.sqrt(9));
        System.out.println("This is true!");
    }
    @Test
    public void testExp() {
        double expected = 0;
        assertEquals(1953125, Math.pow(5,9));
        System.out.println("This is true!");
    }
    @Test
    public void testQuote() {
        int expected = 0;
        int quote1 = 99;
        int quote2 = 33;
        assertEquals(3, quote1/quote2);
        System.out.println("This is true!");
    }
    @Test
    public void testProduct() {
        int expected = 0;
        int product1 = 10;
        int product2 = 10;
        assertEquals(100, product1*product2);
        System.out.println("This is true!");
    }
    @Test
    public void testDiff() {
        int expected = 0;
        int diff1 = 99;
        int diff2 = 33;
        assertEquals(66, diff1-diff2);
        System.out.println("This is true!");
    }
    @Test
    public void testSum() {
        int expected = 0;
        int sum1 = 55;
        int sum2 = 66;
        assertEquals(121, sum1+sum2);
        System.out.println("This is true!");

    }



}

