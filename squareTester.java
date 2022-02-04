//imports necessary JUnit tester addons
import static org.junit.Assert.*;
import org.junit.*;

public class squareTester {
    
    @Test
    public void squaring(){
        assertEquals(4, square.getTheSquare(4));
    }
}
