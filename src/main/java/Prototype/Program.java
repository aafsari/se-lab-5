package Prototype;

public abstract class Program {
    public String name;
    public String version;

    public Program(String name, String version){
        this.name = name;
        this.version = version;
    }
    public abstract Program clone();
    public abstract boolean equals(Program p);


}
