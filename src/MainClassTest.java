import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainClassTest {
    @Test
    public void testGetLocalNumber() {
        MainClass mainClass = new MainClass();
        int expected = 14;
        int actual = mainClass.getLocalNumber();

        assertEquals("Метод getLocalNumber должен возвращать 14", expected, actual);
    }

    @Test
    public void testGetClassNumber() {
        MainClass mainClass = new MainClass();
        int result = mainClass.getClassNumber();

        assertTrue("Метод getClassNumber должен возвращать число больше 45, фактическое число: " + result, result > 45);
    }
}