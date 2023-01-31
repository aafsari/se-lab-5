package AbstractFactory;

public class JapaneseGardenFactory extends AbstractGardenFactory{
    @Override
    public Flower createFlower() {
        return new JapaneseFlower();
    }

    @Override
    public Tree createTree() {
        return new JapaneseTree();
    }
}
