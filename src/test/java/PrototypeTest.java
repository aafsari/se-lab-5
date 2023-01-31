import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void shouldReturnSimilarData(){
        Program program = new Program("flash", "1.4", "adobe");
        Assert.assertTrue(program.equals(program.clone()));
    }

    @Test
    public void shouldReturnDifferentPointer(){
        Program program = new Program("flash", "1.4", "adobe");
        Assert.assertNotSame(program, program.clone());
    }

}
