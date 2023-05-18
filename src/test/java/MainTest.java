import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testResta(){
        int resultado = Main.resta(7, 6);
            assertEquals(resultado, 1);
    }
}