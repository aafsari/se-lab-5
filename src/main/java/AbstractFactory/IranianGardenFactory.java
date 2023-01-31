package AbstractFactory;

public class IranianGardenFactory extends AbstractGardenFactory{
    @Override
    public Flower createFlower() {
        return new IranianFlower();
    }

    @Override
    public Tree createTree() {
        return new IranianTree();
    }
}
