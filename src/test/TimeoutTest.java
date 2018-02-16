package test;
import static org.junit.Assert.*;
import main.Timeout;
import org.junit.Test;

import java.math.BigInteger;
import java.sql.Time;

public class TimeoutTest {

    @Test(timeout = 1000)
    public void testInfinity() {
        Timeout t = new Timeout();
        t.doWorkInfinity();
    }

    @Test
    public void getTinyFactorialNoTimeout() {
        Timeout t = new Timeout();
        BigInteger n = BigInteger.valueOf(4);
        BigInteger r = t.factorial(n);
        assertEquals(BigInteger.valueOf(24), r);
    }

    @Test
    public void getSmallFactorialNoTimeout() {
        Timeout t = new Timeout();
        BigInteger n = BigInteger.valueOf(128);
        BigInteger r = t.factorial(n);
    }

    @Test (timeout=1)
    public void getSmallFactorialWithTimeout() {
        Timeout t = new Timeout();
        BigInteger n = BigInteger.valueOf(64);
        BigInteger r = t.factorial(n);
    }
    @Test
    public void getBigFactorialNoTimeout() {
        Timeout t = new Timeout();
        BigInteger n = BigInteger.valueOf(100000);
        BigInteger r = t.factorial(n);
        System.out.println(r);
    }

    @Test(timeout=4000)
    public void getBigFactorialWithTimeout() {
        Timeout t = new Timeout();
        BigInteger n = BigInteger.valueOf(100000);
        BigInteger r = t.factorial(n);
        System.out.println(r);
    }

    @Test (timeout=1000)
    public void testSleep() throws InterruptedException {
        Timeout t = new Timeout();
        t.simulateWork();
    }

    @Test ()
    public void testSleepNoTimeout() throws InterruptedException {
        Timeout t = new Timeout();
        t.simulateWork();
    }
}