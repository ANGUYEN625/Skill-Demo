import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest{
    @Test
    public void testConnectStr(){
        assertEquals("forty five", SkillDemo.connectStr("forty", "five"));
    }
}
