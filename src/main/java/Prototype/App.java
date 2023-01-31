package Prototype;

public class App extends Program{
    public String author;

    public App(String name,String version,String author){
        super(name, version);
        this.author = author;

    }

    @Override
    public Program clone() {
        return this;
    }

    public boolean equals(Program p) {
        return false;
    }
}
