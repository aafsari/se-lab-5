import Prototype.App;
import Prototype.Program;
import Prototype.Virus;
import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void shouldReturnSimilarAppData(){
        Program program = new App("flash", "1.4", "adobe");
        Assert.assertTrue(program.equals(program.clone()));
    }

    @Test
    public void shouldReturnDifferentAppPointer(){
        Program program = new App("flash", "1.4", "adobe");
        Assert.assertNotSame(program, program.clone());
    }


    @Test
    public void shouldReturnSimilarVirusData(){
        Program program = new Virus("iloveyou", "0.4");
        Assert.assertTrue(program.equals(program.clone()));
    }

    @Test
    public void shouldReturnDifferentVirusPointer(){
        Program program = new Virus("iloveyou", "0.4");
        Assert.assertNotSame(program, program.clone());
    }

}
