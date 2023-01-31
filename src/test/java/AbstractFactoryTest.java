import AbstractFactory.*;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void shouldCreateIranianTree(){
        IranianGardenFactory iranianGardenFactory = new IranianGardenFactory();
        Tree tree = iranianGardenFactory.createTree();
        Assert.assertEquals(tree.getClass(), IranianTree.class);
    }

    @Test
    public void shouldCreateIranianFlower(){
        IranianGardenFactory iranianGardenFactory = new IranianGardenFactory();
        Flower flower = iranianGardenFactory.createFlower();
        Assert.assertEquals(flower.getClass(), IranianFlower.class);

    }


    @Test
    public void shouldCreateJapaneseTree(){
        JapaneseGardenFactory japaneseGardenFactory = new JapaneseGardenFactory();
        Tree tree = japaneseGardenFactory.createTree();
        Assert.assertEquals(tree.getClass(), JapaneseTree.class);
    }

    @Test
    public void shouldCreateJapaneseFlower(){
        JapaneseGardenFactory japaneseGardenFactory = new JapaneseGardenFactory();
        Flower flower = japaneseGardenFactory.createFlower();
        Assert.assertEquals(flower.getClass(), JapaneseFlower.class);

    }

}
