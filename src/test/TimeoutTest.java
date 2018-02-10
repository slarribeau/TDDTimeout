package test;
import static org.junit.Assert.*;
import main.Timeout;
import org.junit.Test;

public class TimeoutTest {

    @Test(timeout = 1000)
    public void testShort() {
        Timeout t = new Timeout();
        t.doWorkShort();
    }

    @Test(timeout = 1000)
    public void testInfinity() {
        Timeout t = new Timeout();
        t.doWorkInfinity();
    }
}