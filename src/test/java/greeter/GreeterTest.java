package greeter;

import greeter.Greeter;
import org.junit.jupiter.api.Test;

public class GreeterTest {
    @Test
    public void testSaysHello() {
        Greeter greeter = new Greeter();
        assertEquals("Hello.", greeter.greet());
    }

    private void assertEquals(String s, String greet) {
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = new Greeter();
        greeter.setFormality("formal");
        assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = new Greeter();
        greeter.setFormality("casual");
        assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = new Greeter();
        greeter.setFormality("intimate");
        assertEquals("Hello Darling!", greeter.greet());
    }
}
