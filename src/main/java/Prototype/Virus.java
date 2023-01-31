package Prototype;

public class Virus extends Program{
    public Virus(String name, String version){
        super(name, version);
    }

    @Override
    public Program clone() {
        return this ;
    }

    @Override
    public boolean equals(Program p) {
        return false;    }
}
