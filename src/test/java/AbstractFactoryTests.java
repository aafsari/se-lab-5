import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTests {

    @Test
    public void shouldCreateIranianTree(){
        IranianGardenFactory iranianGardenFactory = new IranianGardenFactory();
        Tree tree = iranianGardenFactory.createTree();
        Assert.assertEquals(tree.class, IranianTree.getClass());
    }

    @Test
    public void shouldCreateIranianFlower(){
        IranianGardenFactory iranianGardenFactory = new IranianGardenFactory();
        Flower flower = iranianGardenFactory.createFlower();
        Assert.assertEquals(flower.class, IranianFlower.getClass());

    }


    @Test
    public void shouldCreateJapaneseTree(){
        JapaneseGardenFactory japaneseGardenFactory = new JapaneseGardenFactory();
        Tree tree = japaneseGardenFactory.createTree();
        Assert.assertEquals(tree.class, JapaneseTree.getClass());
    }

    @Test
    public void shouldCreateJapaneseFlower(){
        JapaneseGardenFactory japaneseGardenFactory = new JapaneseGardenFactory();
        Flower flower = japaneseGardenFactory.createFlower();
        Assert.assertEquals(flower.class, JapaneseFlower.getClass());

    }

}
