package main;

import java.math.BigInteger;

import static java.lang.Thread.*;

public class Timeout {

    public void simulateWork() throws InterruptedException {
        sleep(2000);
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }


    public void doWorkInfinity() {
        while(true) {
        }
    }
}