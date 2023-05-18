import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testResta(){
        int resultado = Main.resta(7, 6);
            assertEquals(resultado, 1);
    }
}