package Prototype;

public class App extends Program{
    public String author;

    public App(String name,String version,String author){
        super(name, version);
        this.author = author;

    }

    @Override
    public Program clone() {
        return new App(this.name, this.version, this.author);
    }

    public boolean equals(Program p) {
        if (p.getClass() != App.class)
            return false;
        return p.name.equals(this.name)  && p.version.equals(this.version) && this.author.equals(((App )p).author);
    }
}
